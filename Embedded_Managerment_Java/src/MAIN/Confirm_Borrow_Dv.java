package MAIN;

import GUI.Custom.Check;
import GUI.Custom.ResizeImage;
import Table.TableValue;
import SQL.ConnectMySQL;
import javax.swing.table.DefaultTableModel;

public class Confirm_Borrow_Dv extends javax.swing.JPanel {

    ConnectMySQL cn = new ConnectMySQL();
    public static DefaultTableModel tbConfirmDv;
    private ResizeImage ri = new ResizeImage();

    public Confirm_Borrow_Dv() {
        initComponents();
        //tbConfirmDv = cn.getBorrowRequest();
        lb_Ser.setIcon(ri.ResizeImage("/Image/search.png", null, 25, 25));
        btn_Details.setIcon(ri.ResizeImage("/Image/details.png", null, 25, 25));
        btn_Accept.setIcon(ri.ResizeImage("/Image/accept.png", null, 25, 25));
        btn_NotAccept.setIcon(ri.ResizeImage("/Image/delete.png", null, 25, 25));
        btn_Reload.setIcon(ri.ResizeImage("/Image/Reload.png", null, 25, 25));
        btn_Reload.setIcon(ri.ResizeImage("/Image/Reload.png", null, 25, 25));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_User_R = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Borrow_R = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_List = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txf_Ser = new javax.swing.JTextField();
        lb_Ser = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_Details = new javax.swing.JButton();
        btn_Accept = new javax.swing.JButton();
        btn_NotAccept = new javax.swing.JButton();
        btn_Reload = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1030, 700));
        setLayout(new java.awt.GridLayout(1, 0));

        pnl_User_R.setBackground(new java.awt.Color(255, 255, 255));
        pnl_User_R.setPreferredSize(new java.awt.Dimension(1000, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane2.setBorder(null);

        tb_Borrow_R.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tb_Borrow_R.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_Borrow_R.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_Borrow_R.setFillsViewportHeight(true);
        tb_Borrow_R.setRowHeight(50);
        tb_Borrow_R.setShowHorizontalLines(false);
        tb_Borrow_R.setShowVerticalLines(false);
        tb_Borrow_R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_Borrow_RMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Borrow_R);

        jPanel2.add(jScrollPane2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 616));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(248, 614));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setBorder(null);

        tb_List.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tb_List.setFillsViewportHeight(true);
        tb_List.setRowHeight(50);
        tb_List.setShowHorizontalLines(false);
        tb_List.setShowVerticalLines(false);
        tb_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_List);

        jPanel3.add(jScrollPane1);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        txf_Ser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txf_Ser.setForeground(new java.awt.Color(153, 153, 153));
        txf_Ser.setText("Tìm theo tên người dùng");
        txf_Ser.setBorder(null);
        txf_Ser.setPreferredSize(new java.awt.Dimension(250, 35));
        txf_Ser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txf_SerFocusGained(evt);
            }
        });
        txf_Ser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_SerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_SerKeyReleased(evt);
            }
        });

        lb_Ser.setPreferredSize(new java.awt.Dimension(40, 41));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(txf_Ser, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Ser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lb_Ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_Ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(1000, 45));

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

        btn_Accept.setText("Chấp nhận");
        btn_Accept.setToolTipText("");
        btn_Accept.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Accept.setMaximumSize(new java.awt.Dimension(120, 45));
        btn_Accept.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Accept.setOpaque(false);
        btn_Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AcceptActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Accept);

        btn_NotAccept.setText("Hủy yêu cầu");
        btn_NotAccept.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_NotAccept.setMaximumSize(new java.awt.Dimension(120, 45));
        btn_NotAccept.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_NotAccept.setOpaque(false);
        btn_NotAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NotAcceptActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_NotAccept);

        btn_Reload.setText("Tải lại");
        btn_Reload.setFocusable(false);
        btn_Reload.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Reload.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Reload.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Reload.setOpaque(false);
        btn_Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReloadActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Reload);

        javax.swing.GroupLayout pnl_User_RLayout = new javax.swing.GroupLayout(pnl_User_R);
        pnl_User_R.setLayout(pnl_User_RLayout);
        pnl_User_RLayout.setHorizontalGroup(
            pnl_User_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_User_RLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_User_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        pnl_User_RLayout.setVerticalGroup(
            pnl_User_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_User_RLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_User_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_User_RLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(pnl_User_RLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(pnl_User_R);
    }// </editor-fold>//GEN-END:initComponents

    private void tb_Borrow_RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_Borrow_RMouseClicked
        //        if (SwingUtilities.isRightMouseButton(evt)) {
            //            menu.show(tb_Register_A, evt.getX(), evt.getY());
            //        }
        //        if (tv.isSelectedRows(tb_Register_A, 0)) {
            //            btn_Accept.setEnabled(true);
            //            lock.setEnabled(true);
            //            btn_NotAccept.setEnabled(true);
            //            delete.setEnabled(true);
            //        }
        //        else if (!tv.isSelectedRows(tb_Register_A, 0) || tb_Register_A.getRowCount() == 0) {
            //            btn_Accept.setEnabled(false);
            //            btn_NotAccept.setEnabled(false);
            //            lock.setEnabled(false);
            //            delete.setEnabled(false);
            //        }
        //        int r = tb_Register_A.getSelectedRow();
        //        setTextButton(tb_Register_A, btn_Accept,r);
    }//GEN-LAST:event_tb_Borrow_RMouseClicked

    private void tb_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ListMouseClicked
        //        int r = tb_List.getSelectedRow();
        //        String query = tb_List.getValueAt(r, 0).toString().trim();
        //        tv.filterTool(query, tb_Register_A);
        //        if (query.equalsIgnoreCase("Tất cả")) {
            //            tv.filterTool("", tb_Register_A);
            //        }
    }//GEN-LAST:event_tb_ListMouseClicked

    private void txf_SerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_SerFocusGained
        //        txf_Ser.setCaretPosition(0);
    }//GEN-LAST:event_txf_SerFocusGained

    private void txf_SerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SerKeyPressed
        //        if (txf_Ser.getText().isEmpty()
            //            || txf_Ser.getText().equalsIgnoreCase("Tìm theo tên người dùng")) {
            //            txf_Ser.setForeground(Color.BLACK);
            //            txf_Ser.setText("");
            //        }
    }//GEN-LAST:event_txf_SerKeyPressed

    private void txf_SerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SerKeyReleased
        //        String query = txf_Ser.getText().trim();
        //        tv.filterTool(query, tb_List);
    }//GEN-LAST:event_txf_SerKeyReleased

    private void btn_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetailsActionPerformed
        //        try {
            //            int r = tb_Register_A.getSelectedRow();
            //            Object[] d = TableValue.getUserAt(tb_Register_A, r);
            //            new Details_User(pnl_User, d);
            //        } catch (URISyntaxException ex) {
            //            Logger.getLogger(Device_Management.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btn_DetailsActionPerformed

    private void btn_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AcceptActionPerformed
        //        if(btn_Accept.getActionCommand().equalsIgnoreCase("Khóa")) {
            //            int cfm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn khóa tài khoản này ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
            //            if (cfm == JOptionPane.OK_OPTION) {
                //                int r = tb_Register_A.getSelectedRow();
                //                String us_name = tbUser.getValueAt(r, 1).toString();
                //                System.out.println(us_name);
                //                cn.lockAccount(us_name, "0");
                //                JOptionPane.showMessageDialog(this, "Đã khóa thành công !");
                //                btn_Accept.setText("Mở khóa");
                //                tbUser = cn.getUser();
                //                tb_Register_A.setModel(tbUser);
                //            }
            //        }
        //        else if(btn_Accept.getActionCommand().equalsIgnoreCase("Mở khóa")) {
            //            int cfm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn mở khóa tài khoản này ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
            //            if (cfm == JOptionPane.OK_OPTION) {
                //                int r = tb_Register_A.getSelectedRow();
                //                String us_name = tbUser.getValueAt(r, 1).toString();
                //                System.out.println(us_name);
                //                cn.lockAccount(us_name, "1");
                //                JOptionPane.showMessageDialog(this, "Đã mở khóa thành công !");
                //                btn_Accept.setText("Khóa");
                //                tbUser = cn.getUser();
                //                tb_Register_A.setModel(tbUser);
                //            }
            //        }
    }//GEN-LAST:event_btn_AcceptActionPerformed

    private void btn_NotAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NotAcceptActionPerformed
        //        tv.deleteRows(tb_Register_A, 0);
        //        tb_Register_A.setEnabled(true);
    }//GEN-LAST:event_btn_NotAcceptActionPerformed

    private void btn_ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReloadActionPerformed
        //        tbLst = tv.listModel((DefaultTableModel) tb_Register_A.getModel(), 2);
    }//GEN-LAST:event_btn_ReloadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Accept;
    private javax.swing.JButton btn_Details;
    private javax.swing.JButton btn_NotAccept;
    private javax.swing.JButton btn_Reload;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_Ser;
    private javax.swing.JPanel pnl_User_R;
    public static javax.swing.JTable tb_Borrow_R;
    private javax.swing.JTable tb_List;
    private javax.swing.JTextField txf_Ser;
    // End of variables declaration//GEN-END:variables
}
