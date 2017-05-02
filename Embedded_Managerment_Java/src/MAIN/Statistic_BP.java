package MAIN;

import BarChart.PieChartMain;
import BarChart.BarChartMain;
import SQL.ConnectMySQL;
import java.util.ArrayList;

public class Statistic_BP extends javax.swing.JPanel {

    ArrayList<Comparable> key;
    ArrayList<Integer> list;
    ConnectMySQL sQL = new ConnectMySQL();

    public Statistic_BP() {
        initComponents();
        byCategory();
    }

    private void byCategory() {
        key = new ArrayList<>();
        list = new ArrayList<>();
        key.add("Cảm biến");
        key.add("Kết nối");
        key.add("Năng lượng");
        key.add("Vi mạch");
        key.add("Khác");
        list.add(sQL.getQuanByCategory((String) key.get(0)));
        list.add(sQL.getQuanByCategory((String) key.get(1)));
        list.add(sQL.getQuanByCategory((String) key.get(2)));
        list.add(sQL.getQuanByCategory((String) key.get(3)));
        list.add(sQL.getQuanByCategory((String) key.get(4)));
        String title = "Thống kê số lượng thiết bị theo loại";
        PieChartMain main = new PieChartMain(key, list, title);
        main.setBounds(200, 50, 825, 550);
        jPanel2.removeAll();
        jPanel2.add(main);
        jPanel1.updateUI();
    }

    private void byProject() {
        jPanel2.removeAll();
        jPanel2.updateUI();
        ArrayList<Comparable> key = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        key.add("Cây lương thực");
        key.add("Cây công nghiệp");
        key.add("Cây thực phẩm, cây ăn quả, cây khác");
        values.add(1000);
        values.add(2000);
        values.add(1500);

        values.add(1000);
        values.add(2000);
        values.add(1500);

        values.add(1000);
        values.add(2000);
        values.add(1500);
        cols.add(2000);
        cols.add(2001);
        cols.add(2002);
        String title = "Biểu đồ cây trồng ở Việt Nam";
        BarChartMain main = new BarChartMain(values, key, cols, title, title, title);
    }

    private void byBorrow_Payment() {
        ConnectMySQL sQL = new ConnectMySQL();
        String title = "Biểu đồ thiết bị mượn - trả";
        String xName = "Loại thiết bị";
        String yName = "Số lượng";
        ArrayList<Comparable> key = new ArrayList<>();
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList cols = new ArrayList<>();
        ArrayList<Integer> idType1 = new ArrayList<>();
        ArrayList<Integer> idType2 = new ArrayList<>();
        ArrayList<Integer> idType3 = new ArrayList<>();
        ArrayList<Integer> idType4 = new ArrayList<>();
        ArrayList<Integer> idType5 = new ArrayList<>();

        key.add("Cảm biến");
        key.add("Kết nối");
        key.add("Năng lượng");
        key.add("Vi mạch");
        key.add("Khác");

        cols.add("Mượn");
        cols.add("Trả");
        try {
            idType1 = sQL.getDevice_ID((String) key.get(0));
            idType2 = sQL.getDevice_ID((String) key.get(1));
            idType3 = sQL.getDevice_ID((String) key.get(2));
            idType4 = sQL.getDevice_ID((String) key.get(3));
            idType5 = sQL.getDevice_ID((String) key.get(4));

        } catch (NumberFormatException e) {
        }
        ArrayList<Integer> xidType1 = getTotalByType(idType1, sQL);
        ArrayList<Integer> xidType2 = getTotalByType(idType2, sQL);
        ArrayList<Integer> xidType3 = getTotalByType(idType3, sQL);
        ArrayList<Integer> xidType4 = getTotalByType(idType4, sQL);
        ArrayList<Integer> xidType5 = getTotalByType(idType5, sQL);
        int total1 = getSum(xidType1);
        int total2 = getSum(xidType2);
        int total3 = getSum(xidType3);
        int total4 = getSum(xidType4);
        int total5 = getSum(xidType5);

        values.add(total1);
        values.add(total2);
        values.add(total3);
        values.add(total4);
        values.add(total5);
 
        PieChartMain main = new PieChartMain(key, values, title);
        jPanel2.removeAll();
        jPanel2.updateUI();
        jPanel2.add(main);
        main.setBounds(200, 100, 825, 550);
    }

    private ArrayList<Integer> getTotalByType(ArrayList<Integer> idType1, ConnectMySQL sQL) {
        ArrayList<Integer> xidType1 = new ArrayList<>();
        for (int i = 0; i < idType1.size(); i++) {
            xidType1.add(sQL.getCount_Device_ID(idType1.get(i)));
        }
        System.err.println(xidType1.size());
        return xidType1;
    }

