/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAIN;

import GUI.Custom.CustomTextField;
import GUI.Custom.CustoomPassfield;
import GUI.Custom.ResizeImage;
import SQL.ConnectMySQL;
import customborder.TextBubbleBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author chuna
 */
public class Login_GUI_ extends JFrame implements ActionListener, KeyListener {

    private int WIDTH_Panel = 400, HEIGHT_Panel = 525;
    private String username, password;
    private JPanel panel;

    public Login_GUI_() {
        super("Đăng nhập");
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
        initComponents();
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btn_DangNhap);
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="initComponent">                          
    private void initComponents() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(new ResizeImage().ResizeImage("/Image/statistics.png", null, 80, 80).getImage());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(WIDTH_Panel, HEIGHT_Panel));
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        lbl_name = new JLabel();
        lbl_TenDangNhap = new JLabel();
        lbl_MatKhau = new JLabel();
        txt_TenDangNhap = new CustomTextField("Tên đăng nhập");
        txt_MatKhau = new CustoomPassfield("Mật khẩu của bạn");
        btn_DangNhap = new JButton();
        btn_Thoat = new JButton();
        btn_QuenMatKhau = new JButton();

        lbl_name.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        lbl_name.setIcon(new ImageIcon(getClass().getResource("/Image/Logo.jpg"))); // NOI18N
        panel.add(lbl_name);
        lbl_name.setBounds((WIDTH_Panel - 200) / 2, 18, 200, 103);

        lbl_TenDangNhap.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        lbl_TenDangNhap.setText("Tên đăng nhập: ");
        panel.add(lbl_TenDangNhap);
        lbl_TenDangNhap.setBounds((WIDTH_Panel - 330) / 2, 156, 100, 15);

        lbl_MatKhau.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        lbl_MatKhau.setText("Mật khẩu:");
        panel.add(lbl_MatKhau);
        lbl_MatKhau.setBounds(lbl_TenDangNhap.getX(), 263, 62, 15);

        txt_TenDangNhap.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        txt_TenDangNhap.setToolTipText("");
        txt_TenDangNhap.setBorder(new TextBubbleBorder(Color.BLACK, 1, 16, 0));
        panel.add(txt_TenDangNhap);
        txt_TenDangNhap.setBounds(lbl_TenDangNhap.getX(), 177, 330, 50);

        txt_MatKhau.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        txt_MatKhau.setBorder(new TextBubbleBorder(Color.BLACK, 1, 16, 0));
        panel.add(txt_MatKhau);
        txt_MatKhau.setBounds(lbl_TenDangNhap.getX(), 284, 330, 50);

        btn_DangNhap.setBackground(new Color(0, 40, 50));
        btn_DangNhap.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        btn_DangNhap.setForeground(new Color(255, 255, 255));
        btn_DangNhap.setText("Đăng Nhập");
        btn_DangNhap.setContentAreaFilled(false);
        btn_DangNhap.setOpaque(true);
        btn_DangNhap.addActionListener(this);

        panel.add(btn_DangNhap);
        btn_DangNhap.setBounds(lbl_TenDangNhap.getX() + 20, 399, 120, 45);

        btn_Thoat.setBackground(new Color(0, 40, 50));
        btn_Thoat.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        btn_Thoat.setForeground(new Color(255, 255, 255));
        btn_Thoat.setText("Thoát");
        btn_Thoat.setContentAreaFilled(false);
        btn_Thoat.setOpaque(true);
        btn_Thoat.addActionListener(this);
        panel.add(btn_Thoat);
        btn_Thoat.setBounds(lbl_TenDangNhap.getX() + 70 + 120, 399, 120, 45);

        btn_QuenMatKhau.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        btn_QuenMatKhau.setForeground(new Color(0, 40, 50));
        btn_QuenMatKhau.setText("Quên mật khẩu?");
        btn_QuenMatKhau.setContentAreaFilled(false);
        btn_QuenMatKhau.setFocusPainted(false);
        btn_QuenMatKhau.setBorder(null);
        btn_QuenMatKhau.setOpaque(false);
        btn_QuenMatKhau.addActionListener(this);
        panel.add(btn_QuenMatKhau);
        btn_QuenMatKhau.setBounds((WIDTH_Panel - 120) / 2, 478, 120, 15);
    }// </editor-fold>                        

    public static void main(String args[]) {
        new Login_GUI_();
    }

    // Variables declaration - do not modify                     
    private JButton btn_DangNhap;
    private JButton btn_Thoat;
    private JLabel lbl_MatKhau;
    private JButton btn_QuenMatKhau;
    private JLabel lbl_TenDangNhap;
    private JLabel lbl_name;
    private CustoomPassfield txt_MatKhau;
    private CustomTextField txt_TenDangNhap;
    // End of variables declaration             

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        String x = null;
        if (o == btn_DangNhap) {
            try {
                username = txt_TenDangNhap.getText().trim();
                password = MD5.MD5.getMD5Hash(txt_MatKhau.getText());
            } catch (Exception ex) {

            }
            if (new ConnectMySQL().CheckLogin(username, password)) {
                new MAIN_GUI().setVisible(true);
                this.dispose();
            } 
        }
        if (o == btn_Thoat) {
            System.exit(0);
        }
        if (o == btn_QuenMatKhau) {

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
