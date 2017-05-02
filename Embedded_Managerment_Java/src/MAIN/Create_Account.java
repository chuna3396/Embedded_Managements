
package MAIN;

import SQL.ConnectMySQL;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.util.Random;
import javax.swing.JComponent;


public class Create_Account extends javax.swing.JFrame {

    ConnectMySQL cn = new ConnectMySQL();
   
    private String usid = null;
    private String passMH = null;
    private Object[] user = null;
   
    public Create_Account(JComponent component, Object[] d) throws NoSuchAlgorithmException {
        initComponents();
        user = d;
        System.out.println(user[0].toString());
        txt_UserMail.setText(d[6].toString());
        String name = d[1].toString();
        int space = 0;
        int index = 0;
        for(int i=0; i<name.length(); i++){
            char[] c = name.toCharArray();
            System.out.println(c[i]);
            if(c[i]==' '){
                space++;
                index = i;
            }
        }
        String us = name.substring(index+1, name.length());
        Random r = new Random();        
        Date date =  Date.valueOf(d[2].toString());
        String dd = String.valueOf((date.getDate()));
        String MM = String.valueOf((date.getMonth()+1));
        String yyyy = String.valueOf((date.getYear()+1900));
        String id = dd+MM+yyyy;
        
        usid = us+id;
        String pass = getSaltString();
        txt_Username.setText(usid);
        txt_Pass.setText(pass);
        passMH = MD5.MD5.getMD5Hash(pass);

        setLocationRelativeTo(component);
        setVisible(true);
    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#$%&";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 8) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Send_User = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        txt_UserMail = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JTextField();
        btn_Cancel = new javax.swing.JButton();
        btn_Close5 = new javax.swing.JButton();
        btn_Send = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_Send_User.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Send_User.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        pnl_Send_User.setPreferredSize(new java.awt.Dimension(700, 420));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setText("Gửi xác nhận đến:");

        txt_UserMail.setEditable(false);
        txt_UserMail.setBackground(new java.awt.Color(255, 255, 255));
        txt_UserMail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setText("Tên đăng nhập");

        txt_Username.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel69.setText("Mật khẩu");

        txt_Pass.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });

        btn_Close5.setForeground(new java.awt.Color(204, 0, 0));
        btn_Close5.setText("X");
        btn_Close5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        btn_Close5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Close5ActionPerformed(evt);
            }
        });

        btn_Send.setText("Send account");
        btn_Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_Send_UserLayout = new javax.swing.GroupLayout(pnl_Send_User);
        pnl_Send_User.setLayout(pnl_Send_UserLayout);
        pnl_Send_UserLayout.setHorizontalGroup(
            pnl_Send_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_Send_UserLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Close5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_Send_UserLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnl_Send_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_Send_UserLayout.createSequentialGroup()
                        .addComponent(btn_Send)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_Send_UserLayout.createSequentialGroup()
                        .addGroup(pnl_Send_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_UserMail, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnl_Send_UserLayout.setVerticalGroup(
            pnl_Send_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Send_UserLayout.createSequentialGroup()
                .addComponent(btn_Close5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_UserMail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnl_Send_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Send, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Send_User, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Send_User, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_Close5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Close5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_Close5ActionPerformed

    private void btn_SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SendActionPerformed
        cn.saveUserRequest(usid, passMH);
        cn.saveUserInfoRequest(usid,  user[1].toString(),
                Date.valueOf(user[2].toString()), user[3].toString(), user[4].toString(),
                user[5].toString(), user[6].toString(), true);
        
        cn.AcceptRegisterRequest(Integer.parseInt(user[0].toString()));    
        Confirm_Create_Account.btn_Reload.doClick();
        this.dispose();
    }//GEN-LAST:event_btn_SendActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Close1;
    private javax.swing.JButton btn_Close2;
    private javax.swing.JButton btn_Close3;
    private javax.swing.JButton btn_Close4;
    private javax.swing.JButton btn_Close5;
    private javax.swing.JButton btn_OK;
    private javax.swing.JButton btn_OK1;
    private javax.swing.JButton btn_OK2;
    private javax.swing.JButton btn_OK3;
    private javax.swing.JButton btn_OK4;
    private javax.swing.JButton btn_OK5;
    private javax.swing.JButton btn_OK6;
    private javax.swing.JButton btn_OK7;
    private javax.swing.JButton btn_Send;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnl_Details_User;
    private javax.swing.JPanel pnl_Details_User1;
    private javax.swing.JPanel pnl_Details_User2;
    private javax.swing.JPanel pnl_Details_User3;
    private javax.swing.JPanel pnl_Details_User4;
    private javax.swing.JPanel pnl_Details_User5;
    private javax.swing.JPanel pnl_Details_User6;
    private javax.swing.JPanel pnl_Details_User7;
    private javax.swing.JPanel pnl_Send_User;
    private javax.swing.JTextField txt_Activated;
    private javax.swing.JTextField txt_Activated1;
    private javax.swing.JTextField txt_Activated2;
    private javax.swing.JTextField txt_Activated3;
    private javax.swing.JTextField txt_Activated4;
    private javax.swing.JTextField txt_Activated5;
    private javax.swing.JTextField txt_Activated6;
    private javax.swing.JTextField txt_Activated7;
    private javax.swing.JTextField txt_Birthday;
    private javax.swing.JTextField txt_Birthday1;
    private javax.swing.JTextField txt_Birthday2;
    private javax.swing.JTextField txt_Birthday3;
    private javax.swing.JTextField txt_Birthday4;
    private javax.swing.JTextField txt_Birthday5;
    private javax.swing.JTextField txt_Birthday6;
    private javax.swing.JTextField txt_Birthday7;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Email1;
    private javax.swing.JTextField txt_Email2;
    private javax.swing.JTextField txt_Email3;
    private javax.swing.JTextField txt_Email4;
    private javax.swing.JTextField txt_Email5;
    private javax.swing.JTextField txt_Email6;
    private javax.swing.JTextField txt_Email7;
    private javax.swing.JTextField txt_IDCard;
    private javax.swing.JTextField txt_IDCard1;
    private javax.swing.JTextField txt_IDCard2;
    private javax.swing.JTextField txt_IDCard3;
    private javax.swing.JTextField txt_IDCard4;
    private javax.swing.JTextField txt_IDCard5;
    private javax.swing.JTextField txt_IDCard6;
    private javax.swing.JTextField txt_IDCard7;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Name1;
    private javax.swing.JTextField txt_Name2;
    private javax.swing.JTextField txt_Name3;
    private javax.swing.JTextField txt_Name4;
    private javax.swing.JTextField txt_Name5;
    private javax.swing.JTextField txt_Name6;
    private javax.swing.JTextField txt_Name7;
    private javax.swing.JTextField txt_Pass;
    private javax.swing.JTextField txt_Phone;
    private javax.swing.JTextField txt_Phone1;
    private javax.swing.JTextField txt_Phone2;
    private javax.swing.JTextField txt_Phone3;
    private javax.swing.JTextField txt_Phone4;
    private javax.swing.JTextField txt_Phone5;
    private javax.swing.JTextField txt_Phone6;
    private javax.swing.JTextField txt_Phone7;
    private javax.swing.JTextField txt_Sex;
    private javax.swing.JTextField txt_Sex1;
    private javax.swing.JTextField txt_Sex2;
    private javax.swing.JTextField txt_Sex3;
    private javax.swing.JTextField txt_Sex4;
    private javax.swing.JTextField txt_Sex5;
    private javax.swing.JTextField txt_Sex6;
    private javax.swing.JTextField txt_Sex7;
    private javax.swing.JTextField txt_UserID;
    private javax.swing.JTextField txt_UserID1;
    private javax.swing.JTextField txt_UserID2;
    private javax.swing.JTextField txt_UserID3;
    private javax.swing.JTextField txt_UserID4;
    private javax.swing.JTextField txt_UserID5;
    private javax.swing.JTextField txt_UserID6;
    private javax.swing.JTextField txt_UserID7;
    private javax.swing.JTextField txt_UserMail;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
