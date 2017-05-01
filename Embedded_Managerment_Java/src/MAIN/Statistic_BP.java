package MAIN;

public class Statistic_BP extends javax.swing.JPanel {

    public Statistic_BP() {
        initComponents();
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
        pnl_Borrow = new javax.swing.JPanel();
        pnl_Infor1 = new javax.swing.JPanel();
        btn_OK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbx_Ktk = new javax.swing.JComboBox<>();
        btn_InTK = new javax.swing.JButton();

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

        setPreferredSize(new java.awt.Dimension(1016, 664));

        pnl_Borrow.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Borrow.setPreferredSize(new java.awt.Dimension(1000, 660));

        pnl_Infor1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Infor1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        pnl_Infor1.setPreferredSize(new java.awt.Dimension(960, 249));

        btn_OK.setText("OK");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Thống kê theo");

        cbx_Ktk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dự án", "Thiết bị", "Mượn thiết bị", "Trả thiết bị", "Vi phạm", " " }));

        javax.swing.GroupLayout pnl_Infor1Layout = new javax.swing.GroupLayout(pnl_Infor1);
        pnl_Infor1.setLayout(pnl_Infor1Layout);
        pnl_Infor1Layout.setHorizontalGroup(
            pnl_Infor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Infor1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbx_Ktk, 0, 260, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        pnl_Infor1Layout.setVerticalGroup(
            pnl_Infor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Infor1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnl_Infor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbx_Ktk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btn_InTK.setText("In thống kê");

        javax.swing.GroupLayout pnl_BorrowLayout = new javax.swing.GroupLayout(pnl_Borrow);
        pnl_Borrow.setLayout(pnl_BorrowLayout);
        pnl_BorrowLayout.setHorizontalGroup(
            pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BorrowLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_Infor1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_InTK, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnl_BorrowLayout.setVerticalGroup(
            pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BorrowLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnl_Infor1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(458, 458, 458)
                .addComponent(btn_InTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_InTK;
    private javax.swing.JButton btn_OK;
    private javax.swing.JComboBox<String> cbx_Ktk;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel pnl_Infor;
    private javax.swing.JPanel pnl_Infor1;
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
