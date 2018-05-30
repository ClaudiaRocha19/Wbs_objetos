/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ESTU-5K
 */
public class Nodo{
    
    protected ArrayList<SubNodo> subs = new ArrayList<>();;
    protected Object info;
    protected int level;
    
    public Nodo(Object info) 
    {
        this.info = info;
        level = new Integer(1);
    }

    public Nodo() {
    }
    
    
    
//BASICS________________________________________________________________________
    
    public Object sub(int index)
    {
        return subs.get(index).getInfo();
    }
    
    public Nodo sub(Object infor)
    {
        for (SubNodo sub : subs) 
        {
            if (sub.getInfo().equals(infor)) 
            {
                return sub;
            }
        }
        
        return null;
    }
    
    @Override
    public boolean equals(Object anObject)
    {
        if(anObject instanceof Nodo)
        {
            if ((Nodo)anObject==this) 
            {
                return true;
            }
                
            if (this.getInfo().equals((Nodo)((Nodo) anObject).getInfo())) 
            {
                return true;
            }    
        }
        
        return false;
    }

    @Override    
    public String toString()
    {
        return "nodo: "+this.getInfo()+ "   //  " +this.hashCode();
    }
    
//USABLE METHODS________________________________________________________________    
    
    public void add( Object infor )
    {
        add(new SubNodo(infor,this));
    }
    
    public void add( SubNodo subNodo )
    {
        this.subs.add(subNodo);
    }
    
    public void del(SubNodo subNodo)
    {
        subNodo.del();
    }
    
    public void print()
    {
        System.out.println("\nESTRUCTURA RAMIFICADA DEL ARBOL\n");
        recursivePrint(this,0);
    }
    
    public void recursivePrint(Nodo sb, int tabs)
    {
        for (int i = 0; i < tabs; i++) 
        {
            System.out.print("    ");
        }
        
        System.out.println(sb.getLevel()+" "+sb);
        
        if (sb.subs!=null) 
        {    
            for (SubNodo sub : sb.subs) 
            {
                recursivePrint(sub,tabs+1);
            }    
        }
        
        System.out.println(sb.level==2? "---> final de la rama\n": ""); 
        
    }
    
//______________________________________________________________________________

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public int getLevel() {
        return level;
    }

//WBS METHODS___________________________________________________________________

    java.io.BufferedWriter saver;
    
    public void save(java.io.FileWriter archivo) 
            throws IOException
    {
        saver = new java.io.BufferedWriter(archivo);
        System.out.println("\nESTRUCTURA RAMIFICADA DEL ARBOL\n");
        recursiveSave(this,0);
        saver.close();
    }
    
    private void recursiveSave(Nodo sb, int tabs)
            throws IOException
    {
        for (int i = 0; i < tabs; i++) 
        {
            System.out.print("    ");
            saver.write("-");
        }
        saver.write(sb.toStringWbs());
        saver.newLine();
        System.out.println(sb.getLevel()+" "+sb);
        
        if (sb.subs!=null) 
        {    
            for (SubNodo sub : sb.subs) 
            {
                recursiveSave(sub,tabs+1);
            }    
        }
        
        System.out.println(sb.level==2? "---> final de la rama\n": ""); 
        
    }
    
    protected String toStringWbs()
    {
        if (this.getInfo() instanceof modelos.Project) 
        {
            return ((modelos.Project)this.getInfo()).getName();
        }
        else if(this.getInfo() instanceof modelos.Pack)
        {
            return ((modelos.Pack)this.getInfo()).getName();
        }
        else if(this.getInfo() instanceof modelos.Task)
        {
            modelos.Task task = ((modelos.Task)this.getInfo());
            return task.toString();
        }
        else
        {
            System.out.println("objeto no reconocido");
            return "objeto desconocido";
        }
    }
    
    
}
