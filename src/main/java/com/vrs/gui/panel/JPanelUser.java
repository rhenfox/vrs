/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vrs.gui.panel;

import com.vrs.data.db.AppQuery;
import com.vrs.gui.panel.au.JDialogUserAUD;
import com.vrs.model.User;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Java Programming with Aldrin
 */
public class JPanelUser extends javax.swing.JPanel implements MouseListener {

    /**
     * Creates new form JPanelUser
     */
    private com.vrs.gui.JFrameVRS jframeVR;
    private AppQuery query = new AppQuery();
    private User user = new User();

    public JPanelUser() {
        initComponents();
    }

    public JPanelUser(com.vrs.gui.JFrameVRS parent) {
        initComponents();
        this.jframeVR = parent;
        setTable();
        selectUsers();
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 102, 153));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(748, 45));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(250, 100));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Search");
        jPanel5.add(jLabel1);

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldSearch.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });
        jPanel5.add(jTextFieldSearch);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(250, 72));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.setPreferredSize(new java.awt.Dimension(70, 30));
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonAdd);

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.setPreferredSize(new java.awt.Dimension(70, 30));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonUpdate);

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.setPreferredSize(new java.awt.Dimension(70, 30));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonDelete);

        jPanel4.add(jPanel6, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel4, java.awt.BorderLayout.NORTH);

        jTabbedPane1.addTab("Settings", jPanel1);
        jTabbedPane1.addTab("    Log    ", jPanel2);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        String text = jTextFieldSearch.getText().trim();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text + ",*"));
        }
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        final JDialogUserAUD aud = new JDialogUserAUD(jframeVR, true, "Add");
        aud.setTitle("Add User");
        aud.setVisible(true);
        selectUsers();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        final JDialogUserAUD aud = new JDialogUserAUD(jframeVR, true, "Update", this.user);
        aud.setTitle("Update User");
        aud.setVisible(true);
        selectUsers();
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure to delete " + user.getFirstname() + "" + user.getLastname() + " ?", "Delete Confirmation!!", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            new AppQuery().deleteUser(user.getId());
            JOptionPane.showMessageDialog(null, user.getFirstname() + "" + user.getLastname() + " is successfully deleted.", "Message", JOptionPane.PLAIN_MESSAGE);
            selectUsers();
        }
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jButtonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
    private ArrayList<User> userList;
    DefaultTableModel tableModel = new DefaultTableModel() {
        @Override
        public Class getColumnClass(int columnIndex) {
            return switch (columnIndex) {
                case 11 -> Boolean.class;
                default -> Object.class;
            };

        }

        @Override
        public boolean isCellEditable(int row, int col) {
            return false;
        }
    };
    private TableRowSorter<TableModel> sorter = new TableRowSorter<>(tableModel);

    private void setTable() {
        try {
            String[] columnNames = {
                "Id",//
                "User",//1
                "Firstname",
                "Middlename",
                "Lastname",
                "Email",
                "Mobile",
                "Username",
                "Password"//2
            };//15

            jTable1.setCellSelectionEnabled(true);
            jTable1 = new JTable(tableModel);
            JTableHeader header = jTable1.getTableHeader();
            header.setFont(new Font("Courier New", Font.PLAIN, 14));
            header.setBackground(new java.awt.Color(153, 153, 153));
            jTable1.setRowSorter(sorter);
            jTable1.addMouseListener(this);
            jTable1.setFont(new Font("Courier New", Font.PLAIN, 14));
            jScrollPane1.setViewportView(jTable1);
            for (int i = 0; i < columnNames.length;) {
                tableModel.addColumn(columnNames[i]);
                i++;
            }
            jScrollPane1.setViewportView(jTable1);

            TableColumn[] column = new TableColumn[100];

            column[0] = jTable1.getColumnModel().getColumn(0);
            column[0].setPreferredWidth(40);

            column[1] = jTable1.getColumnModel().getColumn(1);
            column[1].setPreferredWidth(250);

            column[2] = jTable1.getColumnModel().getColumn(2);
            column[2].setPreferredWidth(80);

            TableColumn hidden1 = jTable1.getColumnModel().getColumn(0);
            hidden1.setMinWidth(0);
            hidden1.setPreferredWidth(0);
            hidden1.setMaxWidth(0);
            TableColumn hidden2 = jTable1.getColumnModel().getColumn(2);
            hidden2.setMinWidth(0);
            hidden2.setPreferredWidth(0);
            hidden2.setMaxWidth(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == jTable1) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                if (e.getClickCount() == 1) {
                    jButtonUpdate.setEnabled(true);
                    jButtonDelete.setEnabled(true);
                    int row = jTable1.getSelectedRow();
                    if (row != -1) {

                        Object idl = jTable1.getValueAt(row, 0);
                        Object userl = jTable1.getValueAt(row, 1);
                        Object firstnamel = jTable1.getValueAt(row, 2);
                        Object middlenamel = jTable1.getValueAt(row, 3);
                        Object lastnamel = jTable1.getValueAt(row, 4);
                        Object emaill = jTable1.getValueAt(row, 5);
                        Object mobilel = jTable1.getValueAt(row, 6);
                        Object usernamel = jTable1.getValueAt(row, 7);
                        Object passwordl = jTable1.getValueAt(row, 8);
                        user.setId(Integer.parseInt(idl.toString()));
                        user.setFirstname(firstnamel.toString());
                        user.setMiddlename(middlenamel.toString());
                        user.setLastname(lastnamel.toString());
                        user.setEmail(emaill.toString());
                        user.setTelephone(mobilel.toString());
                        user.setUsername(usernamel.toString());
                        user.setPassword(passwordl.toString());

                    }
                    jButtonUpdate.setEnabled(true);
                    jButtonDelete.setEnabled(true);
                }
            }

        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void selectUsers() {
        userList = query.selectUser();
        tableModel.setRowCount(0);
        for (User c : userList) {
            String u = c.getLastname() + ", " + c.getFirstname() + " " + c.getMiddlename().substring(0, 1) + ".";
            tableModel.addRow(new Object[]{c.getId(), u, c.getFirstname(), c.getMiddlename(), c.getLastname(), c.getEmail(), c.getTelephone(), c.getUsername(), c.getPassword()});
        }
    }

}
