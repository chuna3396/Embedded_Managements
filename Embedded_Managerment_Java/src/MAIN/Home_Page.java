package MAIN;

import GUI.Custom.Check;
import GUI.Custom.ResizeImage;
import static MAIN.MAIN_GUI.lbCurrentMenu;
import javax.swing.ImageIcon;

public class Home_Page extends javax.swing.JPanel {

    private ResizeImage ri = new ResizeImage();

    public Home_Page() {
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
            java.util.logging.Logger.getLogger(MAIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        initComponents();
        btn_Search.setIcon(ri.ResizeImage("/image/search.png", null, 30, 30));
        btn_User.setIcon(ri.ResizeImage("/Image/user_m.png", null, 80, 80));
        btn_Device.setIcon(ri.ResizeImage("/Image/device.png", null, 80, 80));
        btn_Borrow.setIcon(ri.ResizeImage("/Image/borrow.png", null, 80, 80));
        btn_Pay.setIcon(ri.ResizeImage("/Image/pay.png", null, 80, 80));
        btn_QlDon.setIcon(ri.ResizeImage("/Image/document.png", null, 80, 80));
        btn_Statistics.setIcon(ri.ResizeImage("/Image/statistics.png", null, 80, 80));
        btn_Borrow.setActionCommand(lbBorrowM.getText());
        btn_Device.setActionCommand(lbDeviceM.getText());
        btn_Pay.setActionCommand(lbPayM.getText());
        btn_User.setActionCommand(lbUserM.getText());
        btn_Statistics.setActionCommand(lbStatistics.getText());
        btn_QlDon.setActionCommand(lbDocumentM.getText());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_Device = new javax.swing.JButton();
        btn_User = new javax.swing.JButton();
        btn_QlDon = new javax.swing.JButton();
        lbDeviceM = new javax.swing.JLabel();
        lbUserM = new javax.swing.JLabel();
        lbDocumentM = new javax.swing.JLabel();
        btn_Borrow = new javax.swing.JButton();
        btn_Pay = new javax.swing.JButton();
        btn_Statistics = new javax.swing.JButton();
        lbBorrowM = new javax.swing.JLabel();
        lbPayM = new javax.swing.JLabel();
        lbStatistics = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_Search = new javax.swing.JButton();
        txf_Search = new javax.swing.JTextField();
        lbl_Logo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1080, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(4, 6));

        btn_Device.setActionCommand("Device Management");
        btn_Device.setContentAreaFilled(false);
        btn_Device.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeviceActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Device);

