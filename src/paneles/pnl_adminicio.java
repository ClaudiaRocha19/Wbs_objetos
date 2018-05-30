/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelos.Pack;
import modelos.Project;
import modelos.User;
import prin.pg_userprin;
import wbs.Wbs;

/**
 *
 * @author Leonidas
 */
public class pnl_adminicio extends javax.swing.JPanel {

    ArrayList<Pack> packs = new ArrayList<>();

    /**
     * Creates new form pnl_adminicio
     */
    public pnl_adminicio() {
        initComponents();
        cargar_paquetes();
    }

    private void poblar_cols() {

        // poblar con fotos, ahuevo
    }

    private void cargar_paquetes() {
        pg_userprin p = new pg_userprin();
        int antx = 5;
        ImageIcon icon = new ImageIcon("src/img/folder.png");
        packs = ((Project) (Wbs.tree.getInfo())).getPacks();

        if (packs == null || packs.size() == 0) {
            JLabel label = new JLabel();
            label.setBounds(10, 0, 250, 150);
            label.setFont(new java.awt.Font("Arial", 0, 14));
            label.setText("No hay paquetes en este proyecto");
            pnl_packs.add(label);

        } else {
            for (Pack pack : packs) {
                JPanel panel = new JPanel();
                JLabel labelicon = new JLabel();
                labelicon.setBounds(0, 80, 200, 100);
                labelicon.setFont(new java.awt.Font("Arial", 0, 14));
                labelicon.setIcon(icon);
                labelicon.setText(pack.getName());
                panel.setBounds(antx, 0, 200, 100);

                panel.setBackground(Color.white);
                panel.add(labelicon);
                pnl_packs.add(panel);
                antx += 155;
                if (antx > pnl_packs.getWidth()) {
                    pnl_packs.setSize(pnl_packs.getWidth()+(antx - pnl_packs.getWidth()), 120);
                    
                }
            }
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

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_packs = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        colList = new javax.swing.JPanel();

        setBackground(new java.awt.Color(218, 175, 118));
        setMinimumSize(new java.awt.Dimension(689, 521));

        jLabel8.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 19, 6));
        jLabel8.setText("Colaboradores de proyecto");

        pnl_packs.setBackground(new java.awt.Color(255, 255, 255));
        pnl_packs.setMinimumSize(new java.awt.Dimension(659, 120));
        pnl_packs.setPreferredSize(new java.awt.Dimension(659, 120));

        javax.swing.GroupLayout pnl_packsLayout = new javax.swing.GroupLayout(pnl_packs);
        pnl_packs.setLayout(pnl_packsLayout);
        pnl_packsLayout.setHorizontalGroup(
            pnl_packsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );
        pnl_packsLayout.setVerticalGroup(
            pnl_packsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnl_packs);

        jLabel9.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(47, 19, 6));
        jLabel9.setText("Paquetes de trabajo");

        javax.swing.GroupLayout colListLayout = new javax.swing.GroupLayout(colList);
        colList.setLayout(colListLayout);
        colListLayout.setHorizontalGroup(
            colListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        colListLayout.setVerticalGroup(
            colListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(colList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel8))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(481, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel colList;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_packs;
    // End of variables declaration//GEN-END:variables
}
