package Table;

import Models.Device;
import SQL.ConnectMySQL;
import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TableValue {

    public Object[] getValue(JTable table, DefaultTableModel tableModel) {
        int col = tableModel.getColumnCount();
        int row = table.getSelectedRow();
        Object[] o = new Object[col];
        for (int i = 0; i < col; i++) {
            o[i] = new Object();
            o[i] = tableModel.getValueAt(row, i);
        }
        return o;
    }

    public Object[] getValueList(String row, DefaultTableModel tableModel, int col) {
        int gRow = tableModel.getRowCount();
        int cols = tableModel.getColumnCount();

        Object[] tb = new Object[gRow];
        Object[] o = new Object[cols];
        for (int i = 0; i < gRow; i++) {
            tb[i] = new Object();
            tb[i] = tableModel.getValueAt(i, col);
            if (row.equals(tb[i])) {
                for (int j = 0; j < cols; j++) {
                    o[j] = new Object();
                    o[j] = tableModel.getValueAt(i, j);
                }
            }
        }
        return o;
    }

    public void filterTool(String query, JTable tb_Device_M) {
        DefaultTableModel model = (DefaultTableModel) tb_Device_M.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tb_Device_M.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(query));
    }

    public void deleteRow(DefaultTableModel tableModels, ArrayList rows) {
        for (int i = 0; i < rows.size(); i++) {
            tableModels.removeRow((int) rows.get(i));
            System.err.println(rows.get(i));
        }

    }

    public DefaultTableModel listModel(DefaultTableModel tableModel, int col) {
        DefaultTableModel listModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        int row = tableModel.getRowCount();
        String[] colsName = {""};
        listModel.setColumnIdentifiers(colsName);
        Object[] os = {"Tất cả"};
        listModel.addRow(os);
        for (int r = 0; r < row; r++) {
            Object[] o = new Object[row];
            o[0] = tableModel.getValueAt(r, col);
            listModel.addRow(o);
        }
        return listModel;
    }

    public static Object[] getObjects(Device d) {
        Object[] b = {false, d.getDv_ID(), d.getDvName(), d.getManufacturer(), d.getQuantity(),
            d.getState(), d.getCategory(), d.getDetails(), d.getSpecification()};
        return b;
    }

    public static void addRow(JTable table, Object[] strings) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.addRow(strings);
    }

    public void deleteRows(JTable table, int col) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            Boolean checked = (Boolean) model.getValueAt(i, col);
            if (checked != null && checked) {
                model.removeRow(i);
                i--;
            }
        }
    }

    public boolean isSelectedRows(JTable table, int col) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            Boolean checked = (Boolean) model.getValueAt(i, col);
            if (checked != null && checked) {
                return true;
            }
        }
        return false;
    }

    public static Object[] getValueAt(JTable table, int row) throws URISyntaxException {
        int col = 9;
        Object[] os = new Object[col];
        for (int i = 0; i < col - 1; i++) {
            os[i] = table.getValueAt(row, i + 1);
        }
        os[col - 1] = new ConnectMySQL().getImage(Integer.parseInt(os[0].toString()));
        return os;
    }

    public static Object[] getUserAt(JTable table, int row) throws URISyntaxException {
        int col = 9;
        Object[] os = new Object[col - 1];
        for (int i = 0; i < col - 1; i++) {
            os[i] = table.getValueAt(row, i + 1);
        }
        return os;
    }
    
    

    @SuppressWarnings("empty-statement")
    public File selectFile(JComponent jc) {
        File f = null;;
        try {
            JFileChooser chooser = new JFileChooser("C:\\xampp\\htdocs\\image");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Images File", "png", "jpeg", "jpg");
            chooser.setFileFilter(filter);
            if (chooser.showOpenDialog(jc) == JFileChooser.APPROVE_OPTION) {
                f = chooser.getSelectedFile();
            } else {

            }
        } catch (IllegalArgumentException e) {
        }

        return f;
    }

    public String getPath(String s) {
        return chuanHoa(s);
    }

    private String chuanHoa(String string) {
        return string.substring(15, string.length());
    }

    public static int getMaxID(JTable table, int col) {
        int rows = table.getRowCount();
        ArrayList<Integer> o = new ArrayList();
        for (int i = 0; i < rows; i++) {
            o.add(i, Integer.parseInt(table.getValueAt(i, col).toString()));
        }
        int max = o.get(0);
        int min = o.get(0);;
        for (int i = 0; i < o.size(); i++) {
            if (max < o.get(i)) {
                max = o.get(i);
            }
            if (min > o.get(i)) {
                min = o.get(i);
            }
        }
        return max;
    }

}
