/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author rpayan
 */
public class Pack {
    
    ArrayList<Task> tasks = new ArrayList<>();
    Project project;
    
//______________________________________________________________________________    
    
    public void addTask(Task task)
    {
        tasks.add(task);
    }
    
    
    
}
