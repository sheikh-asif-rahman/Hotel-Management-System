package hotel_mng_sys;

import javax.swing.JOptionPane;

public class d_romm_food extends javax.swing.JFrame {

    public d_romm_food() {
        initComponents();
    }
    int a=0,b=0,c=0,d=0,sum7;
    public int total(int hhh){
      
         int a1=1200,b1=1000,c1=800,d1=600;
         int a2=a*a1;
         int b2=b*b1;
         int c2=c*c1;
         int d2=d*d1;
         int sum5=a2+b2+c2+d2;
         sum7=sum5*hhh;
         return sum7;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        d_b_n = new javax.swing.JLabel();
        room_day = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        s_b_n = new javax.swing.JRadioButton();
        d_b_l = new javax.swing.JRadioButton();
        s_b_l = new javax.swing.JRadioButton();
        double_bed_normal = new javax.swing.JRadioButton();
        room_food_done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Days");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 150, 70));

        jLabel4.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("1200Tk per Day");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 480, 70));

        jLabel5.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("1000Tk per Day");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 480, 70));

        d_b_n.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        d_b_n.setForeground(new java.awt.Color(0, 0, 0));
        d_b_n.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d_b_n.setText("800 Tk per Day");
        jPanel4.add(d_b_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 480, 70));

        room_day.setBackground(new java.awt.Color(0, 0, 0));
        room_day.setFont(new java.awt.Font("Lucida Console", 1, 50)); // NOI18N
        room_day.setForeground(new java.awt.Color(102, 204, 0));
        room_day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        room_day.setText("00");
        room_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_dayActionPerformed(evt);
            }
        });
        jPanel4.add(room_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 100, 60));

        jLabel7.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("600Tk per Day");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 480, 70));

        jLabel8.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Book for:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 190, 70));

        s_b_n.setBackground(new java.awt.Color(255, 0, 204));
        s_b_n.setFont(new java.awt.Font("Footlight MT Light", 1, 40)); // NOI18N
        s_b_n.setForeground(new java.awt.Color(0, 0, 0));
        s_b_n.setText("Single Bed Normal");
        s_b_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_b_nActionPerformed(evt);
            }
        });
        jPanel4.add(s_b_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 410, 60));

        d_b_l.setBackground(new java.awt.Color(255, 0, 204));
        d_b_l.setFont(new java.awt.Font("Footlight MT Light", 1, 40)); // NOI18N
        d_b_l.setForeground(new java.awt.Color(0, 0, 0));
        d_b_l.setText("Double Bed Luxury");
        d_b_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_b_lActionPerformed(evt);
            }
        });
        jPanel4.add(d_b_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 60));

        s_b_l.setBackground(new java.awt.Color(255, 0, 204));
        s_b_l.setFont(new java.awt.Font("Footlight MT Light", 1, 40)); // NOI18N
        s_b_l.setForeground(new java.awt.Color(0, 0, 0));
        s_b_l.setText("Single Bed Luxury");
        s_b_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_b_lActionPerformed(evt);
            }
        });
        jPanel4.add(s_b_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 410, 60));

        double_bed_normal.setBackground(new java.awt.Color(255, 0, 204));
        double_bed_normal.setFont(new java.awt.Font("Footlight MT Light", 1, 40)); // NOI18N
        double_bed_normal.setForeground(new java.awt.Color(0, 0, 0));
        double_bed_normal.setText("Double Bed Normal");
        double_bed_normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                double_bed_normalActionPerformed(evt);
            }
        });
        jPanel4.add(double_bed_normal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 410, 60));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 480, 610));

        room_food_done.setBackground(new java.awt.Color(255, 153, 51));
        room_food_done.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        room_food_done.setForeground(new java.awt.Color(0, 0, 0));
        room_food_done.setText("DONE");
        room_food_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room_food_doneActionPerformed(evt);
            }
        });
        jPanel3.add(room_food_done, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 260, 120));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 650));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 840, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void room_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_dayActionPerformed

    }//GEN-LAST:event_room_dayActionPerformed

    private void room_food_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room_food_doneActionPerformed
        
        int ggg=Integer.parseInt(room_day.getText());
        if(ggg==00){
            JOptionPane.showMessageDialog(this,"Please Enter How Many days you want to stay ","Notice",JOptionPane.INFORMATION_MESSAGE);    
        }else{
       int ghf=total(ggg);

        e_room_food_bill aa=new e_room_food_bill();
        aa.room_cost(ghf);
aa.setVisible(true);
this.setVisible(false);
        }
    }//GEN-LAST:event_room_food_doneActionPerformed

    private void d_b_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_b_lActionPerformed
        if(d_b_l.isContentAreaFilled()){
            a=1;
        }
    }//GEN-LAST:event_d_b_lActionPerformed

    private void s_b_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_b_lActionPerformed
        if(s_b_l.isContentAreaFilled()){
            b=1;
        }
    }//GEN-LAST:event_s_b_lActionPerformed

    private void double_bed_normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_double_bed_normalActionPerformed
        if(double_bed_normal.isContentAreaFilled()){
            c=1;
        }
    }//GEN-LAST:event_double_bed_normalActionPerformed

    private void s_b_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_b_nActionPerformed
        if(s_b_n.isContentAreaFilled()){
            d=1;
    }
    }//GEN-LAST:event_s_b_nActionPerformed

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
            java.util.logging.Logger.getLogger(d_romm_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d_romm_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d_romm_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d_romm_food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d_romm_food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton d_b_l;
    private javax.swing.JLabel d_b_n;
    private javax.swing.JRadioButton double_bed_normal;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField room_day;
    private javax.swing.JButton room_food_done;
    private javax.swing.JRadioButton s_b_l;
    private javax.swing.JRadioButton s_b_n;
    // End of variables declaration//GEN-END:variables
}
