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
    
    public void createProject(String name)
    {
        
        Project principal = new Project(name,Wbs.tree);
        Wbs.tree = new Nodo(principal);
        projects.add(principal);
        System.out.println("proyecto creado con éxito");
    }
    
    
    
    
    
}
