/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import tree.SubNodo;

/**
 *
 * @author rpayan
 */
public class Pack {
    
    ArrayList<Task> tasks = new ArrayList<>();
    Project project;
    String name;
    SubNodo subnativo;

    public Pack(Project project, String name) {
        this.project = project;
        this.name = name;
    }

    public Pack(Project project, String name, SubNodo subnativo) {
        this.project = project;
        this.name = name;
        this.subnativo = subnativo;
    }
    
    
    
//______________________________________________________________________________    
    
    public void addTask(Task task)
    {
        SubNodo nuevo = new SubNodo(task);
        subnativo.add(nuevo);
        tasks.add(task);
        task.nativo = nuevo;
    }
    
    
    
}
