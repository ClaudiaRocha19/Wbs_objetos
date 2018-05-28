/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import java.util.ArrayList;

/**
 *
 * @author ESTU-5K
 */
public class SubNodo extends Nodo{
    
    private Nodo sup;
    
    public SubNodo(Object info, Nodo sup) 
    {    
        super(info);
        this.sup=sup;
        this.level = sup.getLevel()+1;
        
    }

    public SubNodo(Object info) 
    {    
        super(info);
        this.level = sup.getLevel()+1;
        
    }

    public SubNodo() {
    }

    
//BASICS________________________________________________________________________

    @Override
    public boolean equals(Object anObject)
    {
        if(anObject instanceof Nodo)
        {
            if ((SubNodo)anObject==this) 
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
        return "sub nodo: "+this.getInfo().toString() + "   //  " +this.hashCode();
    }
    
//USABLE METHODS____________________________________________________________-___
    
    public void del()
    {
        ArrayList<SubNodo> nueva=new ArrayList();
        
        for (SubNodo sub : this.sup.subs) 
        {
            if (!sub.equals(this)) 
            {
                nueva.add(sub);
            }
        }
        
        this.sup.subs = new ArrayList();
        this.sup.subs = nueva;
    }
        
//______________________________________________________________________________
    
    public Nodo getSup() {
        return sup;
    }

    public void setSup(Nodo sup) {
        this.sup = sup;
    }

    public int getLevel() {
        return level;
    }
    
    
    
    
}
