
package hotel_mng_sys;
import java.io.BufferedOutputStream;
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

public class l_room_list extends javax.swing.JFrame {

    public l_room_list() {
        initComponents();
    }
    String kk="",ll="",mm="",nn="";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        room_list_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        c_cin_year = new javax.swing.JComboBox<>();
        c_cin_month = new javax.swing.JComboBox<>();
        c_cin_day = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        c_room_days = new javax.swing.JTextField();
        c_mail = new javax.swing.JTextField();
        c_gender = new javax.swing.JComboBox<>();
        c_phone = new javax.swing.JTextField();
        c_nid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        c_sbn = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        total_cost_room = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        c_dbl = new javax.swing.JRadioButton();
        c_sbl = new javax.swing.JRadioButton();
        c_dbn = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        total = new javax.swing.JButton();
        go_return = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        c_name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        Export = new javax.swing.JButton();

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

        room_list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Name", "Phone", "Gender", "NID", "Mail Address", "Room Type", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(room_list_table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 1020, 570));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mail Address :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, 40));

        c_cin_year.setBackground(new java.awt.Color(255, 255, 255));
        c_cin_year.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        c_cin_year.setForeground(new java.awt.Color(0, 0, 0));
        c_cin_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2023", "2024" }));
        c_cin_year.setToolTipText("");
        c_cin_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_cin_yearKeyTyped(evt);
            }
        });
        jPanel3.add(c_cin_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 160, 30));

        c_cin_month.setBackground(new java.awt.Color(255, 255, 255));
        c_cin_month.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        c_cin_month.setForeground(new java.awt.Color(0, 0, 0));
        c_cin_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        c_cin_month.setToolTipText("");
        jPanel3.add(c_cin_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 70, 30));

        c_cin_day.setBackground(new java.awt.Color(255, 255, 255));
        c_cin_day.setFont(new java.awt.Font("Imprint MT Shadow", 1, 30)); // NOI18N
        c_cin_day.setForeground(new java.awt.Color(0, 0, 0));
        c_cin_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        c_cin_day.setToolTipText("");
        jPanel3.add(c_cin_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 70, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 170, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Name :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Phone :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gender :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NID no. :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("------------------------------------------------------------");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 660, 40));

        c_room_days.setBackground(new java.awt.Color(255, 255, 255));
        c_room_days.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        c_room_days.setForeground(new java.awt.Color(0, 0, 0));
        c_room_days.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c_room_days.setText("0");
        jPanel3.add(c_room_days, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 110, 40));

        c_mail.setBackground(new java.awt.Color(255, 255, 255));
        c_mail.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        c_mail.setForeground(new java.awt.Color(0, 0, 0));
        c_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(c_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 360, 40));

        c_gender.setBackground(new java.awt.Color(255, 255, 255));
        c_gender.setFont(new java.awt.Font("Javanese Text", 1, 30)); // NOI18N
        c_gender.setForeground(new java.awt.Color(0, 0, 0));
        c_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(c_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 180, 40));

        c_phone.setBackground(new java.awt.Color(255, 255, 255));
        c_phone.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        c_phone.setForeground(new java.awt.Color(0, 0, 0));
        c_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(c_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 360, 40));

        c_nid.setBackground(new java.awt.Color(255, 255, 255));
        c_nid.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        c_nid.setForeground(new java.awt.Color(0, 0, 0));
        c_nid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(c_nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 360, 40));

        jLabel8.setFont(new java.awt.Font("Freestyle Script", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("600Tk per Day");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 180, 40));

        c_sbn.setBackground(new java.awt.Color(51, 255, 255));
        c_sbn.setFont(new java.awt.Font("Footlight MT Light", 1, 25)); // NOI18N
        c_sbn.setForeground(new java.awt.Color(0, 0, 0));
        c_sbn.setText("Single Bed Normal");
        c_sbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_sbnActionPerformed(evt);
            }
        });
        jPanel3.add(c_sbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 250, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Days");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 120, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Room Type :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 210, 40));

        total_cost_room.setBackground(new java.awt.Color(255, 255, 255));
        total_cost_room.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        total_cost_room.setForeground(new java.awt.Color(0, 0, 0));
        total_cost_room.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_cost_room.setText("00");
        jPanel3.add(total_cost_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 140, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("------------------------------------------------------------");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 660, 40));

        c_dbl.setBackground(new java.awt.Color(51, 255, 255));
        c_dbl.setFont(new java.awt.Font("Footlight MT Light", 1, 25)); // NOI18N
        c_dbl.setForeground(new java.awt.Color(0, 0, 0));
        c_dbl.setText("Double Bed Luxury");
        c_dbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dblActionPerformed(evt);
            }
        });
        jPanel3.add(c_dbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 250, 30));

        c_sbl.setBackground(new java.awt.Color(51, 255, 255));
        c_sbl.setFont(new java.awt.Font("Footlight MT Light", 1, 25)); // NOI18N
        c_sbl.setForeground(new java.awt.Color(0, 0, 0));
        c_sbl.setText("Single Bed Luxury");
        c_sbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_sblActionPerformed(evt);
            }
        });
        jPanel3.add(c_sbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 250, 30));

        c_dbn.setBackground(new java.awt.Color(51, 255, 255));
        c_dbn.setFont(new java.awt.Font("Footlight MT Light", 1, 25)); // NOI18N
        c_dbn.setForeground(new java.awt.Color(0, 0, 0));
        c_dbn.setText("Double Bed Normal");
        c_dbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_dbnActionPerformed(evt);
            }
        });
        jPanel3.add(c_dbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 250, 30));

        jLabel16.setFont(new java.awt.Font("Freestyle Script", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("1200Tk per Day");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 180, 40));

        jLabel17.setFont(new java.awt.Font("Freestyle Script", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("1000Tk per Day");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 180, 40));

        jLabel18.setFont(new java.awt.Font("Freestyle Script", 1, 30)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("800Tk per Day");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 180, 40));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("------------------------------------------------------------");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 660, 40));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("------------------------------------------------------------");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 660, 40));

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1540, 610, 160, 70));

        total.setBackground(new java.awt.Color(255, 51, 153));
        total.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));
        total.setText("Total");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, 50));

        go_return.setBackground(new java.awt.Color(102, 255, 255));
        go_return.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        go_return.setForeground(new java.awt.Color(0, 0, 0));
        go_return.setText("Return");
        go_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_returnActionPerformed(evt);
            }
        });
        jPanel3.add(go_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 610, 200, 70));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Cost Per Day :");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 210, 40));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Total :");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 90, 40));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Tk");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, 90, 40));

        delete.setBackground(new java.awt.Color(255, 255, 0));
        delete.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 610, -1, 70));

        c_name.setBackground(new java.awt.Color(255, 255, 255));
        c_name.setFont(new java.awt.Font("Goudy Old Style", 1, 30)); // NOI18N
        c_name.setForeground(new java.awt.Color(0, 0, 0));
        c_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(c_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 360, 40));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Book Room For : ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 270, 40));

        update.setBackground(new java.awt.Color(0, 255, 0));
        update.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, -1, 70));

        Export.setBackground(new java.awt.Color(255, 153, 153));
        Export.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        Export.setForeground(new java.awt.Color(0, 0, 0));
        Export.setText("Export");
        Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportActionPerformed(evt);
            }
        });
        jPanel3.add(Export, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, -1, 70));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1730, 700));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1780, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1820, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c_cin_yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_cin_yearKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cin_yearKeyTyped

    private void c_sbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_sbnActionPerformed
       if(c_sbn.isContentAreaFilled()){
        d=1;
        nn="Single Bed Normal";
    }
    }//GEN-LAST:event_c_sbnActionPerformed

    private void c_dblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dblActionPerformed
        if(c_dbl.isContentAreaFilled()){
        a=1;
        kk="Double Bed Luxury";
    }
    }//GEN-LAST:event_c_dblActionPerformed

    private void c_sblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_sblActionPerformed
        if(c_sbl.isContentAreaFilled()){
        b=1;
        ll="Single Bed Luxury";
    }
    }//GEN-LAST:event_c_sblActionPerformed

    private void c_dbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_dbnActionPerformed
        if(c_dbn.isContentAreaFilled()){
        c=1;
        mm="Double Bed Normal";
    }
    }//GEN-LAST:event_c_dbnActionPerformed
