package MAIN;

import GUI.Custom.ResizeImage;
import SQL.ConnectMySQL;
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public final class MAIN_GUI extends javax.swing.JFrame {

    public static Home_Page home = new Home_Page();
    public static User_Management usm = new User_Management();
    public static Device_Management device = new Device_Management();
    public static Borrow_Device bdv = new Borrow_Device();
    public static Pay_Device pdv = new Pay_Device();
    public static Statistic_BP sts = new Statistic_BP();
    public static Create_Account ca = new Create_Account();
    public static Confirm_Borrow_Dv cbdv = new Confirm_Borrow_Dv();
    public static Confirm_Management cm = new Confirm_Management();
    public static DefaultListModel list = new DefaultListModel();
    ConnectMySQL cn = new ConnectMySQL();
    public static boolean state;

    public MAIN_GUI() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        initComponents();
        MAIN_GUI.hideOrShowMenu(false);
        btn_Home.setIcon(new ResizeImage().ResizeImage("/Image/home.png", null, 30, 30));
        btn_Dvm.setIcon(new ResizeImage().ResizeImage("/Image/device.png", null, 30, 30));
        btn_Usm.setIcon(new ResizeImage().ResizeImage("/Image/user_m.png", null, 30, 30));
        btn_Bdv.setIcon(new ResizeImage().ResizeImage("/Image/borrow.png", null, 30, 30));
        btn_Pdv.setIcon(new ResizeImage().ResizeImage("/Image/pay.png", null, 30, 30));
        btn_QlD.setIcon(new ResizeImage().ResizeImage("/Image/document.png", null, 30, 30));
        btn_Tke.setIcon(new ResizeImage().ResizeImage("/Image/statistics.png", null, 30, 30));
        replacePanel(home);
        setLocationRelativeTo(null);
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Main = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        btn_Home = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        btn_Dvm = new javax.swing.JButton();
        btn_Usm = new javax.swing.JButton();
        btn_Bdv = new javax.swing.JButton();
        btn_Pdv = new javax.swing.JButton();
        btn_QlD = new javax.swing.JButton();
        btn_Tke = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        lbCurrentMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý thiết bị nhúng");
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1500, 819));
        setPreferredSize(new java.awt.Dimension(1000, 850));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnl_Main.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Main.setPreferredSize(new java.awt.Dimension(1286, 800));

        btn_Home.setBackground(new java.awt.Color(102, 153, 255));
        btn_Home.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Home.setForeground(new java.awt.Color(255, 255, 255));
        btn_Home.setContentAreaFilled(false);
        btn_Home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Home.setOpaque(true);
        btn_Home.setPreferredSize(new java.awt.Dimension(60, 25));
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenu.setPreferredSize(new java.awt.Dimension(999, 45));
        pnlMenu.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        btn_Dvm.setBackground(new java.awt.Color(102, 153, 255));
        btn_Dvm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Dvm.setForeground(new java.awt.Color(255, 255, 255));
        btn_Dvm.setText("Quản lý thiết bị");
        btn_Dvm.setContentAreaFilled(false);
        btn_Dvm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Dvm.setOpaque(true);
        btn_Dvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DvmActionPerformed(evt);
            }
        });
        pnlMenu.add(btn_Dvm);

        btn_Usm.setBackground(new java.awt.Color(102, 153, 255));
        btn_Usm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Usm.setForeground(new java.awt.Color(255, 255, 255));
        btn_Usm.setText("Quản lý người dùng");
        btn_Usm.setContentAreaFilled(false);
        btn_Usm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Usm.setOpaque(true);
        btn_Usm.setPreferredSize(new java.awt.Dimension(117, 25));
        btn_Usm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsmActionPerformed(evt);
            }
        });
        pnlMenu.add(btn_Usm);

        btn_Bdv.setBackground(new java.awt.Color(102, 153, 255));
        btn_Bdv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Bdv.setForeground(new java.awt.Color(255, 255, 255));
        btn_Bdv.setText("Quản lý mượn");
        btn_Bdv.setContentAreaFilled(false);
        btn_Bdv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Bdv.setOpaque(true);
        btn_Bdv.setPreferredSize(new java.awt.Dimension(117, 25));
        btn_Bdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BdvActionPerformed(evt);
            }
        });
        pnlMenu.add(btn_Bdv);

        btn_Pdv.setBackground(new java.awt.Color(102, 153, 255));
        btn_Pdv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Pdv.setForeground(new java.awt.Color(255, 255, 255));
        btn_Pdv.setText("Quản lý trả");
        btn_Pdv.setContentAreaFilled(false);
        btn_Pdv.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Pdv.setOpaque(true);
        btn_Pdv.setPreferredSize(new java.awt.Dimension(117, 25));
        btn_Pdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PdvActionPerformed(evt);
            }
        });
        pnlMenu.add(btn_Pdv);

        btn_QlD.setBackground(new java.awt.Color(102, 153, 255));
        btn_QlD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_QlD.setForeground(new java.awt.Color(255, 255, 255));
        btn_QlD.setText("Quản lý đơn");
        btn_QlD.setContentAreaFilled(false);
        btn_QlD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_QlD.setOpaque(true);
        btn_QlD.setPreferredSize(new java.awt.Dimension(117, 25));
        btn_QlD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QlDActionPerformed(evt);
            }
        });
        pnlMenu.add(btn_QlD);

        btn_Tke.setBackground(new java.awt.Color(102, 153, 255));
        btn_Tke.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Tke.setForeground(new java.awt.Color(255, 255, 255));
        btn_Tke.setText("Thống kê");
        btn_Tke.setContentAreaFilled(false);
        btn_Tke.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Tke.setOpaque(true);
        btn_Tke.setPreferredSize(new java.awt.Dimension(117, 25));
        btn_Tke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TkeActionPerformed(evt);
            }
        });
        pnlMenu.add(btn_Tke);

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addComponent(btn_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pnlCenter.setBackground(new java.awt.Color(255, 255, 255));
        pnlCenter.setMinimumSize(new java.awt.Dimension(1020, 666));
        pnlCenter.setPreferredSize(new java.awt.Dimension(1000, 710));
        pnlCenter.setLayout(new java.awt.GridLayout(1, 0));

        lbCurrentMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbCurrentMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCurrentMenu.setText("Current");
        lbCurrentMenu.setPreferredSize(new java.awt.Dimension(250, 20));
        lbCurrentMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCurrentMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_MainLayout = new javax.swing.GroupLayout(pnl_Main);
        pnl_Main.setLayout(pnl_MainLayout);
        pnl_MainLayout.setHorizontalGroup(
            pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainLayout.createSequentialGroup()
                .addGroup(pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_MainLayout.createSequentialGroup()
                        .addComponent(lbCurrentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        pnl_MainLayout.setVerticalGroup(
            pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainLayout.createSequentialGroup()
                .addGroup(pnl_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbCurrentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(pnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE))
        );

        pnl_MainLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbCurrentMenu, pnlTop});

        getContentPane().add(pnl_Main);

        jMenuBar1.setBorder(null);

        jMenu1.setText("Hệ thống");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Báo cáo");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Hồ sơ");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Danh sách");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Công cụ");
        jMenuBar1.add(jMenu7);

        jMenu4.setText("Trợ giúp");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btn_UsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsmActionPerformed

        replacePanel(usm);

        lbCurrentMenu.setText("Quản lý người dùng");
        lbCurrentMenu.setIcon(btn_Usm.getIcon());
    }//GEN-LAST:event_btn_UsmActionPerformed

    private void btn_DvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DvmActionPerformed
        replacePanel(device);
        MAIN_GUI.hideOrShowMenu(true);

        lbCurrentMenu.setText("Quản lý thiết bị");
        lbCurrentMenu.setIcon(btn_Dvm.getIcon());
    }//GEN-LAST:event_btn_DvmActionPerformed

    private void btn_BdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BdvActionPerformed
        replacePanel(bdv);

        lbCurrentMenu.setText("Quản lý thiết bị mượn");
        lbCurrentMenu.setIcon(btn_Bdv.getIcon());
    }//GEN-LAST:event_btn_BdvActionPerformed

    private void btn_PdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PdvActionPerformed
        replacePanel(pdv);
        MAIN_GUI.hideOrShowMenu(true);

        lbCurrentMenu.setText("Quản lý thiết bị trả");
        lbCurrentMenu.setIcon(btn_Pdv.getIcon());
    }//GEN-LAST:event_btn_PdvActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        replacePanel(home);
        MAIN_GUI.hideOrShowMenu(false);
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_TkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TkeActionPerformed
        replacePanel(sts);
        MAIN_GUI.hideOrShowMenu(true);
        super.setPreferredSize(new Dimension(1400, 820));
        lbCurrentMenu.setText("Thống kê");
        lbCurrentMenu.setIcon(btn_Tke.getIcon());
    }//GEN-LAST:event_btn_TkeActionPerformed

    private void btn_QlDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QlDActionPerformed
        replacePanel(cm);
        MAIN_GUI.hideOrShowMenu(true);
        super.setPreferredSize(new Dimension(1400, 820));
        lbCurrentMenu.setIcon(btn_QlD.getIcon());
        lbCurrentMenu.setText("Quản lý đơn");
    }//GEN-LAST:event_btn_QlDActionPerformed

    private void lbCurrentMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCurrentMenuMouseClicked
        if (evt.getClickCount() == 2) {
            lbCurrentMenu.setVisible(false);
            Device_Management.jPanel1.setVisible(false);
        }
    }//GEN-LAST:event_lbCurrentMenuMouseClicked

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost

    }//GEN-LAST:event_formFocusLost

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
 
    }//GEN-LAST:event_formWindowLostFocus
    public static void replacePanel(JPanel panel) {
        pnlCenter.removeAll();
        pnlCenter.updateUI();
        pnlCenter.add(panel);
        lbCurrentMenu.setText(panel.getName());
    }

    public static void hideOrShowMenu(boolean b) {
        lbCurrentMenu.setVisible(b);
        pnlTop.setVisible(b);
        Device_Management.jPanel1.setVisible(b);
    }

    @Override
    public void resize(int WIDTH, int HEIGHT) {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void removeRowTable(DefaultTableModel tableModel) {
        for (int i = tableModel.getRowCount() - 1; i >= 0; i--) {
            tableModel.removeRow(i);
        }
    } 

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        MAIN_GUI main_gui = new MAIN_GUI();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Bdv;
    private javax.swing.JButton btn_Dvm;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_Pdv;
    private javax.swing.JButton btn_QlD;
    private javax.swing.JButton btn_Tke;
    private javax.swing.JButton btn_Usm;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel lbCurrentMenu;
    public static javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlMenu;
    public static javax.swing.JPanel pnlTop;
    public static javax.swing.JPanel pnl_Main;
    // End of variables declaration//GEN-END:variables
}
