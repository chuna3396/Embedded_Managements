package SQL;

import Models.TaiKhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConnectMySQL {

    private Connection cn;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    String hostName = "loachost";
    String dbName = "database_embedded";
    String userName = "chuna";
    String password = "";
    Connection conn = null;
    String[] colsName;

    public Connection getConn() {
        return cn;
    }

    public ConnectMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String uRL = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useUnicode=true&characterEncoding=UTF-8";
            cn = (Connection) DriverManager.getConnection(uRL, userName, password);
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }

    public boolean CheckLogin(String userName, String pass) {
        boolean check = false;
        String sql = "Select * From User Where User_ID = ? AND Password = ?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi đăng nhập !");
        }
        return check;
    }

    public boolean CheckTDN(String tdn) {
        String sql;
        sql = "Select * From taikhoan Where tentk = '" + tdn + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
        }
        return false;
    }

    public int LVTK(TaiKhoan tk) {
        int lvtk = 0;
        String sql;
        sql = "Select lv From taikhoan Where tentk = '" + tk.getTdn() + "' AND mk='" + tk.getMk() + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                lvtk = rs.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi !");
        }
        return lvtk;
    }

    public TaiKhoan GetTaiKhoan(String name, String pass) {
        TaiKhoan td = null;
        String sql;
        sql = "SELECT * FROM taikhoan Where tentk = '" + name + "' AND mk='" + pass + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                td = new TaiKhoan(rs.getString(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return td;
    }

    public String RandomPass() {
        Random ran = new Random();
        int top = 4;
        char data = ' ';
        String dat = "";
        for (int i = 0; i <= top; i++) {
            data = (char) (ran.nextInt(25) + 97);
            dat = data + dat;
        }
        return dat;
    }

    public void QuenMK(String tdn, String newpass) {
        try {
            Statement st = cn.createStatement();
            int rows = st.executeUpdate("UPDATE taikhoan SET mk = '" + newpass + "' WHERE tentk = '" + tdn + "'");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
    }

    public boolean CheckMKCu(String tdn, String mk) {
        boolean check = false;
        String sql;
        sql = "SELECT * FROM taikhoan Where tentk = '" + tdn + "' AND mk='" + mk + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public String getNick(String tdn) {
        String nickName = null;
        String sql;
        sql = "SELECT * FROM taikhoan Where tentk = ?";
        try {
            ps = cn.prepareStatement(tdn);
            ps.setString(1, tdn);
            ResultSet rs = ps.executeQuery(sql);
            while (rs.next()) {
                nickName = rs.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return nickName;
    }

    public void addDevice(int ID, String TenSP, int SL, String TTr, String LoaiSP, String NSX, String Mota) {
        //System.setProperty("file.encoding","UTF-16");
        String sql = "INSERT INTO device VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.setString(2, TenSP);
            ps.setString(6, NSX);
            ps.setInt(3, SL);
            ps.setString(4, TTr);
            ps.setString(5, LoaiSP);
            ps.setString(7, Mota);
            System.out.println(ID + "', '" + TenSP + "', '" + SL + "', '" + NSX + "', '" + LoaiSP);
            int rows = ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
            System.err.println(ex);
        }
    }

    public void updateDevice(String TenSP, int SL, String TTr, String LoaiSP, String NSX, String Mota, int ID) {
        String sql = "UPDATE device SET Device_Name=?, Quantity=?, State=?, Category= ?, Manufacturer=?, Details_Decribe=? WHERE Device_ID = ?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, TenSP);
            ps.setInt(2, SL);
            ps.setString(3, TTr);
            ps.setString(4, LoaiSP);
            ps.setString(5, NSX);
            ps.setString(6, Mota);
            ps.setInt(7, ID);
            System.out.println(ID + "', '" + TenSP + "', '" + SL + "', '" + NSX + "', '" + LoaiSP);
            int rows = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
            System.err.println(ex);
        }
    }

    public void deleteDevice(int ID) {
        String sql = "DELETE FROM device WHERE Device_ID=?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, ID);
            int rows = ps.executeUpdate();
            System.out.println("Delete * " + ID);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa !");
            System.err.println(ex);
        }
    }

    public String loadImage(int ID_Device) {
        String path = null;
        String sql = "Select Image_Url FROM device_image WHERE Device_ID=?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, ID_Device);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                path = "http://" + hostName + rs.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        //System.out.println(path);
        return path;
    }

    private String chuanHoa(String s) {
        String str = s.replaceAll("<br/>", "");
        return str;
    }

    public DefaultTableModel getDevice() {
        DefaultTableModel tblDevice = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0:
                        return true;
                    default:
                        return false;
                }
            }

            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Boolean.class;
                    default:
                        return String.class;
                }
            }
        };
        String[] colsName = {"Tất cả", "ID", "Tên SP", "Nhà sản xuất", "Số lượng",
            "Tình trạng", "Loại sản phẩm", "Mô tả", "Thông số kỹ thuật"};
        tblDevice.setColumnIdentifiers(colsName);
        String sql = "SELECT `Device_ID`, `Device_Name`, `Manufacturer`, `Quantity`, `State`, "
                + "`Category`, `Details_Decribe`, `Specification` FROM `device`";
        try {
            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object rows[] = new Object[9];
                rows[0] = false;
                rows[1] = rs.getInt(1);
                rows[2] = chuanHoa(rs.getString(2));//
                rows[3] = rs.getString(3);
                rows[4] = rs.getInt(4);
                rows[5] = rs.getString(5);
                rows[6] = rs.getString(6);
                rows[7] = rs.getString(7);
                rows[8] = chuanHoa(rs.getString(8));//
                tblDevice.addRow(rows);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi dd!");
        }
        return tblDevice;
    }

    public String getImage(int device_ID) {
        String sql = "SELECT `Image_Url` FROM `device_image` WHERE  Device_ID = ?";
        String uRL = "";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, device_ID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                uRL = rs.getString(1);
            }
        } catch (SQLException ex) {

        }
        return "http://" + hostName + "/" + uRL;
    }

    public DefaultTableModel getUser() {
        DefaultTableModel tbl = new DefaultTableModel() {
              @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0:
                        return true;
                    default:
                        return false;
                }
            }

            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Boolean.class;
                    default:
                        return String.class;
                }
            }  
        };
        String[] colsName = {"Tất cả", "Tên đăng nhập", "Họ tên", "Ngày sinh", "Giới tính", "CMND", "Phone", "Email", "Kích hoạt"};
        tbl.setColumnIdentifiers(colsName);
        String sql = "SELECT `User_ID`, `User_Name`, `Birthday`, `Sex`, "
                + "`IDCard`, `Phone`, `Email`, `Activated` FROM `user_info`";
        try {
            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object rows[] = new Object[9];
                rows[0] = false;
                rows[1] = rs.getString(1);
                rows[2] = rs.getString(2);
                rows[3] = rs.getDate(3);
                rows[4] = rs.getString(4);
                rows[5] = rs.getString(5);
                rows[6] = rs.getString(6);
                rows[7] = rs.getString(7);
                rows[8] = rs.getBoolean(8);
                tbl.addRow(rows);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi getUser!");
        }
        return tbl;
    }

    public void lockAccount(String userID, String b){
        String sql = "UPDATE `user_info` SET `Activated` = ? WHERE `User_ID` = ?";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, b); ps.setString(2, userID);
            int rows = ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi lockAccount!");
        }    
    }
    
    public DefaultTableModel getBorrow() {
        DefaultTableModel tbl = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] colsName = {"ID Mượn", "Tên Thiết bị", "Người mượn",
            "Dự án", "Ngày mượn", "Ngày trả (dự kiến)", "Tình trạng", "Hoàn trả"};
        tbl.setColumnIdentifiers(colsName);
        String sql = "SELECT Borrow_ID, device.Device_Name,"
                + " user_info.User_Name, project.Project_Name, device_borrow.Borrow_Date,"
                + "device_borrow.Expect_Date ,device.State,device_borrow.IsPay "
                + "FROM device_borrow, user_info,project,device "
                + "WHERE user_info.User_ID=device_borrow.User_ID "
                + "AND device.Device_ID=device_borrow.Device_ID "
                + "AND project.Project_ID=device_borrow.Project_ID";
        try {
            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object rows[] = new Object[8];
                rows[0] = rs.getInt(1);
                rows[1] = rs.getString(2);
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getDate(5);
                rows[5] = rs.getDate(6);
                rows[6] = rs.getString(7);
                rows[7] = (rs.getBoolean(8) == false) ? "Chưa" : "Xong";
                tbl.addRow(rows);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return tbl;
    }

    public DefaultTableModel getPay() {
        DefaultTableModel tbl = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] colsName = {"ID mượn", "Tên thiết bị", "Họ tên", "Dự án", "Ngày mượn", "Ngày trả (dự kiến)", "Tình trạng (mượn)", "Ngày trả", "Tình trạng(trả)"};
        tbl.setColumnIdentifiers(colsName);
        String sql;
        sql = "SELECT device_borrow.Borrow_ID, device.Device_Name, user_info.User_Name,"
                + " project.Project_Name, device_borrow.Borrow_Date, device_borrow.Expect_Date,"
                + " device.State, Pay_Date, Pay_State FROM device_pay, device_borrow, device,"
                + " user_info, project WHERE device_pay.Borrow_ID = device_borrow.Borrow_ID "
                + "AND device_borrow.Device_ID = device.Device_ID "
                + "AND device_borrow.User_ID = user_info.User_ID "
                + "AND device_borrow.Project_ID = project.Project_ID";
        try {
            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object rows[] = new Object[9];
                rows[0] = rs.getInt(1);
                rows[1] = rs.getString(2);
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getDate(5);
                rows[5] = rs.getDate(6);
                rows[6] = rs.getString(7);
                rows[7] = rs.getDate(8);
                rows[8] = rs.getString(9);
                tbl.addRow(rows);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return tbl;
    }

    public String[] getColumnName(String[] column) {
        colsName = column;
        return colsName;
    }

    public DefaultTableModel getRequestUser() {
        DefaultTableModel tbl = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] colsName = {"ID", "Name", "Giới tính", "Ngày sinh", "CMND", "Phone", "Email", "Kích hoạt"};
        getColumnName(colsName);
        tbl.setColumnIdentifiers(colsName);
        String sql;
        sql = "SELECT * FROM register_request";
        try {
            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object rows[] = new Object[8];
                rows[0] = rs.getString(1);
                rows[1] = rs.getString(2);
                rows[2] = rs.getString(4);
                rows[3] = rs.getDate(3);
                rows[4] = rs.getString(5);
                rows[5] = rs.getString(6);
                rows[6] = rs.getString(7);
                rows[7] = (rs.getBoolean(8) == true) ? "Kích hoạt" : "Chưa kích hoạt";
                tbl.addRow(rows);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi !");
        }
        return tbl;
    }

    public DefaultTableModel getBorrowRequest() {
        DefaultTableModel tbl = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] colsName = {"ID đơn mượn", "Tên Thiết bị", "Người mượn",
            "Dự án", "Ngày mượn", "Ngày trả (dự kiến)", "Tình trạng"};
        tbl.setColumnIdentifiers(colsName);
        String sql = "SELECT Confirm_ID, device.Device_Name, user_info.User_Name, "
                + "project.Project_Name, Borrow_Date, Expect_Date ,device.State"
                + " FROM borrow_request, device, user_info, project "
                + "WHERE device.Device_ID = borrow_request.Device_ID "
                + "AND project.Project_ID = borrow_request.Project_ID "
                + "AND project.User_ID = user_info.User_ID";
        try {
            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object rows[] = new Object[7];
                rows[0] = rs.getInt(1);
                rows[1] = rs.getString(2);
                rows[2] = rs.getString(3);
                rows[3] = rs.getString(4);
                rows[4] = rs.getDate(5);
                rows[5] = rs.getDate(6);
                rows[6] = rs.getString(7);
                tbl.addRow(rows);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi nhe !");
        }
        return tbl;
    }

    public int getMaxRow(String table) {
        String sql = "SELECT COUNT(*) FROM " + table;
        int count = 0;
        try {
            ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi nhe  !");
        }
        System.err.println(count);
        return count;
    }
 
}
