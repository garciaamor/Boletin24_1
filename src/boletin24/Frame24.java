/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin24;

/**
 *
 * @author jgarciaamor
 */
public class Frame24 extends javax.swing.JFrame {

    /**
     * Creates new form Frame24
     */
    public Frame24() {
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

        lCrear = new javax.swing.JLabel();
        lUsername = new javax.swing.JLabel();
        lFullname = new javax.swing.JLabel();
        luserid = new javax.swing.JLabel();
        lgroup = new javax.swing.JLabel();
        lhomedirectory = new javax.swing.JLabel();
        lloginshell = new javax.swing.JLabel();
        lpassword = new javax.swing.JLabel();
        lconfirm = new javax.swing.JLabel();
        tusername = new javax.swing.JTextField();
        tufullname = new javax.swing.JTextField();
        tuuserid = new javax.swing.JTextField();
        thomedirectory = new javax.swing.JTextField();
        bcancel = new javax.swing.JButton();
        bok = new javax.swing.JButton();
        cgroup = new javax.swing.JComboBox();
        cloginshell = new javax.swing.JComboBox();
        tpassword = new javax.swing.JPasswordField();
        tconfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New User...");

        lCrear.setText("Create a new user");

        lUsername.setText("User Name:");

        lFullname.setText("Full Name:");

        luserid.setText("User ID:");

        lgroup.setText("Group:");

        lhomedirectory.setText("Home Directory:");

        lloginshell.setText("Login Shell:");

        lpassword.setText("Password:");

        lconfirm.setText("Confirm:");

        tuuserid.setForeground(new java.awt.Color(204, 204, 204));
        tuuserid.setText("(automatic)");
        tuuserid.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        tuuserid.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        tuuserid.setSelectionColor(new java.awt.Color(204, 204, 204));
        tuuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuuseridActionPerformed(evt);
            }
        });
        tuuserid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tuuseridFocusGained(evt);
            }
        });

        thomedirectory.setForeground(new java.awt.Color(204, 204, 204));
        thomedirectory.setText("(automatic)");
        thomedirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thomedirectoryActionPerformed(evt);
            }
        });
        thomedirectory.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                thomedirectoryFocusGained(evt);
            }
        });

        bcancel.setText("Cancel");
        bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelActionPerformed(evt);
            }
        });

        bok.setText("OK");
        bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bokActionPerformed(evt);
            }
        });

        cgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "staff", "cliente", "qwer" }));

        cloginshell.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "/binuksh", "/kinush", "/finush", "/pinush" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lCrear)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lhomedirectory)
                        .addGap(63, 63, 63)
                        .addComponent(thomedirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lUsername)
                            .addGap(95, 95, 95)
                            .addComponent(tusername))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lFullname)
                            .addGap(103, 103, 103)
                            .addComponent(tufullname))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(luserid)
                                .addComponent(lgroup))
                            .addGap(121, 121, 121)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tuuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cgroup, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lpassword)
                            .addComponent(lconfirm)
                            .addComponent(lloginshell))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cloginshell, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tconfirm)
                            .addComponent(tpassword))))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bcancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bok, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsername)
                    .addComponent(tusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFullname)
                    .addComponent(tufullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luserid)
                    .addComponent(tuuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgroup)
                    .addComponent(cgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lhomedirectory)
                    .addComponent(thomedirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lloginshell)
                    .addComponent(cloginshell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lpassword)
                    .addComponent(tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcancel)
                    .addComponent(bok))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tuuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuuseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuuseridActionPerformed

    private void tuuseridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tuuseridFocusGained
        tuuserid.setText("");
    }//GEN-LAST:event_tuuseridFocusGained

    private void thomedirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thomedirectoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thomedirectoryActionPerformed

    private void thomedirectoryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_thomedirectoryFocusGained
        thomedirectory.setText("");
    }//GEN-LAST:event_thomedirectoryFocusGained

    private void bcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelActionPerformed
       System.exit(0);
    }//GEN-LAST:event_bcancelActionPerformed

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bokActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bokActionPerformed

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
            java.util.logging.Logger.getLogger(Frame24.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame24.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame24.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame24.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame24().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bok;
    private javax.swing.JComboBox cgroup;
    private javax.swing.JComboBox cloginshell;
    private javax.swing.JLabel lCrear;
    private javax.swing.JLabel lFullname;
    private javax.swing.JLabel lUsername;
    private javax.swing.JLabel lconfirm;
    private javax.swing.JLabel lgroup;
    private javax.swing.JLabel lhomedirectory;
    private javax.swing.JLabel lloginshell;
    private javax.swing.JLabel lpassword;
    private javax.swing.JLabel luserid;
    private javax.swing.JPasswordField tconfirm;
    private javax.swing.JTextField thomedirectory;
    private javax.swing.JPasswordField tpassword;
    private javax.swing.JTextField tufullname;
    private javax.swing.JTextField tusername;
    private javax.swing.JTextField tuuserid;
    // End of variables declaration//GEN-END:variables
}
