/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wbs;

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
    
    
}
