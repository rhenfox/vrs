/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vrs.gui.panel.au;


import com.vrs.data.db.AppQuery;
import com.vrs.model.User;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Blob;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Aldrin
 */
public class JDialogCustomerAUD extends javax.swing.JDialog {

    private com.vrs.gui.JFrameVRS jftameVRS;
    private String evt = new String();
    private File pictureFile = null;
    private File photo;
    private User user = new User();

    /**
     * Creates new form JDialogSupplierAUD
     */
    public JDialogCustomerAUD(com.vrs.gui.JFrameVRS parent, boolean modal) {
        super(parent, modal);
        this.jftameVRS = parent;
        initComponents();

    }

    public JDialogCustomerAUD(com.vrs.gui.JFrameVRS parent, boolean modal, String evtl) {
        super(parent, modal);
        initComponents();
        this.evt = evtl;
        jButtonSave.setText("Save");
        jButtonSave.setMnemonic('S');

    }

    public JDialogCustomerAUD(com.vrs.gui.JFrameVRS parent, boolean modal, String evtl, User user) {
        super(parent, modal);
        initComponents();
        this.evt = evtl;
        jButtonSave.setText("Update");
        jButtonSave.setMnemonic('U');
        jTextFieldFirstname.setText(user.getFirstname());
        jTextFieldMiddlename.setText(user.getMiddlename());
        jTextFieldLastname.setText(user.getLastname());
        jTextFieldMobile.setText(user.getTelephone());
        jTextFieldEmail.setText(user.getEmail());
        jTextFieldUsername.setText(user.getUsername());
        jPasswordFieldPassword.setText(user.getPassword());
        this.user = user;
        displayPicture();

    }

