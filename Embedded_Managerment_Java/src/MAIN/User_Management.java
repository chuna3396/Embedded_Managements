package MAIN;

import GUI.Custom.ComboCellInsetsDemo;
import GUI.Custom.ResizeImage;
import Table.TableValue;
import static MAIN.Device_Management.tb_Device_M;
import MD5.CheckBoxHeader;
import SQL.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class User_Management extends javax.swing.JPanel  implements ActionListener{

    ConnectMySQL cn = new ConnectMySQL();
    public DefaultTableModel tbUser, tbLst, rs;
    private ResizeImage ri = new ResizeImage();
    private TableValue tv = new TableValue();
    private JPopupMenu menu = new JPopupMenu();
    private JMenuItem details = new JMenuItem("Chi tiết");
    private JMenuItem lock = new JMenuItem("Khóa");
    private JMenuItem delete = new JMenuItem("Xóa");
    
    public User_Management() {
        initComponents();
        addMenu();
        tbUser = cn.getUser();
        tb_User_M.setModel(tbUser);
        tbLst = tv.listModel(tbUser, 2);
        tb_List.setModel(tbLst);
        btn_Restore.setEnabled(false);
        btn_Delete.setEnabled(false);
        lb_Ser.setIcon(ri.ResizeImage("/Image/search.png", null, 25, 25));
        btn_Details.setIcon(ri.ResizeImage("/Image/details.png", null, 25, 25));
        btn_Lock.setIcon(ri.ResizeImage("/Image/Lock_User.png", null, 25, 25));
        btn_Delete.setIcon(ri.ResizeImage("/Image/delete.png", null, 25, 25));
        btn_Restore.setIcon(ri.ResizeImage("/Image/Restore.png", null, 25, 25));
        btn_Reload.setIcon(ri.ResizeImage("/Image/Reload.png", null, 25, 25));
        setSizeColumn();

    }
    
    private void addMenu() {
        menu.add(details);
        menu.add(lock);
        menu.add(delete);
        lock.setEnabled(Boolean.FALSE);
        delete.setEnabled(Boolean.FALSE);
        details.addActionListener(this);
        lock.addActionListener(this);
        delete.addActionListener(this);
    }
    
    private void setSizeColumn() {
        TableColumn tc = tb_User_M.getColumnModel().getColumn(0);
        tc.setCellEditor(tb_User_M.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tb_User_M.getDefaultRenderer(Boolean.class));
        tc.setHeaderRenderer(new CheckBoxHeader(new MAIN.ItemListener(tb_User_M), String.valueOf("Tất cả")));
        JTableHeader header = (JTableHeader) tb_User_M.getTableHeader();
        header.setBackground(Color.WHITE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Ser = new javax.swing.JPanel();
        pnl_User = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_User_M = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_List = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txf_Ser = new javax.swing.JTextField();
        lb_Ser = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_Details = new javax.swing.JButton();
        btn_Lock = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Restore = new javax.swing.JButton();
        btn_Reload = new javax.swing.JButton();

        pnl_Ser.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Ser.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        pnl_Ser.setPreferredSize(new java.awt.Dimension(630, 100));

        javax.swing.GroupLayout pnl_SerLayout = new javax.swing.GroupLayout(pnl_Ser);
        pnl_Ser.setLayout(pnl_SerLayout);
        pnl_SerLayout.setHorizontalGroup(
            pnl_SerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );
        pnl_SerLayout.setVerticalGroup(
            pnl_SerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(1030, 700));

        pnl_User.setBackground(new java.awt.Color(255, 255, 255));
        pnl_User.setPreferredSize(new java.awt.Dimension(1000, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane2.setBorder(null);

        tb_User_M.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tb_User_M.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_User_M.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_User_M.setFillsViewportHeight(true);
        tb_User_M.setRowHeight(50);
        tb_User_M.setShowHorizontalLines(false);
        tb_User_M.setShowVerticalLines(false);
        tb_User_M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_User_MMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_User_M);

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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
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

        btn_Lock.setText("Khóa");
        btn_Lock.setToolTipText("");
        btn_Lock.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Lock.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Lock.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Lock.setOpaque(false);
        btn_Lock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LockActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Lock);

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
        btn_Restore.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Restore.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Restore.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Restore.setOpaque(false);
        btn_Restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestoreActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Restore);

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

        javax.swing.GroupLayout pnl_UserLayout = new javax.swing.GroupLayout(pnl_User);
        pnl_User.setLayout(pnl_UserLayout);
        pnl_UserLayout.setHorizontalGroup(
            pnl_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_UserLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        pnl_UserLayout.setVerticalGroup(
            pnl_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_UserLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_UserLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(pnl_UserLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_User, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_User, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_User_MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_User_MMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            menu.show(tb_User_M, evt.getX(), evt.getY());
        }
        if (tv.isSelectedRows(tb_User_M, 0)) {
            btn_Lock.setEnabled(true);
            lock.setEnabled(true);
            btn_Delete.setEnabled(true);
            delete.setEnabled(true);
        }
        else if (!tv.isSelectedRows(tb_User_M, 0) || tb_User_M.getRowCount() == 0) {
            btn_Lock.setEnabled(false);
            btn_Delete.setEnabled(false);
            lock.setEnabled(false);
            delete.setEnabled(false);           
        }  
        int r = tb_User_M.getSelectedRow();
        setTextButton(tb_User_M, btn_Lock,r);
    }//GEN-LAST:event_tb_User_MMouseClicked

    private void tb_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ListMouseClicked
        int r = tb_List.getSelectedRow();
        String query = tb_List.getValueAt(r, 0).toString().trim();
        tv.filterTool(query, tb_User_M);
        if (query.equalsIgnoreCase("Tất cả")) {
            tv.filterTool("", tb_User_M);
        }
    }//GEN-LAST:event_tb_ListMouseClicked

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        tv.deleteRows(tb_User_M, 0);
        tb_User_M.setEnabled(true);
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void txf_SerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_SerFocusGained
        txf_Ser.setCaretPosition(0);
    }//GEN-LAST:event_txf_SerFocusGained

    private void txf_SerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SerKeyReleased
        String query = txf_Ser.getText().trim();
        tv.filterTool(query, tb_List);
    }//GEN-LAST:event_txf_SerKeyReleased

    private void txf_SerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SerKeyPressed
        if (txf_Ser.getText().isEmpty()
                || txf_Ser.getText().equalsIgnoreCase("Tìm theo tên người dùng")) {
            txf_Ser.setForeground(Color.BLACK);
            txf_Ser.setText("");
        }
    }//GEN-LAST:event_txf_SerKeyPressed

    private void btn_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetailsActionPerformed
         try {
            int r = tb_User_M.getSelectedRow();
            Object[] d = TableValue.getUserAt(tb_User_M, r);
            new Details_User(pnl_User, d);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Device_Management.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }//GEN-LAST:event_btn_DetailsActionPerformed

    private void btn_RestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestoreActionPerformed
        tbUser = cn.getDevice();
        tb_User_M.setModel(tbUser);
        setSizeColumn();
        btn_Restore.setEnabled(false);
    }//GEN-LAST:event_btn_RestoreActionPerformed

    private void btn_ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReloadActionPerformed
        tbLst = tv.listModel((DefaultTableModel) tb_User_M.getModel(), 2);
    }//GEN-LAST:event_btn_ReloadActionPerformed

    private void btn_LockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LockActionPerformed
        if(btn_Lock.getActionCommand().equalsIgnoreCase("Khóa")) {
           int cfm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn khóa tài khoản này ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
           if (cfm == JOptionPane.OK_OPTION) {
               int r = tb_User_M.getSelectedRow();
               String us_name = tbUser.getValueAt(r, 1).toString();
               System.out.println(us_name);
               cn.lockAccount(us_name, "0");
               JOptionPane.showMessageDialog(this, "Đã khóa thành công !");
               btn_Lock.setText("Mở khóa");
               tbUser = cn.getUser();
               tb_User_M.setModel(tbUser);
           }
        }
        else if(btn_Lock.getActionCommand().equalsIgnoreCase("Mở khóa")) {
            int cfm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn mở khóa tài khoản này ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
            if (cfm == JOptionPane.OK_OPTION) {
               int r = tb_User_M.getSelectedRow();
               String us_name = tbUser.getValueAt(r, 1).toString();
               System.out.println(us_name);
               cn.lockAccount(us_name, "1");
               JOptionPane.showMessageDialog(this, "Đã mở khóa thành công !");
               btn_Lock.setText("Khóa");
               tbUser = cn.getUser();
               tb_User_M.setModel(tbUser);
           }
        }
    }//GEN-LAST:event_btn_LockActionPerformed
    
    private void setTextButton (JTable tbl, JButton btn, int r){
        String txt = tbl.getValueAt(r, 8).toString();
        if(Boolean.valueOf(txt)){
            btn.setText("Khóa");
        }
        else btn.setText("Mở khóa");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Details;
    private javax.swing.JButton btn_Lock;
    private javax.swing.JButton btn_Reload;
    private javax.swing.JButton btn_Restore;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_Ser;
    private javax.swing.JPanel pnl_Ser;
    private javax.swing.JPanel pnl_User;
    private javax.swing.JTable tb_List;
    public static javax.swing.JTable tb_User_M;
    private javax.swing.JTextField txf_Ser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o == details) {
            btn_Details.doClick();
        }
        if (o == lock) {
            btn_Lock.doClick();
        }
        if (o == delete) {
            btn_Delete.doClick();
        }
    }
}