private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit \n All data will be removed !!", "Warnning!!", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        int ggg=Integer.parseInt(c_room_days.getText());
       
        if(ggg==00){
            JOptionPane.showMessageDialog(this,"Please Enter How Many days you want to stay ","Notice",JOptionPane.INFORMATION_MESSAGE);    
        }else{
        int ghf=total(ggg);
        total_cost_room.setText(valueOf(ghf));
        }
        
    }//GEN-LAST:event_totalActionPerformed

    private void go_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_returnActionPerformed
        a_first_page aa= new a_first_page();
        aa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_go_returnActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel model=(DefaultTableModel) room_list_table.getModel();
       if(room_list_table.getSelectedRow()==-1){
           if(room_list_table.getRowCount()==0){
               JOptionPane.showMessageDialog(null,"No Data To Delete","Hotel Management System!!",JOptionPane.OK_OPTION);
           }else{
               JOptionPane.showMessageDialog(null,"Select a row to Delete","Hotel Management System",JOptionPane.OK_OPTION);
           }   
       }else{
           model.removeRow(room_list_table.getSelectedRow());
       }  
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
int ggg=Integer.parseInt(c_room_days.getText());
       
        if(ggg==00){
            JOptionPane.showMessageDialog(this,"Please Enter How Many days you want to stay ","Notice",JOptionPane.INFORMATION_MESSAGE);    
        }else{
        
        String room="";
if(kk=="Double Bed Luxury"){
    room="Double Bed Luxury";
}else if(ll=="Single Bed Luxury"){
    room="Single Bed Luxury";
}else if(mm=="Double Bed Normal"){
    room ="Double Bed Normal";
}else if(nn=="Single Bed Normal"){
    room="Single Bed Normal";
}


        String in1= c_cin_day.getSelectedItem().toString();
        String in2=c_cin_month.getSelectedItem().toString();
        String in3=c_cin_year.getSelectedItem().toString();
        String cd = new String(in1+"."+in2+"."+in3);
        
        
        String cn= c_name.getText();
        String cp= c_phone.getText();
        String cg= c_gender.getSelectedItem().toString();
        String cnid= c_nid.getText();
        String cm= c_mail.getText();
        
        int ct=total(Integer.parseInt(c_room_days.getText()));
        
        
         DefaultTableModel model =(DefaultTableModel) room_list_table.getModel();
        model.addRow(new Object[] {
        cd,cn,cp,cg,cnid,cm,room,ct
        
    });
        }
    }//GEN-LAST:event_updateActionPerformed

    private void ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportActionPerformed
        
        DefaultTableModel model =(DefaultTableModel) room_list_table.getModel();
       
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
    
        
    
    }//GEN-LAST:event_ExportActionPerformed

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
            java.util.logging.Logger.getLogger(l_room_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(l_room_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(l_room_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(l_room_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new l_room_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Export;
    private javax.swing.JComboBox<String> c_cin_day;
    private javax.swing.JComboBox<String> c_cin_month;
    private javax.swing.JComboBox<String> c_cin_year;
    private javax.swing.JRadioButton c_dbl;
    private javax.swing.JRadioButton c_dbn;
    private javax.swing.JComboBox<String> c_gender;
    private javax.swing.JTextField c_mail;
    private javax.swing.JTextField c_name;
    private javax.swing.JTextField c_nid;
    private javax.swing.JTextField c_phone;
    private javax.swing.JTextField c_room_days;
    private javax.swing.JRadioButton c_sbl;
    private javax.swing.JRadioButton c_sbn;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JButton go_return;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable room_list_table;
    private javax.swing.JButton total;
    private javax.swing.JLabel total_cost_room;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