    public JDialogCustomerAUD(com.vrs.gui.JFrameVRS parent, boolean modal, User user, String evtl) {
        super(parent, modal);
        initComponents();
        this.evt = evtl;
        jButtonSave.setText("Delete");
        jButtonSave.setMnemonic('D');
        jTextFieldFirstname.setText(user.getFirstname());
        jTextFieldMiddlename.setText(user.getMiddlename());
        jTextFieldLastname.setText(user.getLastname());
        jTextFieldMobile.setText(user.getTelephone());
        jTextFieldEmail.setText(user.getEmail());
        jTextFieldUsername.setText(user.getUsername());
        jPasswordFieldPassword.setText(user.getPassword());
        this.user = user;
        displayPicture();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelPicture = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFirstname = new javax.swing.JTextField();
        jTextFieldMiddlename = new javax.swing.JTextField();
        jTextFieldLastname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jPanelButton = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add User");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(362, 280));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setMaximumSize(new java.awt.Dimension(180, 180));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabelPicture.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabelPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPicture.setText("No Photo");
        jLabelPicture.setMaximumSize(new java.awt.Dimension(180, 180));
        jLabelPicture.setMinimumSize(new java.awt.Dimension(180, 180));
        jLabelPicture.setPreferredSize(new java.awt.Dimension(180, 180));
        jLabelPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPictureMouseClicked(evt);
            }
        });
        jPanel4.add(jLabelPicture, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 33, 160, 150));

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setText("Firstname");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 100, -1));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setText("Middlename");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, 90, -1));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setText("Lastname");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, 80, -1));

        jTextFieldFirstname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, 200, -1));

        jTextFieldMiddlename.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldMiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 200, -1));

        jTextFieldLastname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 200, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setText("Mobile");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 145, 80, -1));

        jTextFieldMobile.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, -1));

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 190, 350, -1));

        jTextFieldEmail.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 370, -1));

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel8.setText("Username");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 235, 350, -1));

        jTextFieldUsername.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel2.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 370, -1));

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 350, -1));

        jPasswordFieldPassword.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        jPasswordFieldPassword.setMinimumSize(new java.awt.Dimension(64, 30));
        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel2.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 370, -1));

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanelButton.setPreferredSize(new java.awt.Dimension(394, 60));
        jPanelButton.setLayout(new java.awt.BorderLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));

        jButtonSave.setMnemonic('S');
        jButtonSave.setText("Save");
        jButtonSave.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonSave);

        jPanelButton.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setPreferredSize(new java.awt.Dimension(10, 100));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanelButton.add(jPanel6, java.awt.BorderLayout.WEST);

        jPanel7.setPreferredSize(new java.awt.Dimension(10, 100));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanelButton.add(jPanel7, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanelButton, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(406, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        try {
            switch (this.evt) {
                case "Add":
                    if (pictureFile == null) {
                        int reply = JOptionPane.showConfirmDialog(this,
                                "Are you sure  to save " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + " without picture?",
                                "Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (reply == JOptionPane.YES_OPTION) {
                            setPhoto(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\images\\no photo.jpg"));
                            user.setFirstname(jTextFieldFirstname.getText());
                            user.setMiddlename(jTextFieldMiddlename.getText());
                            user.setLastname(jTextFieldLastname.getText());
                            user.setTelephone(jTextFieldMobile.getText());
                            user.setEmail(jTextFieldEmail.getText());
                            user.setUsername(jTextFieldUsername.getText());
                            user.setPassword(jPasswordFieldPassword.getText());
                            new AppQuery().addUser(user, getPhoto());
                        }
                    } else {
                        int reply = JOptionPane.showConfirmDialog(this,
                                "Are you sure  to save " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + " ?",
                                "Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (reply == JOptionPane.YES_OPTION) {
                            setPhoto(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\images\\model.jpg"));
                            user.setFirstname(jTextFieldFirstname.getText());
                            user.setMiddlename(jTextFieldMiddlename.getText());
                            user.setLastname(jTextFieldLastname.getText());
                            user.setTelephone(jTextFieldMobile.getText());
                            user.setEmail(jTextFieldEmail.getText());
                            user.setUsername(jTextFieldUsername.getText());
                            user.setPassword(jPasswordFieldPassword.getText());
                            new AppQuery().addUser(user, getPhoto());
                        }

                    }
                    this.dispose();
                    break;

                case "Update":
                    if (pictureFile == null) {
                        int reply = JOptionPane.showConfirmDialog(this,
                                "Are you sure  to update " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + " without picture?",
                                "Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (reply == JOptionPane.YES_OPTION) {
                            setPhoto(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\images\\no photo.jpg"));
                            user.setFirstname(jTextFieldFirstname.getText());
                            user.setMiddlename(jTextFieldMiddlename.getText());
                            user.setLastname(jTextFieldLastname.getText());
                            user.setTelephone(jTextFieldMobile.getText());
                            user.setEmail(jTextFieldEmail.getText());
                            user.setUsername(jTextFieldUsername.getText());
                            user.setPassword(jPasswordFieldPassword.getText());
                            new AppQuery().updateUser(user, getPhoto(), user.getId(), false);
                        }
                    } else {
                        int reply = JOptionPane.showConfirmDialog(this,
                                "Are you sure  to update " + jTextFieldFirstname.getText() + "   " + jTextFieldLastname.getText() + " ?",
                                "Confirmation - Exit", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (reply == JOptionPane.YES_OPTION) {
                            setPhoto(new File(System.getProperty("user.dir") + "\\src\\main\\resources\\images\\model.jpg"));
                            user.setFirstname(jTextFieldFirstname.getText());
                            user.setMiddlename(jTextFieldMiddlename.getText());
                            user.setLastname(jTextFieldLastname.getText());
                            user.setTelephone(jTextFieldMobile.getText());
                            user.setEmail(jTextFieldEmail.getText());
                            user.setUsername(jTextFieldUsername.getText());
                            user.setPassword(jPasswordFieldPassword.getText());
                            new AppQuery().updateUser(user, getPhoto(), user.getId(), true);
                        }

                    }
                    this.dispose();
                    break;
                case "Delete":
                    int response = JOptionPane.showConfirmDialog(null, "Are you sure to delete " + user.getFirstname() + " " + user.getLastname() + " ?", "Delete Confirmation!!", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        new AppQuery().deleteUser(user.getId());
                        JOptionPane.showMessageDialog(null, user.getFirstname() + " " + user.getLastname() + " is successfully deleted.", "Message", JOptionPane.PLAIN_MESSAGE);
                    }
                    this.dispose();
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jLabelPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPictureMouseClicked
        browse();
    }//GEN-LAST:event_jLabelPictureMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSave;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstname;
    private javax.swing.JTextField jTextFieldLastname;
    private javax.swing.JTextField jTextFieldMiddlename;
    private javax.swing.JTextField jTextFieldMobile;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the photo
     */
    public File getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(File photo) {
        this.photo = photo;
    }

    private void browse() {
        try {
            int returnVal = jFileChooser1.showOpenDialog(this);

            if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                pictureFile = jFileChooser1.getSelectedFile();

                int IMG_WIDTH = jLabelPicture.getWidth();
                int IMG_HEIGHT = jLabelPicture.getHeight();

                try {
                    BufferedImage originalImage = ImageIO.read(pictureFile);
                    int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

                    BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
                    Graphics2D g = resizedImage.createGraphics();
                    g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
                    g.dispose();
                    g.setComposite(AlphaComposite.Src);

                    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                            RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g.setRenderingHint(RenderingHints.KEY_RENDERING,
                            RenderingHints.VALUE_RENDER_QUALITY);
                    g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

                    jLabelPicture.setIcon(new ImageIcon(resizedImage)); //to eliminate .jpeg from picture filename
                    ImageIO.write(resizedImage, "png", new File("src\\main\\resources\\images\\model.jpg"));

                } catch (final IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Opss...", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void displayPicture() {
        try {
            int IMG_WIDTH = 180;
            int IMG_HEIGHT = 180;
            Blob blobImage = null;
            blobImage = (Blob)new AppQuery().selectUserPicture(user.getId());
            if (blobImage == null) {
                jLabelPicture.setText("No Photo");
            } else {
                jLabelPicture.setText("");
                ImageIcon icon = new ImageIcon(blobImage.getBytes(1L, (int) blobImage.length()));

                Image image = icon.getImage();

                int type = BufferedImage.TYPE_INT_ARGB;

                BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
                Graphics2D g = resizedImage.createGraphics();
                g.drawImage(image, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
                g.dispose();
                g.setComposite(AlphaComposite.Src);

                g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                        RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                g.setRenderingHint(RenderingHints.KEY_RENDERING,
                        RenderingHints.VALUE_RENDER_QUALITY);
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);

                jLabelPicture.setIcon(new ImageIcon(resizedImage));//image to label
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
