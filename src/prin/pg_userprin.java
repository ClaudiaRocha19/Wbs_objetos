/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelos.Pack;
import modelos.Project;
import wbs.Wbs;
import static wbs.Wbs.user;

/**
 *
 * @author Leonidas
 */
public class pg_userprin extends javax.swing.JFrame {

    ArrayList<Pack> paquetes = new ArrayList<>();
    File archivo, foto, archf;
    String ruta = null;

    /**
     * Creates new form pg_userprin
     */
    public pg_userprin() {
        initComponents();
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(pg_userprin.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);

        Wbs.savedParameters = this;

    }

    public void setNombre(String nombre) {
        this.lbl_nombre.setText(nombre);

        try {
            rsscalelabel.RSScaleLabel.setScaleLabel(this.lbl_foto, "allusers/" + nombre + "/foto.png");
            foto = new File("allusers/" + nombre + "/foto.png");
        } catch (Exception e) {
            rsscalelabel.RSScaleLabel.setScaleLabel(this.lbl_foto, "src/img/defaultuser.png");
            foto = new File("src/img/defaultuser.png");
        }
        cargarProyectos();
//        ImageIcon image= new ImageIcon(getClass().getResource("foto.png"));
//        ImageIcon newImage = new ImageIcon(image.getImage().getScaledInstance(lbl_foto.getWidth(), lbl_foto.getHeight(), Image.SCALE_DEFAULT));
//        lbl_foto.setIcon(newImage);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frm_editarperfil = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_usufoto = new javax.swing.JLabel();
        btn_examinar = new rojeru_san.RSButton();
        jLabel10 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_cancelar = new rojeru_san.RSButton();
        btn_aceptar = new rojeru_san.RSButton();
        frameColaboradores = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_colaboradores = new javax.swing.JTable();
        btn_cancelar1 = new rojeru_san.RSButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        btn_vercolaboradores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_editperfil = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_mostrarproyectos = new javax.swing.JPanel();
        btn_addproyecto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        frm_editarperfil.setMinimumSize(new java.awt.Dimension(387, 340));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(387, 340));
        jPanel4.setPreferredSize(new java.awt.Dimension(387, 340));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Establecer foto de perfil");

        lbl_usufoto.setMinimumSize(new java.awt.Dimension(126, 137));
        lbl_usufoto.setName(""); // NOI18N
        lbl_usufoto.setPreferredSize(new java.awt.Dimension(126, 137));

        btn_examinar.setBackground(new java.awt.Color(204, 51, 0));
        btn_examinar.setText("Examinar...");
        btn_examinar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_examinarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Cambiar contraseña");

