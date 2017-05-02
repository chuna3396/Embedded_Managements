/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MD5;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;

/**
 *
 * @author chuna
 */
public class RowHeaderRenderer extends JLabel implements ListCellRenderer {

    private JTable table;

    RowHeaderRenderer(JTable table) {
        this.table = table;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean cellHasFocus) {
        setText((value == null) ? "" : value.toString());
        setPreferredSize(null);
        setPreferredSize(new Dimension((int) getPreferredSize().getWidth(),
                table.getRowHeight(index)));
        list.firePropertyChange("cellRenderer", 0, 1);
        return this;
    }
}
