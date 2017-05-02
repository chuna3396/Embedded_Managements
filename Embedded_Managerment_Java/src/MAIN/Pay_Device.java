package MAIN;

import Table.TableValue;
import SQL.*;
import javax.swing.table.DefaultTableModel;

public class Pay_Device extends javax.swing.JPanel {

    ConnectMySQL cn = new ConnectMySQL();
    public static DefaultTableModel tbPay;

    public Pay_Device() {
        initComponents();
//        tbPay = cn.getPay();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Borrow = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_Ser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txf_Ser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lst_Ser = new javax.swing.JList<>();
        jToolBar1 = new javax.swing.JToolBar();
        btn_Add = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout());

        pnl_Borrow.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Borrow.setPreferredSize(new java.awt.Dimension(1000, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(250, 616));

        btn_Ser.setText("Search");
        btn_Ser.setContentAreaFilled(false);
        btn_Ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("View:");

        txf_Ser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        txf_Ser.setPreferredSize(new java.awt.Dimension(250, 20));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(260, 600));

        Lst_Ser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Lst_Ser.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Lst_Ser.setFixedCellHeight(50);
        Lst_Ser.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        Lst_Ser.setSelectedIndex(0);
        Lst_Ser.setValueIsAdjusting(true);
        Lst_Ser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lst_SerMouseClicked(evt);
            }
        });
        Lst_Ser.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Lst_SerValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lst_Ser);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txf_Ser, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Ser, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_Ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Ser, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(1000, 23));

        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Add);

        btn_Edit.setText("Edit");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Edit);

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Delete);

        javax.swing.GroupLayout pnl_BorrowLayout = new javax.swing.GroupLayout(pnl_Borrow);
        pnl_Borrow.setLayout(pnl_BorrowLayout);
        pnl_BorrowLayout.setHorizontalGroup(
            pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BorrowLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)))
        );
        pnl_BorrowLayout.setVerticalGroup(
            pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BorrowLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addGroup(pnl_BorrowLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(pnl_Borrow);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SerActionPerformed

    private void Lst_SerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lst_SerMouseClicked
        //        Object[] dv;
        //        dv = TableValue.getValueList(Lst_Ser.getSelectedValue(),  User_Management.tbUser, 1);
        //        removeRowTable(User_Management.tbUser);
        //        User_Management.tbUser.addRow(dv);
        //        User_Management.tbl_UserInfo.setModel(User_Management.tbUser);
    }//GEN-LAST:event_Lst_SerMouseClicked

    private void Lst_SerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_Lst_SerValueChanged
        //Lst_Ser.getSelectedValue();
    }//GEN-LAST:event_Lst_SerValueChanged

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        //        int ID = tbl_Device.getRowCount() + 2;
        //        if (btn_Add.getActionCommand().equalsIgnoreCase("Add")) {
        //            SetContainer.clearTextFields(pnl_Info);
        //            SetContainer.clearCombox(pnl_Info);
        //            SetContainer.clearTextArea(pnl_Info);
        //            SetContainer.clearButton(pnl_Info);
        //            SetContainer.setEditableBorder(pnl_Info, true);
        //
        //            btn_Add.setText("Save");
        //            btn_Edit.setEnabled(false);
        //            btn_Delete.setEnabled(false);
        //            SetContainer.setLineBorder(pnl_Info);
        //            ta_Decribe.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        //            txt_ID.setText(" " + String.valueOf(ID));
        //
        //        } else if (btn_Add.getActionCommand().equalsIgnoreCase("Save")) {
        //            if (!Check.isNumber(txt_Quantity.getText())) {
        //                JOptionPane.showMessageDialog(this, "Vui lòng nhập số tại ô Số lượng !");
        //            } else if (!Check.txtIsEmpty(pnl_Info) && !Check.isSelected(pnl_Info)) {
        //                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ các trường !");
        //            } else {
        //                cn.addDevice(ID, txt_Device_Name.getText(),
        //                        Integer.parseInt(txt_Quantity.getText()), "Mới",
        //                        cbx_Pl.getSelectedItem().toString(), txt_Manufacturer.getText(), ta_Decribe.getText());
        //                JOptionPane.showMessageDialog(this, "Thêm thiết bị thành công !");
        //                tbDevice = cn.getDevice();
        //                tbl_Device.setModel(tbDevice);
        //                btn_Add.setText("Add");
        //                btn_Edit.setEnabled(true);
        //                btn_Delete.setEnabled(true);
        //                SetContainer.setEditableBorder(pnl_Info, false);
        //            }
        //        }
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        //        if (btn_Edit.getActionCommand().equalsIgnoreCase("Edit")) {
        //            btn_Edit.setText("Save");
        //            btn_Add.setEnabled(false);
        //            btn_Delete.setEnabled(false);
        //            SetContainer.setLineBorder(pnl_Info);
        //            ta_Decribe.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        //            SetContainer.setEditableBorder(pnl_Info, true);
        //
        //        } else if (btn_Edit.getActionCommand().equalsIgnoreCase("Save")) {
        //            if (Check.isNumber(txt_Quantity.getText()) && Check.checkAll(pnl_Info)) {
        //                cn.updateDevice(txt_Device_Name.getText(), Integer.parseInt(txt_Quantity.getText()), "Mới",
        //                        cbx_Pl.getSelectedItem().toString(), txt_Manufacturer.getText(), ta_Decribe.getText(),
        //                        Integer.parseInt(txt_ID.getText()));
        //
        //                JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công !");
        //                btn_Edit.setText("Edit");
        //                tbDevice = cn.getDevice();
        //                tbl_Device.setModel(tbDevice);
        //                btn_Add.setEnabled(true);
        //                btn_Delete.setEnabled(true);
        //                SetContainer.setEditableBorder(pnl_Info, false);
        //            } else {
        //                JOptionPane.showMessageDialog(this, "Chỉnh sửa thất bại !");
        //
        //            }
        //        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        //        if (btn_Delete.getActionCommand().equalsIgnoreCase("Delete")) {
        //            int cfm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
        //            if (cfm == JOptionPane.OK_OPTION) {
        //                cn.deleteDevice(Integer.parseInt(txt_ID.getText()));
        //                int d = tbl_Device.getSelectedRow();
        //                tbDevice.removeRow(d);
        //                tbl_Device.setModel(tbDevice);
        //                JOptionPane.showMessageDialog(this, "Xóa thành công !");
        //                SetContainer.setEditableBorder(pnl_Info, false);
        //            }
        //        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JList<String> Lst_Ser;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_Ser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pnl_Borrow;
    private javax.swing.JTextField txf_Ser;
    // End of variables declaration//GEN-END:variables
}
