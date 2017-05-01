package GUI.Custom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;

public class CustomPanel extends JPanel {

    public static CustomPanel p;
    private GridBagConstraints gbc;

    public CustomPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(420, 600));
        setBackground(new Color(44, 62, 80));
    }

}
