/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rpayan
 */
public class Cronograma {
    
    public ArrayList<Task> tasks = new ArrayList<>();
    //public ArrayList<Date> others = new ArrayList<>();
    private Project project;
    
    public Cronograma() {
    }
    
//USABLE METHODS________________________________________________________________
    
    public void addTask(Task task)
    {
        tasks.add(task);
    }
    
    
}
