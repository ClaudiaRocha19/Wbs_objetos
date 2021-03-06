/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import tree.Nodo;
import tree.SubNodo;

/**
 *
 * @author rpayan
 */
public class Project {
    
    String  name;
    ArrayList<Pack> packs = new ArrayList<>();
    ArrayList<User> cols = new ArrayList<>();
    Nodo nativo;

    public Project(String name, Nodo nativo) {
        this.name = name;
        this.nativo = nativo;
        nativo.setInfo(this);
    }
    
    public Project(String name) {
        this.name = name;
    }
    /**
     * Agrega un paquete al arbol de trabajo(proyecto).
     * @param name:nombre
     */
    public void addPack(String name)
    {
        SubNodo sn = new SubNodo();
        sn.setLevel(2);
        Pack nuevo = new Pack(this, name, sn);
        sn.setInfo(nuevo);
        nativo.add(sn);
        
        packs.add(nuevo);
    }
    /**
     * Agrega un colaborador a los existentes.
     * @param us:usuario
     */
    public void addcol(User us)
    {
        cols.add(us);
    }
    /**
     * Agrega varios colaboradores al mismo arreglo.
     * @param users 
     */
    public void addcols(ArrayList<String> users)
    {
        for (String user : users) 
        {
            addcol(new User(user));
        }
    }        
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pack> getPacks() {
        return packs;
    }

    public void setPacks(ArrayList<Pack> packs) {
        this.packs = packs;
    }

    public ArrayList<User> getCols() {
        return cols;
    }

    public void setCols(ArrayList<User> cols) {
        this.cols = cols;
    }

    public Nodo getNativo() {
        return nativo;
    }

    public void setNativo(Nodo nativo) {
        this.nativo = nativo;
    }
    
    
    
}
