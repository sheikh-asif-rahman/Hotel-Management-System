/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_mng_sys;

/**
 *
 * @author asifs
 */
public class j_manager_control extends javax.swing.JFrame {

    /**
     * Creates new form j_manager_control
     */
    public j_manager_control() {
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
        order_food3 = new javax.swing.JButton();
        order_food4 = new javax.swing.JButton();
        order_food5 = new javax.swing.JButton();

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

        order_food3.setBackground(new java.awt.Color(255, 0, 204));
        order_food3.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        order_food3.setForeground(new java.awt.Color(0, 0, 0));
        order_food3.setText("Return Home");
        order_food3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_food3ActionPerformed(evt);
            }
        });
        jPanel3.add(order_food3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 500, 70));

        order_food4.setBackground(new java.awt.Color(0, 204, 153));
        order_food4.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        order_food4.setForeground(new java.awt.Color(0, 0, 0));
        order_food4.setText("Room Management");
        order_food4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_food4ActionPerformed(evt);
            }
        });
        jPanel3.add(order_food4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 800, 70));

        order_food5.setBackground(new java.awt.Color(0, 204, 153));
        order_food5.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        order_food5.setForeground(new java.awt.Color(0, 0, 0));
        order_food5.setText("Food Counter");
        order_food5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_food5ActionPerformed(evt);
            }
        });
        jPanel3.add(order_food5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 840, 290));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 880, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void order_food3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_food3ActionPerformed
        a_first_page hh=new a_first_page();
        hh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_order_food3ActionPerformed

    private void order_food4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_food4ActionPerformed
        l_room_list aa = new l_room_list();
        aa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_order_food4ActionPerformed

    private void order_food5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_food5ActionPerformed

        k_only_food_list aa= new k_only_food_list();
        aa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_order_food5ActionPerformed

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
            java.util.logging.Logger.getLogger(j_manager_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(j_manager_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(j_manager_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(j_manager_control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new j_manager_control().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton order_food3;
    private javax.swing.JButton order_food4;
    private javax.swing.JButton order_food5;
    // End of variables declaration//GEN-END:variables
}