        btn_cancelar.setBackground(new java.awt.Color(204, 51, 0));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setColorHover(new java.awt.Color(255, 153, 0));
        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_aceptar.setBackground(new java.awt.Color(204, 51, 0));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setColorHover(new java.awt.Color(255, 153, 0));
        btn_aceptar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_usufoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_usufoto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frm_editarperfilLayout = new javax.swing.GroupLayout(frm_editarperfil.getContentPane());
        frm_editarperfil.getContentPane().setLayout(frm_editarperfilLayout);
        frm_editarperfilLayout.setHorizontalGroup(
            frm_editarperfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frm_editarperfilLayout.setVerticalGroup(
            frm_editarperfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );

        frameColaboradores.setMinimumSize(new java.awt.Dimension(346, 388));

        jPanel5.setMinimumSize(new java.awt.Dimension(346, 388));

        tabla_colaboradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_colaboradores.setMinimumSize(new java.awt.Dimension(300, 64));
        jScrollPane2.setViewportView(tabla_colaboradores);

        btn_cancelar1.setBackground(new java.awt.Color(204, 51, 0));
        btn_cancelar1.setText("OK");
        btn_cancelar1.setColorHover(new java.awt.Color(255, 153, 0));
        btn_cancelar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout frameColaboradoresLayout = new javax.swing.GroupLayout(frameColaboradores.getContentPane());
        frameColaboradores.getContentPane().setLayout(frameColaboradoresLayout);
        frameColaboradoresLayout.setHorizontalGroup(
            frameColaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameColaboradoresLayout.setVerticalGroup(
            frameColaboradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(218, 175, 118));
        jPanel1.setMinimumSize(new java.awt.Dimension(961, 545));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 19, 6));
        jPanel2.setMinimumSize(new java.awt.Dimension(250, 545));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 545));
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_foto.setForeground(new java.awt.Color(204, 204, 204));
        lbl_foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 92, -1, -1));

        btn_vercolaboradores.setBackground(new java.awt.Color(172, 95, 47));
        btn_vercolaboradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vercolaboradoresMouseClicked(evt);
            }
        });
        btn_vercolaboradores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mis colaboradores");
        btn_vercolaboradores.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 144, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Eye_24px_1.png"))); // NOI18N
        btn_vercolaboradores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 40));

        jPanel2.add(btn_vercolaboradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 190, -1));

        btn_editperfil.setBackground(new java.awt.Color(172, 95, 47));
        btn_editperfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editperfilMouseClicked(evt);
            }
        });
        btn_editperfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar perfil");
        btn_editperfil.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 144, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Edit_24px.png"))); // NOI18N
        btn_editperfil.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 40));

        jPanel2.add(btn_editperfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 190, -1));

        lbl_nombre.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(218, 175, 118));
        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 545));

        pnl_mostrarproyectos.setBackground(new java.awt.Color(255, 255, 255));
        pnl_mostrarproyectos.setMinimumSize(new java.awt.Dimension(578, 798));
        pnl_mostrarproyectos.setPreferredSize(new java.awt.Dimension(578, 798));
        pnl_mostrarproyectos.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnl_mostrarproyectosLayout = new javax.swing.GroupLayout(pnl_mostrarproyectos);
        pnl_mostrarproyectos.setLayout(pnl_mostrarproyectosLayout);
        pnl_mostrarproyectosLayout.setHorizontalGroup(
            pnl_mostrarproyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        pnl_mostrarproyectosLayout.setVerticalGroup(
            pnl_mostrarproyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnl_mostrarproyectos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 580, 400));

        btn_addproyecto.setBackground(new java.awt.Color(172, 95, 47));
        btn_addproyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addproyectoMouseClicked(evt);
            }
        });
        btn_addproyecto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nuevo proyecto");
        btn_addproyecto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 144, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Plus_24px.png"))); // NOI18N
        btn_addproyecto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 0, 50, 40));

        jPanel1.add(btn_addproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 220, 40));

        jLabel8.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(47, 19, 6));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Mis Proyectos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Pack> getPaquetes() {
        return paquetes;
    }

    private void btn_addproyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addproyectoMouseClicked
        //String name = JOptionPane.showInputDialog(null,"Nombre del projecto");
        String nomproy = JOptionPane.showInputDialog(null, "Nombre del proyecto");

        while (nomproy.isEmpty() && nomproy != null) {
            JOptionPane.showMessageDialog(this, "El campo esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
            nomproy = JOptionPane.showInputDialog(null, "Nombre del proyecto");
        }
        if (!(nomproy == null) && !(nomproy.isEmpty())) {
            Project p = new Project(nomproy, Wbs.tree);

            wbs.createProject(p);

            //wbs.createProject(new Project(nomproy, Wbs.tree));
        }
        this.setVisible(false);


    }//GEN-LAST:event_btn_addproyectoMouseClicked

    private void btn_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examinarActionPerformed
        JFileChooser fc = new JFileChooser();
        BufferedImage imagen = null;

        fc.setDialogTitle("Buscar foto");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();

            if (archivo.canRead()) {
                if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                    rsscalelabel.RSScaleLabel.setScaleLabel(lbl_usufoto, archivo.toString());
                    ruta = fc.getSelectedFile().toString();
                    archf = fc.getSelectedFile();
                    String ext = null;

                } else {
                    JOptionPane.showMessageDialog(this, "Escoja una imagen con extension jpg, png o gif");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un problema con el archivo");
            }
        }
    }//GEN-LAST:event_btn_examinarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        frm_editarperfil.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btn_editperfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editperfilMouseClicked
        frm_editarperfil.setLocationRelativeTo(this);
        frm_editarperfil.setVisible(true);
        String nombre = lbl_nombre.getText();
        try {
            rsscalelabel.RSScaleLabel.setScaleLabel(lbl_usufoto, "allusers/" + nombre + "/foto.png");

        } catch (Exception e) {
            rsscalelabel.RSScaleLabel.setScaleLabel(lbl_usufoto, "src/img/defaultuser.png");

        }
    }//GEN-LAST:event_btn_editperfilMouseClicked

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        if (!(txt_pass.getText().equals(""))) {

            try {
                BufferedReader lec_users = new BufferedReader(new FileReader("usuarios.txt"));
                BufferedWriter esc_temp = new BufferedWriter(new FileWriter("temp.txt"));

                String nombre = lbl_nombre.getText(), linea;
                ArrayList<String> campos;

                while ((linea = lec_users.readLine()) != null) {
                    campos = wbs.separar(linea);
                    if (campos.get(0).equals(nombre)) {
                        esc_temp.write(campos.get(0) + "," + txt_pass.getText() + "," + campos.get(2) + ",1,");
                    } else {
                        esc_temp.write(linea);
                    }
                    esc_temp.newLine();
                }

                lec_users.close();
                esc_temp.close();

                BufferedReader lec_temp = new BufferedReader(new FileReader("temp.txt"));
                BufferedWriter esc_users = new BufferedWriter(new FileWriter("usuarios.txt"));

                while ((linea = lec_temp.readLine()) != null) {
                    esc_users.write(linea);
                    esc_users.newLine();
                }

                esc_users.close();
                lec_temp.close();

            } catch (IOException ioe) {
                System.out.println("error en la lectura del archivo");
                ioe.printStackTrace();
            }

        }
        if (ruta != null) {

            try {
                File ft = new File("allusers/" + lbl_nombre.getText() + "/foto.png");
                String l = null;
                BufferedImage imagen = null;

                imagen = ImageIO.read(archivo);

                File destino = new File("allusers/" + lbl_nombre.getText() + "/foto.png");

                ImageIO.write(imagen, "png", destino);


                rsscalelabel.RSScaleLabel.setScaleLabel(this.lbl_foto, "allusers/" + lbl_nombre.getText() + "/foto.png");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            frm_editarperfil.dispose();
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar1ActionPerformed
        frameColaboradores.dispose();
    }//GEN-LAST:event_btn_cancelar1ActionPerformed

    private void btn_vercolaboradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vercolaboradoresMouseClicked
        //frameColaboradores.setLocationRelativeTo(null);
        frameColaboradores.setLocationRelativeTo(this);
        poblarColaboradores();
        frameColaboradores.setVisible(true);
    }//GEN-LAST:event_btn_vercolaboradoresMouseClicked
    
    private void poblarColaboradores()
    {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Colaborador");
        dtm.addColumn("Proyecto");
        
        try 
        {
            BufferedReader agpro = new BufferedReader(
                    new FileReader(
                    "allusers/"
                    +user.getName()
                    +"/projectindex.txt"));
            
            String linea,subline;
            while((linea=agpro.readLine())!=null)
            {
                BufferedReader agcol = new BufferedReader(
                    new FileReader(
                    "allusers/"
                    +user.getName()
                    +"/"+linea+"colaborators.txt"));
                
                    while((subline=agcol.readLine())!=null)
                    {
                        dtm.addRow(new String[]{subline,linea});
                    }
                
                agcol.close();
            }
            
            agpro.close();
            tabla_colaboradores.setModel(dtm);
        } 
        catch (IOException e) 
        {
            System.out.println("Error de lectura del archivo");
        }
        
        
        
    }
    
    private String[] substr(String line, int comas) {
        int ant = 0, p = 0, contguion = 0;
        String[] palabras = new String[100];
        for (int j = 0; j < line.length() - 1; j++) {
            if (line.charAt(j) == ',') {
                if (comas == 0) {
                    palabras[0] = line.substring(0, j);
                    ant = j + 1;
                    contguion++;

                    p++;

                } else {
                    if (contguion < comas) {
                        palabras[p] = line.substring(ant, j);
                        ant = j + 1;

                        p++;
                        contguion++;

                    }

                }
            }
            if (contguion == comas) {
                palabras[p] = line.substring(ant, line.length() - 1);

                p++;
                contguion++;
            }
        }
        return palabras;
    }
     private void cargarProyectos() {
         BufferedReader proyect = null;
         int y = 5;
         
         ImageIcon icon = new ImageIcon("src/img/package.png");
         String rutaproyects = "allusers/" + lbl_nombre.getText() + "/projectindex.txt";
        try {
            
            File proyectos = new File(rutaproyects);
            if (proyectos.canRead()) {
                proyect = new BufferedReader(new FileReader(rutaproyects));
            String linea = null;
            while((linea=proyect.readLine())!=null){
                JPanel panel = new JPanel();
                JLabel label = new JLabel();
                panel.setBounds(5, y, 400, 100);
               
                panel.setBackground(Color.white);
                label.setIcon(icon);
                label.setFont(new java.awt.Font("Arial", 0, 14));
                label.setText(linea);
                label.addMouseListener(new MouseAdapter()  
                {  
                    public void mouseClicked(MouseEvent e)  
                    {  
                       wbs.openProject(new Project(label.getText()));
                       
                        
                    }  

                   
                }); 
                panel.add(label);
                pnl_mostrarproyectos.setLayout(new FlowLayout(FlowLayout.LEFT));
                pnl_mostrarproyectos.add(panel);
                y+=155;
                }
            }else{
                JLabel label = new JLabel();  
                label.setFont(new java.awt.Font("Arial", 0, 14));
                label.setText("No hay proyectos");
                pnl_mostrarproyectos.add(label);
                
            }
            
            
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(pg_userprin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(pg_userprin.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                proyect.close();
            } catch (IOException ex) {
                Logger.getLogger(pg_userprin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pg_userprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pg_userprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pg_userprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pg_userprin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pg_userprin().setVisible(true);
            }
        });
    }

    @Override
    public void dispose() {
        new pg_login().setVisible(true);
        super.dispose();
    }

    Wbs wbs = new Wbs();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btn_aceptar;
    private javax.swing.JPanel btn_addproyecto;
    private rojeru_san.RSButton btn_cancelar;
    private rojeru_san.RSButton btn_cancelar1;
    private javax.swing.JPanel btn_editperfil;
    private rojeru_san.RSButton btn_examinar;
    private javax.swing.JPanel btn_vercolaboradores;
    private javax.swing.JFrame frameColaboradores;
    private javax.swing.JFrame frm_editarperfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_usufoto;
    private javax.swing.JPanel pnl_mostrarproyectos;
    private javax.swing.JTable tabla_colaboradores;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables

   
}
