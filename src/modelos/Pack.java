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
    /**
     * Agrega una tarea al paquete de trabajo.
     * @param task:tarea
     */
    public void addTask(Task task)
    {
        SubNodo nuevo = new SubNodo(task);
        task.nativo = nuevo;
        nuevo.setInfo(task);
        task.setPack(this);
        subnativo.add(nuevo);
        tasks.add(task);
        
    }
    
    public ArrayList<Task> getTasks() {
        return tasks;
    }
    
    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubNodo getSubnativo() {
        return subnativo;
    }

    public void setSubnativo(SubNodo subnativo) {
        this.subnativo = subnativo;
    }
    
    
    
    
}