    private int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        } 
        return sum;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Infor = new javax.swing.JPanel();
        lbl_Name = new javax.swing.JLabel();
        lbl_Name1 = new javax.swing.JLabel();
        lbl_Name2 = new javax.swing.JLabel();
        txf_Ten = new javax.swing.JTextField();
        txf_Sdt = new javax.swing.JTextField();
        lbl_Name4 = new javax.swing.JLabel();
        lbl_Name5 = new javax.swing.JLabel();
        lbl_Name6 = new javax.swing.JLabel();
        lbl_Name7 = new javax.swing.JLabel();
        txf_Ttt = new javax.swing.JTextField();
        txf_Ntdk = new javax.swing.JTextField();
        txf_Nm = new javax.swing.JTextField();
        txf_Ttb = new javax.swing.JTextField();
        txf_Idtb = new javax.swing.JTextField();
        lbl_Name8 = new javax.swing.JLabel();
        lbl_Name9 = new javax.swing.JLabel();
        txf_Nt = new javax.swing.JTextField();
        lbl_Vipham = new javax.swing.JLabel();
        pnl_Center = new javax.swing.JPanel();
        pnl_Borrow = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        btn_Add = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        btn_Details = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Restore = new javax.swing.JButton();
        btn_Restore1 = new javax.swing.JButton();

        pnl_Infor.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Infor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        pnl_Infor.setPreferredSize(new java.awt.Dimension(960, 249));

        lbl_Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name.setText("Họ Tên ");

        lbl_Name1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name1.setText("Số điện thoại");

        lbl_Name2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name2.setText("Ngày trả (dự kiến)");

        lbl_Name4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name4.setText("ID thiết bị");

        lbl_Name5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name5.setText("Ngày mượn");

        lbl_Name6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name6.setText("Tên thiết bị");

        lbl_Name7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name7.setText("Tình trạng (trả)");

        lbl_Name8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name8.setText("%");

        lbl_Name9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Name9.setText("Ngày trả ");

        lbl_Vipham.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_Vipham.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Vipham.setText("* Vi phạm: Trả quá thời hạn !!!");

        javax.swing.GroupLayout pnl_InforLayout = new javax.swing.GroupLayout(pnl_Infor);
        pnl_Infor.setLayout(pnl_InforLayout);
        pnl_InforLayout.setHorizontalGroup(
            pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_InforLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Name2)
                    .addComponent(lbl_Name)
                    .addComponent(lbl_Name1)
                    .addComponent(lbl_Name5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txf_Sdt, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txf_Nm, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_Ntdk, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_Ten))
                .addGap(70, 70, 70)
                .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Vipham)
                    .addGroup(pnl_InforLayout.createSequentialGroup()
                        .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Name6)
                            .addComponent(lbl_Name7)
                            .addComponent(lbl_Name4)
                            .addComponent(lbl_Name9))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txf_Ttb)
                            .addGroup(pnl_InforLayout.createSequentialGroup()
                                .addComponent(txf_Ttt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Name8))
                            .addComponent(txf_Idtb, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txf_Nt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_InforLayout.setVerticalGroup(
            pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_InforLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name)
                    .addComponent(txf_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name4)
                    .addComponent(txf_Idtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name1)
                    .addComponent(txf_Sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name6)
                    .addComponent(txf_Ttb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name7)
                    .addComponent(txf_Ttt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name5)
                    .addComponent(txf_Nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name2)
                    .addComponent(txf_Ntdk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Name9)
                    .addComponent(txf_Nt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_Vipham)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pnl_Center.setLayout(new java.awt.GridLayout(1, 0));

        setPreferredSize(new java.awt.Dimension(1016, 664));

        pnl_Borrow.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Borrow.setPreferredSize(new java.awt.Dimension(1000, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 616));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(248, 614));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại thiết bị", "Dự án", "Mượn - Trả" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(1000, 45));

        btn_Add.setText("Thêm");
        btn_Add.setToolTipText("Thêm thiết bị mới");
        btn_Add.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Add.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Add.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Add.setOpaque(false);
        btn_Add.setPreferredSize(new java.awt.Dimension(27, 45));
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Add);

        btn_Save.setText("Lưu");
        btn_Save.setToolTipText("Thêm thiết bị mới");
        btn_Save.setFocusable(false);
        btn_Save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Save.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Save.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Save.setOpaque(false);
        btn_Save.setPreferredSize(new java.awt.Dimension(27, 45));
        btn_Save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Save);

        btn_Details.setText("Chi tiết");
        btn_Details.setToolTipText("Xem thông tin chi tiết");
        btn_Details.setFocusable(false);
        btn_Details.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Details.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Details.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Details.setOpaque(false);
        btn_Details.setPreferredSize(new java.awt.Dimension(27, 45));
        btn_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DetailsActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Details);

        btn_Edit.setText("Sửa");
        btn_Edit.setToolTipText("");
        btn_Edit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Edit.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Edit.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Edit.setOpaque(false);
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Edit);

        btn_Delete.setText("Xoá");
        btn_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Delete.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Delete.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Delete.setOpaque(false);
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Delete);

        btn_Restore.setText("Khôi phục");
        btn_Restore.setFocusable(false);
        btn_Restore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Restore.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Restore.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Restore.setOpaque(false);
        btn_Restore.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestoreActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Restore);

        btn_Restore1.setText("Tải lại");
        btn_Restore1.setFocusable(false);
        btn_Restore1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Restore1.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Restore1.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Restore1.setOpaque(false);
        btn_Restore1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_Restore1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Restore1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Restore1);

        javax.swing.GroupLayout pnl_BorrowLayout = new javax.swing.GroupLayout(pnl_Borrow);
        pnl_Borrow.setLayout(pnl_BorrowLayout);
        pnl_BorrowLayout.setHorizontalGroup(
            pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BorrowLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)))
        );
        pnl_BorrowLayout.setVerticalGroup(
            pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BorrowLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_BorrowLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(pnl_BorrowLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Borrow, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Borrow, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
//        new Device_M_Aed(pnl_Borrow);
//        button = 0;
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
//        if (button == 2) {
//            System.err.println("Xoá");
//            int rowsPD = devicesPD.size();
//            if (rowsPD == 0) {
//                JOptionPane.showMessageDialog(pnl_Borrow, "Cập nhật thành công!");
//            } else if (rowsPD > 0) {
//                int d = JOptionPane.showConfirmDialog(pnl_Borrow, "Lưu lại",
//                    "Xác nhận", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
//                if (d == JOptionPane.OK_OPTION) {
//                    for (int i = 0; i < devicesPD.size(); i++) {
//                        cn.deleteDeviceByID(devicesPD.get(i));
//                    }
//                    JOptionPane.showMessageDialog(pnl_Borrow, "Cập nhật thành công!");
//                } else {
//                }
//            }
//        } else {
//
//        }
//        if (button == 0) {
//            System.err.println("Thêm");
//            int rowsPA = devicesPA.size();
//            if (rowsPA == 0) {
//                JOptionPane.showMessageDialog(pnl_Borrow, "Cập nhật thành công!");
//            }
//            if (rowsPA > 0) {
//                int d = JOptionPane.showConfirmDialog(pnl_Borrow, "Lưu lại",
//                    "Xác nhận", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
//                if (d == JOptionPane.OK_OPTION) {
//                    for (int i = 0; i < rowsPA; i++) {
//                        cn.addDevice(devicesPA.get(i).getDv_ID(), devicesPA.get(i).getDvName(),
//                            Integer.parseInt(devicesPA.get(i).getQuantity()), devicesPA.get(i).getState(),
//                            devicesPA.get(i).getCategory(), devicesPA.get(i).getManufacturer(),
//                            devicesPA.get(i).getDetails(), devicesPA.get(i).getSpecification());
//                    }
//                    JOptionPane.showMessageDialog(pnl_Borrow, "Cập nhật thành công!");
//                } else {
//                }
//
//            }
//        }
//        if (button == 1) {
//            System.err.println("Sửa");
//        }
//        if (button == -1) {
//
//        }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetailsActionPerformed
//        try {
//            int r = tb_Device_M.getSelectedRow();
//            Object[] d = TableValue.getValueAt(tb_Device_M, r);
//            new Device_M_Aed(pnl_Borrow, d, false);
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(Device_Management.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btn_DetailsActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
//        try {
//            Object[] d = TableValue.getValueAt(tb_Device_M, 0);
//            new Device_M_Aed(pnl_Borrow, d, true);
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(Device_Management.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        button = 1;
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_RestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestoreActionPerformed


    }//GEN-LAST:event_btn_RestoreActionPerformed

    private void btn_Restore1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Restore1ActionPerformed

    }//GEN-LAST:event_btn_Restore1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() == 0) {
            byCategory();
        }
        if (jComboBox1.getSelectedIndex() == 1) {
            byProject();
        }
        if (jComboBox1.getSelectedIndex() == 2) {
            byBorrow_Payment();
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Details;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_Restore;
    private javax.swing.JButton btn_Restore1;
    private javax.swing.JButton btn_Save;
    private javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Name1;
    private javax.swing.JLabel lbl_Name2;
    private javax.swing.JLabel lbl_Name4;
    private javax.swing.JLabel lbl_Name5;
    private javax.swing.JLabel lbl_Name6;
    private javax.swing.JLabel lbl_Name7;
    private javax.swing.JLabel lbl_Name8;
    private javax.swing.JLabel lbl_Name9;
    private javax.swing.JLabel lbl_Vipham;
    private javax.swing.JPanel pnl_Borrow;
    private javax.swing.JPanel pnl_Center;
    private javax.swing.JPanel pnl_Infor;
    private javax.swing.JTextField txf_Idtb;
    private javax.swing.JTextField txf_Nm;
    private javax.swing.JTextField txf_Nt;
    private javax.swing.JTextField txf_Ntdk;
    private javax.swing.JTextField txf_Sdt;
    private javax.swing.JTextField txf_Ten;
    private javax.swing.JTextField txf_Ttb;
    private javax.swing.JTextField txf_Ttt;
    // End of variables declaration//GEN-END:variables

}
