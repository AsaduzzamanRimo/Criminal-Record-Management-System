/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminaldatabase;

import java.awt.Dimension;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JAVA
 */
public class SplitImageInsert extends javax.swing.JFrame {

    /**
     * Creates new form InsertSplitImage
     */
    public SplitImageInsert() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FCriminal_Id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        criminal_image = new javax.swing.JLabel();
        hair = new javax.swing.JLabel();
        forehead = new javax.swing.JLabel();
        nose = new javax.swing.JLabel();
        eye = new javax.swing.JLabel();
        chin = new javax.swing.JLabel();
        mouth = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CriminalName = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Enter Criminal Id");

        FCriminal_Id.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Press For Automatic Splitting");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setText("Press For Manual Splitting");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        criminal_image.setBackground(new java.awt.Color(255, 255, 204));
        criminal_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        criminal_image.setOpaque(true);
        criminal_image.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                criminal_imageMouseWheelMoved(evt);
            }
        });

        hair.setBackground(new java.awt.Color(255, 255, 204));
        hair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hair.setOpaque(true);
        hair.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                hairMouseWheelMoved(evt);
            }
        });

        forehead.setBackground(new java.awt.Color(255, 255, 204));
        forehead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        forehead.setOpaque(true);
        forehead.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                foreheadMouseWheelMoved(evt);
            }
        });

        nose.setBackground(new java.awt.Color(255, 255, 204));
        nose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nose.setOpaque(true);
        nose.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                noseMouseWheelMoved(evt);
            }
        });

        eye.setBackground(new java.awt.Color(255, 255, 204));
        eye.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eye.setOpaque(true);
        eye.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                eyeMouseWheelMoved(evt);
            }
        });

        chin.setBackground(new java.awt.Color(255, 255, 204));
        chin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chin.setOpaque(true);
        chin.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                chinMouseWheelMoved(evt);
            }
        });

        mouth.setBackground(new java.awt.Color(255, 255, 204));
        mouth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mouth.setOpaque(true);
        mouth.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                mouthMouseWheelMoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Criminal First Name is");

        CriminalName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        CriminalName.setText("Name");

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setText("Preview");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(FCriminal_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CriminalName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hair, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(criminal_image, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forehead, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eye, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nose, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mouth, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(394, 394, 394))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FCriminal_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CriminalName)))
                    .addComponent(criminal_image, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(hair, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(forehead, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(eye, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nose, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mouth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Insert Split Image");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criminal_imageMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_criminal_imageMouseWheelMoved

    }//GEN-LAST:event_criminal_imageMouseWheelMoved

    private void hairMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_hairMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_hairMouseWheelMoved

    private void foreheadMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_foreheadMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_foreheadMouseWheelMoved

    private void noseMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_noseMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_noseMouseWheelMoved

    private void eyeMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_eyeMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_eyeMouseWheelMoved

    private void chinMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_chinMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_chinMouseWheelMoved

    private void mouthMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_mouthMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_mouthMouseWheelMoved

    public static String CrimName = null;
    public static int CrimId=0;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("Getting id");
        ResourceImagesClass icr = new ResourceImagesClass();
        String sid = FCriminal_Id.getText();
        if (sid == null || sid.trim().equals("")) {
            System.out.println("ID Can't Be Blank");
            JOptionPane.showMessageDialog(SplitImageInsert.this, "Id can't be blank");
        } else {
            int id = Integer.parseInt(sid);
            if (DaoCriminalData.checkData(id)) {
                try {
                    int status = 0;
                    Connection con = DB.getConnection();
                    PreparedStatement ps = con.prepareStatement("select * from CriminalData where criminalid=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ps.setInt(1, id);
                    ResultSet rs = ps.executeQuery();
                    rs.beforeFirst();
                    rs.next();
                    CriminalName.setText(rs.getString(3));
                    CrimName = CriminalName.getText();
                    CrimId = rs.getInt(2);
                    CrimName=CrimId+CrimName;
                    System.out.println(CrimId);
                    criminal_image.setIcon(icr.ResizeImage("./Images/Criminalimg/" + CrimName + "/" + CrimName + ".png", null,criminal_image.getWidth(),criminal_image.getHeight()));
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Exception Caught");
                    Logger.getLogger(CriminalDataRetriveSpecific.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.out.println("Record Not found");
                JOptionPane.showMessageDialog(SplitImageInsert.this, "Reord not found to update given id!");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    String hairs = null;
    String foreheads = null;
    String eyes = null;
    String noses = null;
    String mouths = null;
    String chins = null;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("Automatically Splitting");
        ResourceGridImage image = new ResourceGridImage("./Images/Criminalimg/" + CrimName + "/" + CrimName + ".png", 6, 1);
        new Thread(image).start();
        String dir = "./Images/Criminalimg/" + CrimName + "/" + CrimName + "_";
        System.out.println(dir);
        hairs = dir + "hair.png";
        foreheads = dir + "forehead.png";
        eyes = dir + "eye.png";
        noses = dir + "nose.png";
        mouths = dir + "mouth.png";
        chins = dir + "chin.png";
        if (!DaoInsertSplitImage.checkData(CrimId)) {
            int i = DaoInsertSplitImage.save(CrimId, hairs, foreheads, eyes, noses,mouths,chins);
            if (i >= 0) {
                System.out.println("Successfully added");
                JOptionPane.showMessageDialog(SplitImageInsert.this, "Data Added successfully!");
            } else {
                System.out.println("Error: Unable to Add");
                JOptionPane.showMessageDialog(SplitImageInsert.this, "Sorry, unable to Add!");
            }
        } else {
            int i = DaoInsertSplitImage.update(CrimId, hairs, foreheads, eyes, noses,mouths,chins);
            System.out.println("Successfully Upated");
            JOptionPane.showMessageDialog(SplitImageInsert.this, "Data updated successfully ");
        }
        System.out.println("Successfully Created");
        JOptionPane.showMessageDialog(SplitImageInsert.this, "Images Successfully Created");
        // System.out.println("hhhhh"+hairs);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static String crmename() {
        return CrimName;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println("Displaying Preview");
       
        if (DaoInsertSplitImage.checkData(CrimId)) {
                try {
                    int status = 0;
                    Connection con = DB.getConnection();
                    PreparedStatement ps = con.prepareStatement("select * from criminalsplitimage where criminalid=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ps.setInt(1, CrimId);
                    ResultSet rs = ps.executeQuery();
                    rs.beforeFirst();
                    rs.next();
                    String h=rs.getString(3);
                    String f=rs.getString(4);
                    String e=rs.getString(5);
                    String n=rs.getString(6);
                    String m=rs.getString(7);
                    String c=rs.getString(8);
                    con.close();
                    setSplitImg(h, f, e, n, m, c);
                } catch (SQLException ex) {
                    System.out.println("Exception Caught");
                    Logger.getLogger(CriminalDataRetriveSpecific.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
            System.out.println("Error: Record Not Found");
                JOptionPane.showMessageDialog(SplitImageInsert.this, "Record not found to update given id!");
            }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println("Opening Manually Image Splitting Page");
        SplitImageManuallySplit.main(new String[]{});
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.out.println("Returning to home Page");
        frame.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(SplitImageInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplitImageInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplitImageInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplitImageInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new SplitImageInsert();
                frame.setVisible(true);
                frame.setResizable(false);
                frame.setPreferredSize(new Dimension(500, 500));
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CriminalName;
    private javax.swing.JTextField FCriminal_Id;
    private javax.swing.JLabel chin;
    private javax.swing.JLabel criminal_image;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel forehead;
    private javax.swing.JLabel hair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mouth;
    private javax.swing.JLabel nose;
    // End of variables declaration//GEN-END:variables
    static SplitImageInsert frame;

    private void setSplitImg(String h, String f, String e, String n, String m, String c) {
        ResourceImagesClass icr = new ResourceImagesClass();
        hair.setIcon(icr.ResizeImage(h, null,hair.getWidth(),hair.getHeight()));
        forehead.setIcon(icr.ResizeImage(f, null,forehead.getWidth(),forehead.getHeight()));
        eye.setIcon(icr.ResizeImage(e, null,eye.getWidth(),eye.getHeight()));
        nose.setIcon(icr.ResizeImage(n, null,nose.getWidth(),nose.getHeight()));
        mouth.setIcon(icr.ResizeImage(m, null,mouth.getWidth(),mouth.getHeight()));
        chin.setIcon(icr.ResizeImage(c, null,chin.getWidth(),chin.getHeight()));
    }
}
