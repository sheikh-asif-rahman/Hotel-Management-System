package hotel_mng_sys;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.String.valueOf;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class k_only_food_list extends javax.swing.JFrame {
    public k_only_food_list() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        update_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        year_box = new javax.swing.JComboBox<>();
        month_box = new javax.swing.JComboBox<>();
        day_box = new javax.swing.JComboBox<>();
        order_food4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        total_cost_lb = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        soft_drink_unit = new javax.swing.JTextField();
        chicken_unit = new javax.swing.JTextField();
        burger_unit = new javax.swing.JTextField();
        pizza_unit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        eport = new javax.swing.JButton();
        go_return = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        exit = new javax.swing.JButton();

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

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Name", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(1);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 610));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date :");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 40));

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name :");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 40));

        update_name.setBackground(new java.awt.Color(255, 255, 255));
        update_name.setFont(new java.awt.Font("Goudy Old Style", 1, 40)); // NOI18N
        update_name.setForeground(new java.awt.Color(0, 0, 0));
        update_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(update_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 380, 50));

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tk");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 70, 40));

        year_box.setBackground(new java.awt.Color(255, 255, 255));
        year_box.setFont(new java.awt.Font("Imprint MT Shadow", 1, 50)); // NOI18N
        year_box.setForeground(new java.awt.Color(0, 0, 0));
        year_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2023", "2024" }));
        year_box.setToolTipText("");
        year_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                year_boxKeyTyped(evt);
            }
        });
        jPanel4.add(year_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 160, 50));

        month_box.setBackground(new java.awt.Color(255, 255, 255));
        month_box.setFont(new java.awt.Font("Imprint MT Shadow", 1, 50)); // NOI18N
        month_box.setForeground(new java.awt.Color(0, 0, 0));
        month_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        month_box.setToolTipText("");
        jPanel4.add(month_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 100, 50));

        day_box.setBackground(new java.awt.Color(255, 255, 255));
        day_box.setFont(new java.awt.Font("Imprint MT Shadow", 1, 50)); // NOI18N
        day_box.setForeground(new java.awt.Color(0, 0, 0));
        day_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day_box.setToolTipText("");
        jPanel4.add(day_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 100, 50));

        order_food4.setBackground(new java.awt.Color(0, 204, 153));
        order_food4.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        order_food4.setForeground(new java.awt.Color(0, 0, 0));
        order_food4.setText("Update");
        order_food4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_food4ActionPerformed(evt);
            }
        });
        jPanel4.add(order_food4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 240, 60));

        jLabel7.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total :");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 110, 40));

        total_cost_lb.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        total_cost_lb.setForeground(new java.awt.Color(0, 0, 0));
        total_cost_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_cost_lb.setText("0");
        jPanel4.add(total_cost_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 120, 40));

        jLabel9.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("4) 7up-[1 l.]   50Tk/unit");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 460, 70));

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
        jPanel4.add(soft_drink_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 100, 50));

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
        jPanel4.add(chicken_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 100, 50));

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
        jPanel4.add(burger_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 100, 50));

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
        jPanel4.add(pizza_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 100, 50));

        jLabel2.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UNITS");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 120, 70));

        jLabel10.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-------------------------------------------");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 580, 60));

        jLabel11.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("1) Chicken    200Tk/unit");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 440, 70));

        jLabel12.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("2) Burger      50Tk/unit");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 450, 70));

        jLabel13.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("3) Pizza       400Tk/unit");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 460, 70));

        jLabel14.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ITEMS");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 310, 60));

        jLabel15.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("-------------------------------------------");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 580, 60));

        jLabel16.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("-------------------------------------------");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 580, 60));

        jLabel17.setFont(new java.awt.Font("Freestyle Script", 1, 45)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("-------------------------------------------");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 580, 60));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 580, 660));

        eport.setBackground(new java.awt.Color(255, 0, 153));
        eport.setFont(new java.awt.Font("Ink Free", 1, 45)); // NOI18N
        eport.setForeground(new java.awt.Color(0, 0, 0));
        eport.setText("Export");
        eport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eportActionPerformed(evt);
            }
        });
        jPanel3.add(eport, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 180, 60));

        go_return.setBackground(new java.awt.Color(102, 255, 255));
        go_return.setFont(new java.awt.Font("Ink Free", 1, 45)); // NOI18N
        go_return.setForeground(new java.awt.Color(0, 0, 0));
        go_return.setText("Return");
        go_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_returnActionPerformed(evt);
            }
        });
        jPanel3.add(go_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, -1, 60));

        delete.setBackground(new java.awt.Color(255, 255, 0));
        delete.setFont(new java.awt.Font("Ink Free", 1, 45)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, 60));

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Ink Free", 1, 45)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 630, 180, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1380, 700));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1430, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eportActionPerformed
     
        DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
       
        FileOutputStream excelFOU = null;
           BufferedOutputStream excelBOU = null;
           XSSFWorkbook excelJTableExporter =null;
        
        JFileChooser excelFileChooser = new JFileChooser();
       excelFileChooser.setDialogTitle("Save As");
        FileNameExtensionFilter fnef =new FileNameExtensionFilter("EXCEL FILES","xls","xlsm","xlsx");
       excelFileChooser.setFileFilter(fnef);
       int excelChooser= excelFileChooser.showSaveDialog(null);
        
       if(excelChooser == JFileChooser.APPROVE_OPTION){
             
            try {
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelSheet = excelJTableExporter.createSheet("JTable Sheet");
                for(int i=0;i<model.getRowCount();i++){
                    XSSFRow excelRow= excelSheet.createRow(i);
                    for(int j=0;j<model.getColumnCount();j++){
                        XSSFCell excelCell = excelRow.createCell(j);
                        excelCell.setCellValue(model.getValueAt(i, j).toString());
                    }
                }  
                excelFOU = new FileOutputStream(excelFileChooser.getSelectedFile()+".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null, "Exported Successfully !!..........");
                
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if(excelBOU != null){
                        excelBOU.close();
                    }
                    
                    if(excelFOU != null){
                        excelFOU.close();
                    }
                    
                    if(excelJTableExporter != null){
                        excelJTableExporter.close();
                    }
                    excelFOU.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
           
       }
    
        
    }//GEN-LAST:event_eportActionPerformed

    private void year_boxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_year_boxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_year_boxKeyTyped

    private void order_food4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_food4ActionPerformed

        int a2=Integer.parseInt(chicken_unit.getText()); 
        int b2=Integer.parseInt(burger_unit.getText());
        int c2=Integer.parseInt(pizza_unit.getText());
        int d2=Integer.parseInt(soft_drink_unit.getText());

        int t_cost=calculation(a2,b2,c2,d2);
        
        String in1= day_box.getSelectedItem().toString();
        String in2=month_box.getSelectedItem().toString();
        String in3=year_box.getSelectedItem().toString();
        String in4= new String(in1+"."+in2+"."+in3);
        total_cost_lb.setText(valueOf(t_cost));
        
        
        
        
      DefaultTableModel model =(DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[] {
        in4,
        update_name.getText(),
        t_cost
        
    });
    }//GEN-LAST:event_order_food4ActionPerformed

    private void go_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_returnActionPerformed
     a_first_page aa= new a_first_page();
        aa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_go_returnActionPerformed

    private void soft_drink_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soft_drink_unitActionPerformed

    }//GEN-LAST:event_soft_drink_unitActionPerformed

    private void chicken_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicken_unitActionPerformed

    }//GEN-LAST:event_chicken_unitActionPerformed

    private void burger_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_unitActionPerformed

    }//GEN-LAST:event_burger_unitActionPerformed

    private void pizza_unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizza_unitActionPerformed

    }//GEN-LAST:event_pizza_unitActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
       if(jTable1.getSelectedRow()==-1){
           if(jTable1.getRowCount()==0){
               JOptionPane.showMessageDialog(null,"No Data To Delete","Hotel Management System!!",JOptionPane.OK_OPTION);
           }else{
               JOptionPane.showMessageDialog(null,"Select a row to Delete","Hotel Management System",JOptionPane.OK_OPTION);
           }   
       }else{
           model.removeRow(jTable1.getSelectedRow());
       }        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed
private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit \n All data will be removed !!", "Warnning!!", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }        
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(k_only_food_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(k_only_food_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(k_only_food_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(k_only_food_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new k_only_food_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField burger_unit;
    private javax.swing.JTextField chicken_unit;
    private javax.swing.JComboBox<String> day_box;
    private javax.swing.JButton delete;
    private javax.swing.JButton eport;
    private javax.swing.JButton exit;
    private javax.swing.JButton go_return;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> month_box;
    private javax.swing.JButton order_food4;
    private javax.swing.JTextField pizza_unit;
    private javax.swing.JTextField soft_drink_unit;
    private javax.swing.JLabel total_cost_lb;
    private javax.swing.JTextField update_name;
    private javax.swing.JComboBox<String> year_box;
    // End of variables declaration//GEN-END:variables
}
