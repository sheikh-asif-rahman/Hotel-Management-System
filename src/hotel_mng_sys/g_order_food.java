package hotel_mng_sys;

import javax.swing.table.DefaultTableModel;

public class g_order_food extends javax.swing.JFrame {
    
    public g_order_food() {
        initComponents();
    }
    public int calculation(int a,int b,int c, int d){
        int a1=a*200;
        int b1= b*50;
        int c1= c*400;
        int d1= d*50;
        int total=a1+b1+c1+d1;
        return total;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        order_food2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        soft_drink_unit = new javax.swing.JTextField();
        chicken_unit = new javax.swing.JTextField();
        burger_unit = new javax.swing.JTextField();
        pizza_unit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

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

        order_food2.setBackground(new java.awt.Color(255, 153, 51));
        order_food2.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        order_food2.setForeground(new java.awt.Color(0, 0, 0));
        order_food2.setText("DONE");
        order_food2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_food2ActionPerformed(evt);
            }
        });
        jPanel3.add(order_food2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 270, 70));

        jLabel8.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("4) 7up-[1 l.]   50Tk/unit");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 480, 70));

        soft_drink_unit.setBackground(new java.awt.Color(0, 0, 0));
        soft_drink_unit.setFont(new java.awt.Font("Lucida Console", 1, 50)); // NOI18N
        soft_drink_unit.setForeground(new java.awt.Color(102, 204, 0));
        soft_drink_unit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soft_drink_unit.setText("00");
        soft_drink_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soft_drink_unitActionPerformed(evt);
            }
        });
        jPanel3.add(soft_drink_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 100, 60));

        chicken_unit.setBackground(new java.awt.Color(0, 0, 0));
        chicken_unit.setFont(new java.awt.Font("Lucida Console", 1, 50)); // NOI18N
        chicken_unit.setForeground(new java.awt.Color(102, 204, 0));
        chicken_unit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        chicken_unit.setText("00");
        chicken_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicken_unitActionPerformed(evt);
            }
        });
        jPanel3.add(chicken_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 100, 60));

        burger_unit.setBackground(new java.awt.Color(0, 0, 0));
        burger_unit.setFont(new java.awt.Font("Lucida Console", 1, 50)); // NOI18N
        burger_unit.setForeground(new java.awt.Color(102, 204, 0));
        burger_unit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        burger_unit.setText("00");
        burger_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burger_unitActionPerformed(evt);
            }
        });
        jPanel3.add(burger_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 100, 60));

        pizza_unit.setBackground(new java.awt.Color(0, 0, 0));
        pizza_unit.setFont(new java.awt.Font("Lucida Console", 1, 50)); // NOI18N
        pizza_unit.setForeground(new java.awt.Color(102, 204, 0));
        pizza_unit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pizza_unit.setText("00");
        pizza_unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizza_unitActionPerformed(evt);
            }
        });
        jPanel3.add(pizza_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 100, 60));

        jLabel2.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UNITS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 160, 70));

        jLabel3.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ITEMS");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 490, 70));

        jLabel12.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("2) Burger      50Tk/unit");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 450, 70));

        jLabel13.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("3) Pizza       400Tk/unit");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 460, 70));

        jLabel14.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("1) Chicken    200Tk/unit");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 440, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 740, 490));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 780, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void order_food2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_food2ActionPerformed
      
      
        
        int a2=Integer.parseInt(chicken_unit.getText()); 
        int b2=Integer.parseInt(burger_unit.getText());
        int c2=Integer.parseInt(pizza_unit.getText());
        int d2=Integer.parseInt(soft_drink_unit.getText());
        
        int t_cost=calculation(a2,b2,c2,d2);
      
        h_bill_page aa =new h_bill_page();
        aa.setVisible(true);
        this.setVisible(false);
        aa.total1(t_cost);
        aa.bill();
        
        
      
    }//GEN-LAST:event_order_food2ActionPerformed

    private void soft_drink_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soft_drink_unitActionPerformed
        
    }//GEN-LAST:event_soft_drink_unitActionPerformed

    private void chicken_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicken_unitActionPerformed
        
    }//GEN-LAST:event_chicken_unitActionPerformed

    private void burger_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_unitActionPerformed
        
    }//GEN-LAST:event_burger_unitActionPerformed

    private void pizza_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_unitActionPerformed
       
    }//GEN-LAST:event_pizza_unitActionPerformed

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
            java.util.logging.Logger.getLogger(g_order_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(g_order_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(g_order_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(g_order_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new g_order_food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField burger_unit;
    private javax.swing.JTextField chicken_unit;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton order_food2;
    private javax.swing.JTextField pizza_unit;
    private javax.swing.JTextField soft_drink_unit;
    // End of variables declaration//GEN-END:variables
}

