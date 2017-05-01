package MAIN;

import GUI.Custom.ResizeImage;

public class Confirm_Create_Acc extends javax.swing.JPanel {

    public Confirm_Create_Acc() {
        initComponents();
        btn_Refresh.setIcon(new ResizeImage().ResizeImage("/Image/refresh.png", null, 50, 50));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_UsID = new javax.swing.JLabel();
        lbl_UsID1 = new javax.swing.JLabel();
        txf_UsID = new javax.swing.JTextField();
        psf_Pass = new javax.swing.JPasswordField();
        btn_Refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lbl_UsID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_UsID.setText("User ID");

        lbl_UsID1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_UsID1.setText("Password");

        btn_Refresh.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_UsID)
                    .addComponent(lbl_UsID1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txf_UsID, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(psf_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(302, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {psf_Pass, txf_UsID});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_UsID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txf_UsID, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(lbl_UsID1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(psf_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {psf_Pass, txf_UsID});

    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JLabel lbl_UsID;
    private javax.swing.JLabel lbl_UsID1;
    private javax.swing.JPasswordField psf_Pass;
    private javax.swing.JTextField txf_UsID;
    // End of variables declaration//GEN-END:variables
}
