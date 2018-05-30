/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wbs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import mail.*;
import modelos.*;
import prin.pg_adminprin;
import prin.pg_login;
import tree.Nodo;

/**
 *
 * @author RICARDO
 */
public class Wbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tree.setInfo(new Project("",tree));
        pgl = new pg_login();
        pgl.setVisible(true);
        

    }
    
    //public static boolean open_vtn=false;
    public static pg_login pgl;
    public static JFrame savedParameters;
    public static  Nodo tree = new Nodo();
    public static User user;
    public static Admin admin;
    
    public MailService ms= new MailService();
    
//USABLE METHODS________________________________________________________________    
    
    /**
     * verifica si el parámetro ya se encuentra en el primer campo de una linea de un archivo
     * @param compare _ parámetro de comparación
     * @param fileName _ nombre del archivo
     * @return
     * @throws IOException 
     */
    public boolean isInFile(String compare, String fileName)
            throws IOException
    {
        int sepPos;
        
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        
        String line=read.readLine();
        
        while(line!= null && !line.isEmpty())
        {
            sepPos=line.indexOf(",");
            System.out.println("Seppos "+line.length());
            if (line.substring(0, sepPos).equals(compare))
            {
                return true;
            }
            line=read.readLine();
        }
        read.close();
        return false;
    }
    
    /**
     * separa los campos de un registro en un ArrrayList
     * @param linea
     * @return 
     */
    public ArrayList<String> separar(String linea)
    {
        return separeRecursive(linea,new ArrayList<String>());
    }
    
    /**
     * función recursiva para separado de campos
     * @param linea
     * @param campos
     * @return 
     */
    private ArrayList<String> separeRecursive(String linea, ArrayList<String> campos)
    {
        int sep = linea.indexOf(",");
        
        if (sep==-1) 
        {
            return campos;
        }
        else
        {
            System.out.println(sep);
            campos.add(linea.substring(0,sep));
            return separeRecursive(linea.substring(sep+1),campos);
        }
        
    }
    
    /**
     * Agrega una linea a un archivo
     * @param line
     * @param fileName
     * @throws IOException 
     */
    public void addToFile(String line,String fileName) 
            throws IOException
    {
        BufferedWriter e = new BufferedWriter(new FileWriter(fileName,true));
        e.write(line);
        e.newLine();
       
        e.close();
    }
    
    /**
     * regresa la lista de usuarios con nombres que empiezen con el parámetro base
     * @param base
     * @return 
     */
    public ArrayList<String> getRelativeUsers(String base)
    {
        try 
        {
            ArrayList<String> relatives = new ArrayList<>();
            BufferedReader leer = new BufferedReader(new FileReader("usuarios.txt"));
            String comparable;
            
            while((comparable=leer.readLine())!=null)
            {
                String section=comparable.substring(0, comparable.indexOf(","));
                
                if (section.startsWith(base)) 
                {
                    relatives.add(section);
                    //System.out.println(section);
                }
            }
            return relatives;
        }
        catch (IOException ioe) 
        {
            System.out.println("error en la lectura del archivo");
            ioe.printStackTrace();
        }
        catch(NullPointerException npe)
        {
            System.out.println("no se envió ninguna cadena al método");
        }
        return null;
    }
    
    /**
     * envía el mail de bienvenida al registrar un usuario
     * @param destiny
     * @param name
     * @return 
     */
    public boolean welcomeMail(String destiny, String name)
    {
        try
        {
            if(ms.sendMail(new MailModel(MailType.WELCOME,destiny,name,"")))
            {    
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(Exception me)
        {
            System.out.println("error interno del envio de mensaje : ");
            me.printStackTrace();
            return false;
        }
    }

//PROJECT METHODS_______________________________________________________________
    
    public void createProject(Project project)
    {
        this.admin.addProject(project);
        openProject(project);
    }
    
    public void openProject(Project project)
    {
        // pendiente diseño y aplicación de ventana
        if (project.getPacks().isEmpty()) 
        {
            System.out.println("nuevo proyecto creado");
        }
        else
        {
            try 
            {
                BufferedReader carga = new BufferedReader(
                    new FileReader(
                    "allusers/"
                    +user.getName()
                    +"/"+project.getName()+".txt"));
                    
                    ArrayList<String> campos;
                    String linea;
                    Pack pack= new Pack();
                    
                    while((linea=carga.readLine())!=null)
                    {
                        if (linea.startsWith("--")) 
                        {
                            linea=linea.substring(2);
                            campos=separar(linea);
                            pack.addTask(new Task(
                                    searchCol(campos.get(0)),
                                    detFecha(campos.get(1)),
                                    detFecha(campos.get(2)),
                                    campos.get(3),
                                    detPrioridad(campos.get(4))
                            ));
                        }
                        else if(linea.startsWith("-"))
                        {
                            linea=linea.substring(1);
                            project.addPack(linea);
                            pack=project.getPacks().get(project.getPacks().size()-1);
                        }
                        else
                        {
                            project.setNativo(tree);
                            
                                BufferedReader lector = new BufferedReader(
                                        new FileReader(
                                        "allusers/"
                                        +user.getName()
                                        +"/"+project.getName()+"colaborators.txt"));

                                String colab;
                                while((colab= lector.readLine())!=null)
                                {
                                    project.addcol(new User(colab));
                                }
                                
                                lector.close();
                                
                            tree.setInfo(project);
                        }
                        
                    }
                
                
                carga.close();
            }
            catch (Exception e) 
            {
                
            }
            
        }
        pg_adminprin pgp = new pg_adminprin();
        pgp.setNombre(project.getName());
        pgp.setVisible(true);
        savedParameters.setVisible(false);
        
    }
    
    public void saveProject()
    {
        try 
        {
            //guardar el arbol de proyecto
            tree.save(new FileWriter(
                    "allusers/"
                    +user.getName()
                    +"/"+((Project)tree.getInfo()).getName()+".txt"));
            
            //guardar los colaboradores
            BufferedWriter escColaboradores = new BufferedWriter(
                    (new FileWriter(
                    "allusers/"
                    +user.getName()
                    +"/"+((Project)tree.getInfo()).getName()+"colaborators.txt")));
            
            for (User col : ((Project)tree.getInfo()).getCols()) 
            {
                escColaboradores.write(col.getName());
                escColaboradores.newLine();
            }
            
            escColaboradores.close();
            
            BufferedWriter agregarproyecto = new BufferedWriter(
                    new FileWriter("allusers/"
                    +user.getName()
                    +"/projectindex.txt",true));
            
            agregarproyecto.write(((Project)tree.getInfo()).getName());
            agregarproyecto.newLine();
            agregarproyecto.close();
        }
        catch (IOException ioe) 
        {
            System.out.println("Error en la escritura de archivo:");
            ioe.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("Errores no relacionados");
            e.printStackTrace();
        }
        
    }
    
    private Prioridad detPrioridad(String linea)
    {
        if (linea.equals("ALTA")) 
        {
            return Prioridad.ALTA;
        }
        else if(linea.equals("MEDIA"))
        {
            return Prioridad.MEDIA;
        }
        else
        {
            return Prioridad.BAJA;
        }
    }
    
    private Date detFecha(String linea)
    {
        int year,month,day;
        
        year= Integer.parseInt(linea.substring(0, linea.indexOf("/")));
        linea=linea.substring(0, linea.indexOf("/")+1);
        month= Integer.parseInt(linea.substring(0, linea.indexOf("/")));
        linea=linea.substring(0, linea.indexOf("/")+1);
        day= Integer.parseInt(linea);
        
        return new Date(year,month,day);
    }
    
    public Pack searchPack(String packName)
    {
        for (Pack pack : ((Project)Wbs.tree.getInfo()).getPacks()) 
        {
            if (pack.getName().equals(packName)) 
            {
                return pack;
            }
        }
        return null;
    }
    
    public User searchCol(String colName)
    {
        for (User col : ((Project)Wbs.tree.getInfo()).getCols()) 
        {
            if (col.getName().equals(colName)) 
            {
                return col;
            }
        }
        return null;
    }
    
}