        btn_User.setActionCommand("User Management");
        btn_User.setContentAreaFilled(false);
        btn_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UserActionPerformed(evt);
            }
        });
        jPanel2.add(btn_User);

        btn_QlDon.setActionCommand("Document Management");
        btn_QlDon.setContentAreaFilled(false);
        btn_QlDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QlDonActionPerformed(evt);
            }
        });
        jPanel2.add(btn_QlDon);

        lbDeviceM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDeviceM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDeviceM.setText("Device Management");
        lbDeviceM.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbDeviceM);

        lbUserM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbUserM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUserM.setText("User Management");
        lbUserM.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbUserM);

        lbDocumentM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDocumentM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocumentM.setText("Document Management");
        lbDocumentM.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbDocumentM);

        btn_Borrow.setContentAreaFilled(false);
        btn_Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrowActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Borrow);

        btn_Pay.setContentAreaFilled(false);
        btn_Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PayActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Pay);

        btn_Statistics.setContentAreaFilled(false);
        btn_Statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StatisticsActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Statistics);

        lbBorrowM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbBorrowM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBorrowM.setText("Borrow Management");
        lbBorrowM.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbBorrowM);

        lbPayM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPayM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPayM.setText("Pay Management");
        lbPayM.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbPayM);

        lbStatistics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbStatistics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStatistics.setText("Statistics");
        lbStatistics.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(lbStatistics);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_Search.setContentAreaFilled(false);

        txf_Search.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txf_Search.setBorder(null);
        txf_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_SearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txf_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txf_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbl_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeviceActionPerformed
        MAIN_GUI.replacePanel(MAIN_GUI.device);
        lbCurrentMenu.setIcon(ri.resizeImage((ImageIcon) btn_Device.getIcon(), null, 30, 30));
        lbCurrentMenu.setText("Quản lý thiết bị");
        MAIN_GUI.hideOrShowMenu(true);
    }//GEN-LAST:event_btn_DeviceActionPerformed

    private void btn_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UserActionPerformed
        MAIN_GUI.replacePanel(MAIN_GUI.usm);
        lbCurrentMenu.setIcon(ri.resizeImage((ImageIcon) btn_User.getIcon(), null, 30, 30));
        MAIN_GUI.hideOrShowMenu(true);
        lbCurrentMenu.setText("Quản lý người dùng");
    }//GEN-LAST:event_btn_UserActionPerformed

    private void btn_StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StatisticsActionPerformed
        MAIN_GUI.replacePanel(MAIN_GUI.sts);
        MAIN_GUI.hideOrShowMenu(true);
        lbCurrentMenu.setText("Thống kê");
        lbCurrentMenu.setIcon(ri.resizeImage((ImageIcon) btn_Statistics.getIcon(), null, 30, 30));
    }//GEN-LAST:event_btn_StatisticsActionPerformed

    private void btn_BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrowActionPerformed
        MAIN_GUI.replacePanel(MAIN_GUI.bdv);
        lbCurrentMenu.setIcon(ri.resizeImage((ImageIcon) btn_Borrow.getIcon(), null, 30, 30));
        MAIN_GUI.hideOrShowMenu(true);
        lbCurrentMenu.setText("Quản lý thiết bị mượn");
    }//GEN-LAST:event_btn_BorrowActionPerformed

    private void btn_PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PayActionPerformed
        MAIN_GUI.replacePanel(MAIN_GUI.pdv);
        MAIN_GUI.hideOrShowMenu(true);
        lbCurrentMenu.setIcon(ri.resizeImage((ImageIcon) btn_Pay.getIcon(), null, 30, 30));
        lbCurrentMenu.setText("Quản lý thiết bị trả");
    }//GEN-LAST:event_btn_PayActionPerformed

    private void btn_QlDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QlDonActionPerformed
        MAIN_GUI.replacePanel(MAIN_GUI.cm);
        MAIN_GUI.hideOrShowMenu(true);
        lbCurrentMenu.setIcon(ri.resizeImage((ImageIcon) btn_QlDon.getIcon(), null, 30, 30));
        lbCurrentMenu.setText("Quản lý đơn");
    }//GEN-LAST:event_btn_QlDonActionPerformed

    private void txf_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SearchKeyPressed
        if (!txf_Search.getText().isEmpty()) {
            Check.setVisible(jPanel2, false);
            Check.setVisibleLB(jPanel2, false);
            Check.setVisible(jPanel2, txf_Search.getText());
            Check.setVisibleLB(jPanel2, txf_Search.getText());
        } else {
            Check.setVisible(jPanel2, true);
            Check.setVisibleLB(jPanel2, true);
        }
    }//GEN-LAST:event_txf_SearchKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrow;
    private javax.swing.JButton btn_Device;
    private javax.swing.JButton btn_Pay;
    private javax.swing.JButton btn_QlDon;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Statistics;
    private javax.swing.JButton btn_User;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBorrowM;
    private javax.swing.JLabel lbDeviceM;
    private javax.swing.JLabel lbDocumentM;
    private javax.swing.JLabel lbPayM;
    private javax.swing.JLabel lbStatistics;
    private javax.swing.JLabel lbUserM;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JTextField txf_Search;
    // End of variables declaration//GEN-END:variables
}
