/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MENU;

import USUARIO.ManagerUsuarios;
import USUARIO.Usuario;
import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Josue Gavidia
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public ManagerUsuarios managerUsers;
    public ArrayList<String> PLAYERS, p1, p2, p3;
    public int cantPlayersSettings;

    public MenuPrincipal() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.REG_TAB.setVisible(false);
        this.PLAY_TAB.setVisible(false);
        this.MAIN_MENU.setVisible(false);
        this.CONFIG_TAB.setVisible(false);
        EQUIPO3.setVisible(false);
        this.playersThreeSc.setVisible(false);
        tokenColor3.setVisible(false);

        try {
            managerUsers = new ManagerUsuarios();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {

        }
        PLAYERS = new ArrayList<>();
        p1 = new ArrayList<>();
        p2 = new ArrayList<>();
        p3 = new ArrayList<>();
        cantPlayersSettings = 4;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_MENU = new javax.swing.JPanel();
        PLAY = new javax.swing.JButton();
        config = new javax.swing.JButton();
        REG_TAB = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        fullName = new javax.swing.JTextField();
        Reg_Checkout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        confPass = new javax.swing.JTextField();
        PLAY_TAB = new javax.swing.JPanel();
        usersListSc = new javax.swing.JScrollPane();
        usersList = new javax.swing.JList<>();
        EQUIPO1 = new javax.swing.JButton();
        EQUIPO3 = new javax.swing.JButton();
        playesOneSc = new javax.swing.JScrollPane();
        playersOne = new javax.swing.JList<>();
        playersThreeSc = new javax.swing.JScrollPane();
        playersThree = new javax.swing.JList<>();
        tokenColor1 = new javax.swing.JComboBox<>();
        tokenColor2 = new javax.swing.JComboBox<>();
        EQUIPO2 = new javax.swing.JButton();
        playersTwoSc = new javax.swing.JScrollPane();
        playersTwo = new javax.swing.JList<>();
        tokenColor3 = new javax.swing.JComboBox<>();
        START = new javax.swing.JButton();
        rem1 = new javax.swing.JButton();
        rem2 = new javax.swing.JButton();
        rem3 = new javax.swing.JButton();
        LOG_IN = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        usLogin = new javax.swing.JTextField();
        passLogin = new javax.swing.JTextField();
        checkOut = new javax.swing.JButton();
        reg = new javax.swing.JButton();
        CONFIG_TAB = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        MAIN_MENU.setBackground(new java.awt.Color(51, 0, 0));
        MAIN_MENU.setPreferredSize(new java.awt.Dimension(1920, 1080));
        MAIN_MENU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PLAY.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        PLAY.setText("JUGAR");
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });
        MAIN_MENU.add(PLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 330, 90));

        config.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        config.setText("CONFIGURACION");
        config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configActionPerformed(evt);
            }
        });
        MAIN_MENU.add(config, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 330, 90));

        REG_TAB.setBackground(new java.awt.Color(51, 0, 0));
        REG_TAB.setPreferredSize(new java.awt.Dimension(1920, 1080));
        REG_TAB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel1.setText("NOMBRE COMPLETO");
        REG_TAB.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 350, 100));

        jLabel2.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel2.setText("USUARIO");
        REG_TAB.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 230, 100));

        jLabel3.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel3.setText("CONTRASEñA");
        REG_TAB.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 230, 100));

        us.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        us.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REG_TAB.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 550, 80));

        pass.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REG_TAB.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 550, 80));

        fullName.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        fullName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REG_TAB.add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 550, 80));

        Reg_Checkout.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        Reg_Checkout.setText("REGISTRARSE");
        Reg_Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_CheckoutActionPerformed(evt);
            }
        });
        REG_TAB.add(Reg_Checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 780, 330, 90));

        jLabel7.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel7.setText("CONFIRMAR CONTRASEñA");
        REG_TAB.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 430, 100));

        confPass.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        confPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REG_TAB.add(confPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 650, 550, 80));

        PLAY_TAB.setBackground(new java.awt.Color(51, 0, 0));
        PLAY_TAB.setPreferredSize(new java.awt.Dimension(1920, 1080));
        PLAY_TAB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersListSc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        usersList.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usersList.setForeground(new java.awt.Color(0, 0, 0));
        usersList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        usersListSc.setViewportView(usersList);

        PLAY_TAB.add(usersListSc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 690, 760));

        EQUIPO1.setText("Equipo 1");
        EQUIPO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUIPO1ActionPerformed(evt);
            }
        });
        PLAY_TAB.add(EQUIPO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 150, 50));

        EQUIPO3.setText("Equipo 3");
        EQUIPO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUIPO3ActionPerformed(evt);
            }
        });
        PLAY_TAB.add(EQUIPO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 470, 150, 50));

        playersOne.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        playesOneSc.setViewportView(playersOne);

        PLAY_TAB.add(playesOneSc, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 160, 150));

        playersThree.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        playersThreeSc.setViewportView(playersThree);

        PLAY_TAB.add(playersThreeSc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 550, 160, 150));

        tokenColor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROJO", "AZUL", "VERDE" }));
        PLAY_TAB.add(tokenColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 380, 160, 30));

        tokenColor2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AZUL", "VERDE", "ROJO" }));
        PLAY_TAB.add(tokenColor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 380, 160, 30));

        EQUIPO2.setText("Equipo 2");
        EQUIPO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUIPO2ActionPerformed(evt);
            }
        });
        PLAY_TAB.add(EQUIPO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 130, 150, 50));

        playersTwo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        playersTwoSc.setViewportView(playersTwo);

        PLAY_TAB.add(playersTwoSc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 210, 160, 150));

        tokenColor3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VERDE", "ROJO", "AZUL" }));
        PLAY_TAB.add(tokenColor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 720, 160, 30));

        START.setText("CONTINUAR");
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        PLAY_TAB.add(START, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 820, 160, 70));

        rem1.setText("remover");
        rem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rem1ActionPerformed(evt);
            }
        });
        PLAY_TAB.add(rem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 210, 110, -1));

        rem2.setText("remover");
        rem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rem2ActionPerformed(evt);
            }
        });
        PLAY_TAB.add(rem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 210, 110, -1));

        rem3.setText("remover");
        rem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rem3ActionPerformed(evt);
            }
        });
        PLAY_TAB.add(rem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 560, 110, -1));

        LOG_IN.setBackground(new java.awt.Color(51, 0, 0));
        LOG_IN.setPreferredSize(new java.awt.Dimension(1920, 1080));
        LOG_IN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel9.setText("USUARIO");
        LOG_IN.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 230, 100));

        jLabel10.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel10.setText("CONTRASEñA");
        LOG_IN.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 230, 100));

        usLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        usLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LOG_IN.add(usLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 550, 80));

        passLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        passLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LOG_IN.add(passLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, 550, 80));

        checkOut.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        checkOut.setText("INICIAR SESION");
        checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutActionPerformed(evt);
            }
        });
        LOG_IN.add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 690, 330, 90));

        reg.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        reg.setText("REGISTRARME");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        LOG_IN.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 690, 310, 80));

        CONFIG_TAB.setBackground(new java.awt.Color(51, 0, 0));
        CONFIG_TAB.setPreferredSize(new java.awt.Dimension(1920, 1080));
        CONFIG_TAB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_MENU, javax.swing.GroupLayout.DEFAULT_SIZE, 1932, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(REG_TAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PLAY_TAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(LOG_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CONFIG_TAB, javax.swing.GroupLayout.DEFAULT_SIZE, 1932, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_MENU, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(REG_TAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PLAY_TAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(LOG_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CONFIG_TAB, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed
        this.PLAY_TAB.setVisible(true);
        this.MAIN_MENU.setVisible(false);
        this.PLAYERS = managerUsers.listUsers();

        DefaultListModel<String> model = new DefaultListModel<>();

        for (String user : PLAYERS) {
            model.addElement(user);
        }

        usersList.setModel(model);

        if (cantPlayersSettings == 3 || cantPlayersSettings == 6) {
            EQUIPO3.setVisible(true);
            playersThreeSc.setVisible(true);
            tokenColor3.setVisible(true);
        }


    }//GEN-LAST:event_PLAYActionPerformed
    public void insertPlayer(String p) {
        DefaultListModel<String> model = (DefaultListModel<String>) usersList.getModel();
        model.removeElement(p);
        usersList.setModel(model);
    }
    private void Reg_CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_CheckoutActionPerformed
        try {

            if (!this.fullName.getText().isEmpty() && !this.us.getText().isEmpty() && !this.pass.getText().isEmpty() && !this.confPass.getText().isEmpty()) {
                if (ManagerUsuarios.SearchUser(this.us.getText()) == null) {
                    if (!confPass.getText().equals(pass.getText())) {
                        JOptionPane.showMessageDialog(null, "LAS CONTRASEñA NO COINCIDE");
                        return;
                    }
                    managerUsers.createUserFolder(fullName.getText(), us.getText(), pass.getText());
                    JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO");
                    System.out.println(ManagerUsuarios.SearchUser(this.us.getText()).getNAME() + " Has been Registered");

                    //Limpieza de textFields
                    for (Component a : this.REG_TAB.getComponents()) {

                        if (a instanceof JTextField) {

                            JTextField text = (JTextField) a;
                            text.setText(null);
                        }

                    }
                    this.REG_TAB.setVisible(false);
                    this.LOG_IN.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "NOMBRE DE USUARIO EN USO");
                }

            } else {
                JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_Reg_CheckoutActionPerformed

    private void checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutActionPerformed
        String user, pw;

        user = this.usLogin.getText();
        pw = this.passLogin.getText();
        try {
            if (!user.isEmpty() && !pw.isEmpty()) {
                Usuario temp = ManagerUsuarios.SearchUser(user);
                if (temp != null && user.equals(temp.getUsername()) && pw.equals(temp.getPassword())) {
                    JOptionPane.showMessageDialog(null, "Bienvenido " + temp.getNAME() + " ^ - ^");

                    //Limpieza
                    for (Component a : this.LOG_IN.getComponents()) {

                        if (a instanceof JTextField) {

                            ((JTextField) a).setText(null);

                        }

                    }
                    this.LOG_IN.setVisible(false);
                    this.MAIN_MENU.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEñA INCORRECTO");
                }
            } else {
                JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_checkOutActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        this.LOG_IN.setVisible(false);
        this.REG_TAB.setVisible(true);

    }//GEN-LAST:event_regActionPerformed

    private void EQUIPO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUIPO1ActionPerformed

        String selected = usersList.getSelectedValue();
        this.insertPlayer(selected);
        p1.add(selected);

        DefaultListModel<String> model = new DefaultListModel();
        for (String a : p1) {
            model.addElement(a);
        }

        playersOne.setModel(model);


    }//GEN-LAST:event_EQUIPO1ActionPerformed

    private void EQUIPO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUIPO3ActionPerformed
        String selected = usersList.getSelectedValue();
        this.insertPlayer(usersList.getSelectedValue());
        p3.add(selected);

        DefaultListModel<String> model = new DefaultListModel();
        for (String a : p3) {
            model.addElement(a);
        }

        playersThree.setModel(model);
    }//GEN-LAST:event_EQUIPO3ActionPerformed

    private void EQUIPO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUIPO2ActionPerformed
        String selected = usersList.getSelectedValue();
        this.insertPlayer(usersList.getSelectedValue());
        p2.add(selected);

        DefaultListModel<String> model = new DefaultListModel();
        for (String a : p2) {
            model.addElement(a);
        }

        playersTwo.setModel(model);

    }//GEN-LAST:event_EQUIPO2ActionPerformed

    public boolean areTeamsEven() {

        if (cantPlayersSettings % 2 == 0) {
            int total = p1.size() - +1 + p2.size() + 1;
            if (total > cantPlayersSettings) {
                return false;
            } else {
                return total % 2 == 0;
            }

        } else {
            int total = p1.size() + 1 + p2.size() + 1 + p3.size() + 1;
            if (total > cantPlayersSettings) {
                return false;
            } else {
                return total % 3 == 0;
            }
        }

    }
    private void configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configActionPerformed
        this.MAIN_MENU.setVisible(false);
        this.CONFIG_TAB.setVisible(true);
    }//GEN-LAST:event_configActionPerformed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        if (!areTeamsEven()) {
            JOptionPane.showMessageDialog(null, "DESPROPORCIONADO");
        }
    }//GEN-LAST:event_STARTActionPerformed

    private void rem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rem1ActionPerformed
        DefaultListModel<String> model = (DefaultListModel<String>) playersOne.getModel();
        DefaultListModel<String> ParentModel = (DefaultListModel<String>) playersThree.getModel();
        model.removeElement(playersOne.getSelectedValue());
        p1.remove(playersThree.getSelectedValue());
        ParentModel.removeElement(playersOne.getSelectedValue());
        playersOne.setModel(model);
        usersList.setModel(ParentModel);
    }//GEN-LAST:event_rem1ActionPerformed

    private void rem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rem2ActionPerformed
        DefaultListModel<String> model = (DefaultListModel<String>) playersTwo.getModel();
        DefaultListModel<String> ParentModel = (DefaultListModel<String>) playersThree.getModel();
        model.removeElement(playersTwo.getSelectedValue());
        p2.remove(playersThree.getSelectedValue());
        ParentModel.removeElement(playersTwo.getSelectedValue());
        playersTwo.setModel(model);
        usersList.setModel(ParentModel);
    }//GEN-LAST:event_rem2ActionPerformed

    private void rem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rem3ActionPerformed
        DefaultListModel<String> model = (DefaultListModel<String>) playersThree.getModel();
        DefaultListModel<String> ParentModel = (DefaultListModel<String>) playersThree.getModel();
        model.removeElement(playersThree.getSelectedValue());
        p3.remove(playersThree.getSelectedValue());
        ParentModel.removeElement(playersThree.getSelectedValue());
        playersThree.setModel(model);
        usersList.setModel(ParentModel);


    }//GEN-LAST:event_rem3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CONFIG_TAB;
    private javax.swing.JButton EQUIPO1;
    private javax.swing.JButton EQUIPO2;
    private javax.swing.JButton EQUIPO3;
    private javax.swing.JPanel LOG_IN;
    private javax.swing.JPanel MAIN_MENU;
    private javax.swing.JButton PLAY;
    private javax.swing.JPanel PLAY_TAB;
    private javax.swing.JPanel REG_TAB;
    private javax.swing.JButton Reg_Checkout;
    private javax.swing.JButton START;
    private javax.swing.JButton checkOut;
    private javax.swing.JTextField confPass;
    private javax.swing.JButton config;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField passLogin;
    private javax.swing.JList<String> playersOne;
    private javax.swing.JList<String> playersThree;
    private javax.swing.JScrollPane playersThreeSc;
    private javax.swing.JList<String> playersTwo;
    private javax.swing.JScrollPane playersTwoSc;
    private javax.swing.JScrollPane playesOneSc;
    private javax.swing.JButton reg;
    private javax.swing.JButton rem1;
    private javax.swing.JButton rem2;
    private javax.swing.JButton rem3;
    private javax.swing.JComboBox<String> tokenColor1;
    private javax.swing.JComboBox<String> tokenColor2;
    private javax.swing.JComboBox<String> tokenColor3;
    private javax.swing.JTextField us;
    private javax.swing.JTextField usLogin;
    private javax.swing.JList<String> usersList;
    private javax.swing.JScrollPane usersListSc;
    // End of variables declaration//GEN-END:variables
}
