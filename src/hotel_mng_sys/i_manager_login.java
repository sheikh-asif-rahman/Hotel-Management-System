/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_mng_sys;

import javax.swing.JOptionPane;

/**
 *
 * @author asifs
 */
public class i_manager_login extends javax.swing.JFrame {

    /**
     * Creates new form i_manager_login
     */
    public i_manager_login() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        order_food2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        order_food3 = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        user_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        order_food2.setBackground(new java.awt.Color(255, 0, 204));
        order_food2.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        order_food2.setForeground(new java.awt.Color(0, 0, 0));
        order_food2.setText("Enter");
        order_food2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_food2ActionPerformed(evt);
            }
        });
        jPanel3.add(order_food2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 270, 70));

        jLabel8.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 70));

        jLabel9.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("User Name:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 70));

        order_food3.setBackground(new java.awt.Color(0, 204, 153));
        order_food3.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        order_food3.setForeground(new java.awt.Color(0, 0, 0));
        order_food3.setText("Return");
        order_food3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_food3ActionPerformed(evt);
            }
        });
        jPanel3.add(order_food3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 270, 70));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Lucida Console", 1, 50)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 400, 60));

        user_name.setBackground(new java.awt.Color(255, 255, 255));
        user_name.setFont(new java.awt.Font("Lucida Console", 1, 50)); // NOI18N
        user_name.setForeground(new java.awt.Color(0, 0, 0));
        user_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });
        jPanel3.add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 400, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 680, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void order_food2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_food2ActionPerformed
        if(user_name.getText().equals("FAIZA") && password.getText().equals("ABCD")){
         j_manager_control gg= new j_manager_control();
         gg.setVisible(true);
         this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this,"!!! Wrong User Name or password  !!!","Warninng",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_order_food2ActionPerformed

    private void order_food3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_food3ActionPerformed
        a_first_page hh=new a_first_page();
        hh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_order_food3ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_nameActionPerformed

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
            java.util.logging.Logger.getLogger(i_manager_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(i_manager_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(i_manager_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(i_manager_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new i_manager_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton order_food2;
    private javax.swing.JButton order_food3;
    private javax.swing.JTextField password;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}