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
    Nodo nativo;

    public Project(String name, Nodo nativo) {
        this.name = name;
        this.nativo = nativo;
    }
    
    public Project(String name) {
        this.name = name;
    }
    
    public void addPack(String name)
    {
        SubNodo sn = new SubNodo();
        Pack nuevo = new Pack(this, name, sn);
        nativo.add(sn);
        
        packs.add(nuevo);
    }
    
}
