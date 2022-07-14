/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.vrs.gui;

import com.vrs.gui.dialog.JDialogCustomer;
import com.vrs.gui.dialog.JDialogType;
import com.vrs.gui.dialog.JDialogUser;
import com.vrs.gui.panel.JPanelSales;
import com.vrs.gui.panel.JPanelUser;
import com.vrs.gui.panel.JPanelVehicle;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JFrameVRS extends javax.swing.JFrame {

    private JPanelVehicle panelVehicle;
    private JPanelUser panelUser;
    private JPanelSales panelSales;

    public JFrameVRS() {
        this.setIconImage(new ImageIcon(getClass().getResource("/images/car icon.png")).getImage());
        initComponents();
        panelVehicle = new JPanelVehicle(this);
        previewPanels(panelVehicle);
        buttonBackground(jButton1);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContainers = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelContainers.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanelContainers, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(1341, 45));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car.png"))); // NOI18N
        jButton1.setText("Vehicle");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(42, 42));
        jButton1.setMinimumSize(new java.awt.Dimension(42, 42));
        jButton1.setPreferredSize(new java.awt.Dimension(42, 42));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jButton2.setText("User");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(42, 42));
        jButton2.setMinimumSize(new java.awt.Dimension(42, 42));
        jButton2.setPreferredSize(new java.awt.Dimension(42, 42));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sales.png"))); // NOI18N
        jButton3.setText("Sales");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(42, 42));
        jButton3.setMinimumSize(new java.awt.Dimension(42, 42));
        jButton3.setPreferredSize(new java.awt.Dimension(42, 42));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jPanel2.add(jToolBar1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jMenu1.setText("System");

        jMenuItem3.setText("Change Password");
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Log-in");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Log-out");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("Exit");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Administration");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jMenuItem5.setText("User");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Type");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Customer");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reports");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("About");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1591, 749));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelUser = new JPanelUser(this);
        previewPanels(panelUser);
        buttonBackground(jButton2);
        panelUser.selectUsers();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelVehicle = new JPanelVehicle(this);
        previewPanels(panelVehicle);
        buttonBackground(jButton1);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buttonBackground(jButton3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JDialogUser user = new JDialogUser(this, true);
        user.setVisible(true);
        panelUser.selectUsers();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JDialogType type = new JDialogType(this, true);
        type.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JDialogCustomer customer = new JDialogCustomer(this, true);
        customer.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelContainers;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void previewPanels(Component com) {
        jPanelContainers.removeAll();
        jPanelContainers.add(com);
        jPanelContainers.repaint();
        jPanelContainers.revalidate();
    }

    private JButton buttonBackground(JButton button) {
        if (jButton1 == button) {
            jButton1.setBackground(new java.awt.Color(0, 102, 153));
            jButton2.setBackground(null);
            jButton3.setBackground(null);
        } else if (jButton2 == button) {
            jButton1.setBackground(null);           
            jButton2.setBackground(new java.awt.Color(0, 102, 153));
            jButton3.setBackground(null);
        }
        if (jButton3 == button) {
            jButton1.setBackground(null);
            jButton2.setBackground(null);
            jButton3.setBackground(new java.awt.Color(0, 102, 153));
        }
        return button;
    }
}
