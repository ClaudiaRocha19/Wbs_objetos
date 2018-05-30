/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelos.Pack;
import modelos.Prioridad;
import modelos.Project;
import modelos.Task;
import wbs.Wbs;


/**
 *
 * @author Leonidas
 */
public class pnl_admaddtarea extends javax.swing.JPanel {

    /**
     * Creates new form pnl_admaddtarea
     */
    public pnl_admaddtarea() {
        initComponents();
        combo_prioridad.addItem("Alta");
        combo_prioridad.addItem("Media");
        combo_prioridad.addItem("Baja");
        poblar_paquetes();
    }

    private void poblar_paquetes()
    {
        for (Pack pack : ((Project)Wbs.tree.getInfo()).getPacks()) 
        {
            combo_paquete.addItem(pack.getName());
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo_paquete = new rojerusan.RSComboMetro();
        jLabel1 = new javax.swing.JLabel();
        txt_nomtarea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_prioridad = new rojerusan.RSComboMetro();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date_fechalimite = new rojeru_san.componentes.RSDateChooser();
        date_fechainicio = new rojeru_san.componentes.RSDateChooser();
        btn_addtarea = new rojeru_san.RSButton();
        pnl_prioricolor = new javax.swing.JPanel();
        btn_addproyecto2 = new javax.swing.JPanel();
        searchUser2 = new javax.swing.JTextField();
        options = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(689, 521));
        setPreferredSize(new java.awt.Dimension(689, 521));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combo_paquete.setColorArrow(new java.awt.Color(90, 31, 0));
        combo_paquete.setColorBorde(new java.awt.Color(209, 87, 13));
        combo_paquete.setColorFondo(new java.awt.Color(209, 87, 13));
        combo_paquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_paqueteMouseClicked(evt);
            }
        });
        combo_paquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_paqueteActionPerformed(evt);
            }
        });
        add(combo_paquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 246, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Seleccione un paquete: ");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 147, -1));

        txt_nomtarea.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        add(txt_nomtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 246, 33));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nombre de tarea:");
        jLabel2.setToolTipText("");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 146, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Prioridad");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 146, -1));

        combo_prioridad.setColorArrow(new java.awt.Color(90, 31, 0));
        combo_prioridad.setColorBorde(new java.awt.Color(209, 87, 13));
        combo_prioridad.setColorFondo(new java.awt.Color(209, 87, 13));
        combo_prioridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_prioridadMouseClicked(evt);
            }
        });
        combo_prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_prioridadActionPerformed(evt);
            }
        });
        add(combo_prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 125, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Encargado:");
        jLabel4.setToolTipText("");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 146, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Fecha inicio:");
        jLabel5.setToolTipText("");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 146, -1));

        date_fechalimite.setColorBackground(new java.awt.Color(209, 87, 13));
        date_fechalimite.setColorForeground(new java.awt.Color(102, 51, 0));
        add(date_fechalimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        date_fechainicio.setColorBackground(new java.awt.Color(209, 87, 13));
        date_fechainicio.setColorForeground(new java.awt.Color(102, 51, 0));
        add(date_fechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        btn_addtarea.setBackground(new java.awt.Color(204, 51, 0));
        btn_addtarea.setText("Añadir tarea");
        btn_addtarea.setColorHover(new java.awt.Color(255, 153, 0));
        btn_addtarea.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_addtarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addtareaActionPerformed(evt);
            }
        });
        add(btn_addtarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 250, -1));

        pnl_prioricolor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_prioricolorLayout = new javax.swing.GroupLayout(pnl_prioricolor);
        pnl_prioricolor.setLayout(pnl_prioricolorLayout);
        pnl_prioricolorLayout.setHorizontalGroup(
            pnl_prioricolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnl_prioricolorLayout.setVerticalGroup(
            pnl_prioricolorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(pnl_prioricolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 60, 30));

        btn_addproyecto2.setBackground(new java.awt.Color(172, 95, 47));
        btn_addproyecto2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchUser2.setToolTipText("Buscar colaborador");
        searchUser2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchUser2CaretUpdate(evt);
            }
        });
        btn_addproyecto2.add(searchUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 40));

        options.setFocusable(false);
        options.setOpaque(false);
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });
        btn_addproyecto2.add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 240, 20));

        add(btn_addproyecto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Fecha límite:");
        jLabel8.setToolTipText("");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 146, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void combo_paqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_paqueteActionPerformed
        
        paquete = wbs.searchPack(((String)combo_paquete.getSelectedItem()));
        //System.out.println((String)combo_paquete.getSelectedItem());
    }//GEN-LAST:event_combo_paqueteActionPerformed

    private void combo_prioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_prioridadActionPerformed
        if(combo_prioridad.getSelectedItem().equals("Alta")){
            pnl_prioricolor.setBackground(Color.red);
            prioridad= Prioridad.ALTA;
        }else {
            if(combo_prioridad.getSelectedItem().equals("Media")){
            pnl_prioricolor.setBackground(Color.yellow);
            prioridad= Prioridad.MEDIA;
            }else{
                pnl_prioricolor.setBackground(Color.green);
                prioridad= Prioridad.BAJA;
            }
            
        }
    }//GEN-LAST:event_combo_prioridadActionPerformed

    private void combo_prioridadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_prioridadMouseClicked
        switch(combo_prioridad.getSelectedIndex())
        {
            case 0:
                prioridad= Prioridad.ALTA;
                break;
            case 1:
                prioridad= Prioridad.MEDIA;
                break;    
            case 2:
                prioridad= Prioridad.BAJA;
                break;    
        }
    }//GEN-LAST:event_combo_prioridadMouseClicked

    private void searchUser2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchUser2CaretUpdate

        options.hidePopup();
        options.removeAllItems();

        //options.addItem("mensaje secreto 100% real no fake");

        if (!searchUser2.getText().isEmpty())
        {
            for (String search : wbs.getRelativeUsers(searchUser2.getText()))
            {
                options.addItem(search);
            }
            if (options.getItemAt(0)!=null)
            {
                options.showPopup();
            }
        }
        else
        {
            options.hidePopup();
        }
        options.setSelectedIndex(-1);
        searchUser2.requestFocus();

    }//GEN-LAST:event_searchUser2CaretUpdate

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        try
        {
            String n=(options.getItemAt(options.getSelectedIndex()));
            //System.out.println(n);
            searchUser2.setText(n);
        }
        catch (Exception e)
        {
            System.out.println("sin seleccion");
        }

    }//GEN-LAST:event_optionsActionPerformed

    private void btn_addtareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addtareaActionPerformed
        
        try 
        {
            if (wbs.searchCol(searchUser2.getText())==null) 
            {
                JOptionPane.showMessageDialog(this,"Este usuario no se ha añadido como colaborador");
            }
            else
            {
                paquete.addTask
                (
                    new Task
                    (
                        wbs.searchCol(searchUser2.getText()),
                        date_fechainicio.getDatoFecha(),
                        date_fechalimite.getDatoFecha(),
                        txt_nomtarea.getText(),
                        prioridad
                    )
                );
                
                // pendiente enviar notificación al encargado de la tarea
                
                JOptionPane.showMessageDialog(this,"Tarea creada. notificaremos al encargado");
            }
            //wbs.searchCol(searchUser2.getText())
        }
        catch (NullPointerException npe) 
        {
            System.out.println("no se ha ingresado el paquete");
            npe.printStackTrace();
            JOptionPane.showMessageDialog(this,"Por favor complete todos los campos");
        }
        
        
    }//GEN-LAST:event_btn_addtareaActionPerformed

    private void combo_paqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_paqueteMouseClicked
        
        for (Pack pack : ((Project)Wbs.tree.getInfo()).getPacks()) 
        {
            if (pack.getName().equals(combo_paquete.getItemAt(combo_paquete.getSelectedIndex()))) 
            {
                paquete =pack;
            }
        }
        
        
    }//GEN-LAST:event_combo_paqueteMouseClicked

    Prioridad prioridad= Prioridad.ALTA;
    Wbs wbs = new Wbs();
    Pack paquete;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_addproyecto;
    private javax.swing.JPanel btn_addproyecto1;
    private javax.swing.JPanel btn_addproyecto2;
    private rojeru_san.RSButton btn_addtarea;
    private rojerusan.RSComboMetro combo_paquete;
    private rojerusan.RSComboMetro combo_prioridad;
    private rojeru_san.componentes.RSDateChooser date_fechainicio;
    private rojeru_san.componentes.RSDateChooser date_fechalimite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JPanel pnl_prioricolor;
    private javax.swing.JTextField searchUser;
    private javax.swing.JTextField searchUser1;
    private javax.swing.JTextField searchUser2;
    private javax.swing.JTextField txt_nomtarea;
    // End of variables declaration//GEN-END:variables
}
