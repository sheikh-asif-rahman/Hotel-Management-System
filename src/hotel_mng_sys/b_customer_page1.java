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
public class b_customer_page1 extends javax.swing.JFrame {

    /**
     * Creates new form b_customer_page1
     */
    public b_customer_page1() {
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
        room_select = new javax.swing.JButton();
        room_select1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        room_select.setBackground(new java.awt.Color(255, 51, 255));
        room_select.setFont(new java.awt.Font("Ink Free", 1, 70)); // NOI18N
        room_select.setForeground(new java.awt.Color(0, 0, 0));
        room_select.setText("Want To Eat?");
        room_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_selectActionPerformed(evt);
            }
        });
        jPanel3.add(room_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 650, 90));

        room_select1.setBackground(new java.awt.Color(255, 51, 255));
        room_select1.setFont(new java.awt.Font("Ink Free", 1, 70)); // NOI18N
        room_select1.setForeground(new java.awt.Color(0, 0, 0));
        room_select1.setText("Want To Stay?");
        room_select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_select1ActionPerformed(evt);
            }
        });
        jPanel3.add(room_select1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 650, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void room_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_selectActionPerformed
g_order_food hh=new  g_order_food();
hh.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_room_selectActionPerformed

    private void room_select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_select1ActionPerformed
        d_romm_food cc = new d_romm_food();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_room_select1ActionPerformed

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
            java.util.logging.Logger.getLogger(b_customer_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(b_customer_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(b_customer_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(b_customer_page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new b_customer_page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton room_select;
    private javax.swing.JButton room_select1;
    // End of variables declaration//GEN-END:variables
}
