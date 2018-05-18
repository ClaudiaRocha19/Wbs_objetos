/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wbs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import prin.pg_login;

/**
 *
 * @author RICARDO
 */
public class Wbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pgl = new pg_login();
        pgl.setVisible(true);
        
    }
    
    public static boolean open_vtn=false;
    public static pg_login pgl;
    
//USABLE METHODS________________________________________________________________    
    
    public static boolean isInFile(String compare, String fileName)
            throws IOException
    {
        int sepPos;
        String line;
        BufferedReader read = new BufferedReader(new FileReader(fileName));
        
        while((line=read.readLine())!=null)
        {
            sepPos=line.indexOf(",");
            if (line.substring(0, sepPos).equals(compare)) 
            {
                return true;
            }
        }
            
        return false;
    }
    
    public void addToFile(String line,String fileName) 
            throws IOException
    {
        PrintWriter e = new PrintWriter(new BufferedWriter(new FileWriter(fileName,true)));
        e.print(line);
    }
    
    
}
