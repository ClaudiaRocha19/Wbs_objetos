/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import tree.Nodo;
import wbs.Wbs;

/**
 *
 * @author rpayan
 */
public final class Admin extends User{
    
    ArrayList<User> collaborators = new ArrayList<>();
    ArrayList<Project> projects = new ArrayList<>();
    
    public Admin(String name) {
        super(name);
    }
    
    public void addProject(Project project)
    {
        this.projects.add(project);
    }
    
    
    
    
    
}
