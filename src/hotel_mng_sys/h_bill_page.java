package hotel_mng_sys;
import static java.lang.String.valueOf;
public class h_bill_page extends javax.swing.JFrame {
    public h_bill_page() {
        initComponents();
    }
    public void bill(){
    
     }
    int room_total,food_total;
  
     public void total1(int cost){
  
        total_cost.setText(valueOf(cost));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        return_home = new javax.swing.JButton();
        total_cost = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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

        return_home.setBackground(new java.awt.Color(204, 0, 204));
        return_home.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        return_home.setForeground(new java.awt.Color(255, 255, 255));
        return_home.setText("Return Home");
        return_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_homeActionPerformed(evt);
            }
        });
        jPanel3.add(return_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 350, 70));

        total_cost.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        total_cost.setForeground(new java.awt.Color(153, 255, 0));
        total_cost.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_cost.setText("0");
        jPanel3.add(total_cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, 90));

        jLabel7.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tk");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 110, 90));

        jLabel9.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 90));

        jLabel10.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-----------------------------------");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 510, 90));

        jLabel11.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("-----------------------------------");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 510, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 240));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 560, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void return_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_homeActionPerformed
       a_first_page aa= new a_first_page();
       aa.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_return_homeActionPerformed
    public static void main(String args[]){
       // int total=get_cost1()+get_cost2();
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(h_bill_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(h_bill_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(h_bill_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(h_bill_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new h_bill_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton return_home;
    private javax.swing.JLabel total_cost;
    // End of variables declaration//GEN-END:variables
}
