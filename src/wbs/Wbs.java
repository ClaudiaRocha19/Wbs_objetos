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
import mail.*;
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
        
        pgl = new pg_login();
        pgl.setVisible(true);
        

    }
    
    public static boolean open_vtn=false;
    public static pg_login pgl;
    
    public static  Nodo tree = new Nodo();
    
    
    private MailService ms= new MailService();
    
//USABLE METHODS________________________________________________________________    
    
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
    
    public ArrayList<String> separar(String linea)
    {
        return separeRecursive(linea,new ArrayList<String>());
    }
    
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
    
    public void addToFile(String line,String fileName) 
            throws IOException
    {
        BufferedWriter e = new BufferedWriter(new FileWriter(fileName,true));
        e.write(line);
        e.newLine();
       
        e.close();
    }
    
    
    public boolean welcomeMail(String destiny, String name)
    {
        try
        {
            if(ms.sendMail
                (
                    new MailModel
                    (
                        "Bienvenido a WBS project management "+name,
                        "Gracias por registrarse en WBS "
                            +name
                            +" /nle mantendremos informado sobre actualizaciones en tus proyectos ",
                        destiny
                    )
                ))
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
    
}
