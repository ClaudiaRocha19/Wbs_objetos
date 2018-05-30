/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;
import tree.SubNodo;

/**
 *
 * @author rpayan
 */
public class Task {

    private User    attendant;
    
    private Date    startDate,
                    endDate;
    
    private String  taskName;
    
    private Pack    pack;

    private Prioridad prioridad;
    
    SubNodo nativo;

    public Prioridad getPrioridad() {
        return prioridad;
    }

    
    public Task(User attendant, Date startDate, Date endDate, String taskName,Prioridad prioridad) 
    {
        this.attendant = attendant;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskName = taskName;
        this.prioridad = prioridad;
    }
    
    public Task(User attendant, Date startDate, Date endDate, String taskName, Pack pack) 
    {
        this.attendant = attendant;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskName = taskName;
        this.pack = pack;
        pack.addTask(this);
    }

    public Task(User attendant, Date startDate, Date endDate, String taskName, Pack pack, SubNodo nativo) {
        this.attendant = attendant;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskName = taskName;
        this.pack = pack;
        this.nativo = nativo;
        pack.addTask(this);
    }
    
    
    
//______________________________________________________________________________    

    @Override
    public String toString()
    {
        //User attendant, Date startDate, Date endDate, String taskName,Prioridad prioridad
        return 
                this.attendant.getName()+","+
                String.valueOf(this.startDate.getYear())+"/"+
                String.valueOf(this.startDate.getMonth())+"/"+
                String.valueOf(this.startDate.getDay())+","+
                String.valueOf(this.endDate.getYear())+"/"+
                String.valueOf(this.endDate.getMonth())+"/"+
                String.valueOf(this.endDate.getDay())+","+
                this.taskName+","+
                this.prioridad;
    }
    
    
    public User getAttendant() {
        return attendant;
    }

    public void setAttendant(User attendant) {
        this.attendant = attendant;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }
    
    
    
}
