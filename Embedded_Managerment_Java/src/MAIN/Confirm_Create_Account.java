package MAIN;

import GUI.Custom.ComboCellInsetsDemo;
import GUI.Custom.ResizeImage;
import Table.TableValue;
import static MAIN.User_Management.tb_User_M;
import MD5.CheckBoxHeader;
import SQL.ConnectMySQL;
import embedded_managerment.Change_Pass;
import embedded_managerment.Confirm_Create_Acc;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Confirm_Create_Account extends javax.swing.JPanel implements TableModelListener, ActionListener {

    public static Confirm_Create_Acc create_Acc = new Confirm_Create_Acc();
    ConnectMySQL cn = new ConnectMySQL();
    private ResizeImage ri = new ResizeImage();
    private TableValue tv = new TableValue();
    public static DefaultTableModel tbRequest, tbLst;
    private JPopupMenu menu = new JPopupMenu();
    private JMenuItem details = new JMenuItem("Chi tiết");
    private JMenuItem accept = new JMenuItem("Chấp nhận");
    private JMenuItem notaccept = new JMenuItem("Hủy yêu cầu");
    public static boolean isClose;
    

    public Confirm_Create_Account() {
        setPreferredSize(new Dimension(485, 726));
        initComponents();
        addMenu();
        tbRequest = cn.getRequestUser();
        tb_Register_A.setModel(tbRequest);
        tbLst = tv.listModel(tbRequest, 2);
        tb_List.setModel(tbLst);
        btn_Accept.setEnabled(false);
        btn_NotAccept.setEnabled(false);
        lb_Ser.setIcon(ri.ResizeImage("/Image/search.png", null, 25, 25));
        btn_Details.setIcon(ri.ResizeImage("/Image/details.png", null, 25, 25));
        btn_Accept.setIcon(ri.ResizeImage("/Image/accept.png", null, 25, 25));
        btn_NotAccept.setIcon(ri.ResizeImage("/Image/delete.png", null, 25, 25));
        btn_Reload.setIcon(ri.ResizeImage("/Image/Reload.png", null, 25, 25));
        btn_Reload.setIcon(ri.ResizeImage("/Image/Reload.png", null, 25, 25));
        setSizeColumn();
        

    }

    private void setSizeColumn() {
        TableColumn tc = tb_Register_A.getColumnModel().getColumn(0);
        tc.setCellEditor(tb_Register_A.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tb_Register_A.getDefaultRenderer(Boolean.class));
        tc.setHeaderRenderer(new CheckBoxHeader(new MAIN.ItemListener(tb_Register_A), String.valueOf("Tất cả")));
        JTableHeader header = (JTableHeader) tb_Register_A.getTableHeader();
        header.setBackground(Color.WHITE);
    }

    private void addMenu() {
        menu.add(details);
        menu.add(accept);
        menu.add(notaccept);
        accept.setEnabled(Boolean.FALSE);
        notaccept.setEnabled(Boolean.FALSE);
        details.addActionListener(this);
        accept.addActionListener(this);
        notaccept.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_User_R = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Register_A = new javax.swing.JTable();
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

        setPreferredSize(new java.awt.Dimension(1020, 622));

        pnl_User_R.setBackground(new java.awt.Color(255, 255, 255));
        pnl_User_R.setPreferredSize(new java.awt.Dimension(1000, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane2.setBorder(null);

        tb_Register_A.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tb_Register_A.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_Register_A.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_Register_A.setFillsViewportHeight(true);
        tb_Register_A.setRowHeight(50);
        tb_Register_A.setShowHorizontalLines(false);
        tb_Register_A.setShowVerticalLines(false);
        tb_Register_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_Register_AMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Register_A);

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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        pnl_User_RLayout.setVerticalGroup(
            pnl_User_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_User_RLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_User_RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_User_RLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(pnl_User_RLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_User_R, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_User_R, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_Register_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_Register_AMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            menu.show(tb_Register_A, evt.getX(), evt.getY());
        }
        if (tv.isSelectedRows(tb_Register_A, 0)) {
            btn_Accept.setEnabled(true);
            accept.setEnabled(true);
            btn_NotAccept.setEnabled(true);
            notaccept.setEnabled(true);
        } else if (!tv.isSelectedRows(tb_Register_A, 0) || tb_Register_A.getRowCount() == 0) {
            btn_Accept.setEnabled(false);
            btn_NotAccept.setEnabled(false);
            accept.setEnabled(false);
            notaccept.setEnabled(false);
        }
    }//GEN-LAST:event_tb_Register_AMouseClicked

    private void tb_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ListMouseClicked
        int r = tb_List.getSelectedRow();
        String query = tb_List.getValueAt(r, 0).toString().trim();
        tv.filterTool(query, tb_Register_A);
        if (query.equalsIgnoreCase("Tất cả")) {
            tv.filterTool("", tb_Register_A);
        }
    }//GEN-LAST:event_tb_ListMouseClicked

    private void txf_SerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_SerFocusGained
        txf_Ser.setCaretPosition(0);
    }//GEN-LAST:event_txf_SerFocusGained

    private void txf_SerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SerKeyPressed
        if (txf_Ser.getText().isEmpty()
                || txf_Ser.getText().equalsIgnoreCase("Tìm theo tên người dùng")) {
            txf_Ser.setForeground(Color.BLACK);
            txf_Ser.setText("");
        }
    }//GEN-LAST:event_txf_SerKeyPressed

    private void txf_SerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SerKeyReleased
        String query = txf_Ser.getText().trim();
        tv.filterTool(query, tb_List);
    }//GEN-LAST:event_txf_SerKeyReleased

    private void btn_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetailsActionPerformed
        try {
            int r = tb_Register_A.getSelectedRow();
            Object[] d = TableValue.getUserAt(tb_Register_A, r);
            new Details_User(pnl_User_R, d);
            Details_User.lb_Activate.setText("Trạng thái yêu cầu");
            Details_User.txt_Activated.setText("Đang chờ chấp nhận...");
        } catch (URISyntaxException ex) {
            Logger.getLogger(Device_Management.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_DetailsActionPerformed

    private void btn_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AcceptActionPerformed
        try {
            int r = tb_Register_A.getSelectedRow();
            Object[] d = TableValue.getUserAt(tb_Register_A, r);
            new Create_Account(pnl_User_R, d);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Device_Management.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Confirm_Create_Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AcceptActionPerformed

    private void btn_NotAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NotAcceptActionPerformed
        int cfm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn hủy yêu cầu này ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
        if (cfm == JOptionPane.OK_OPTION) {
            int r = tb_Register_A.getSelectedRow();
            int id = Integer.parseInt(tb_Register_A.getValueAt(1, r).toString());  
            cn.notAcceptRegisterRequest(id);
            JOptionPane.showMessageDialog(this, "Đã xóa thành công !");
            btn_Reload.doClick();
        }
    }//GEN-LAST:event_btn_NotAcceptActionPerformed

    private void btn_ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReloadActionPerformed
        tbRequest = cn.getRequestUser();
        tb_Register_A.setModel(tbRequest);
        tbLst = tv.listModel(tbRequest, 2);
        tb_List.setModel(tbLst);
    }//GEN-LAST:event_btn_ReloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Accept;
    private javax.swing.JButton btn_Details;
    private javax.swing.JButton btn_NotAccept;
    public static javax.swing.JButton btn_Reload;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_Ser;
    private javax.swing.JPanel pnl_User_R;
    private javax.swing.JTable tb_List;
    public static javax.swing.JTable tb_Register_A;
    private javax.swing.JTextField txf_Ser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o == details) {
            btn_Details.doClick();
        }
        if (o == accept) {
            btn_Accept.doClick();
        }
        if (o == notaccept) {
            btn_NotAccept.doClick();
        }
    }
}
