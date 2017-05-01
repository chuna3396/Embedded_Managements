/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Custom;

import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

/**
 *
 * @author chuna
 */
public class CustomTabbed extends JTabbedPane {

    private String name;

    public CustomTabbed() {
        UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0, 0, 0, 0));
        UIManager.getDefaults().put("TabbedPane.tabAreaInsets", new Insets(0, 0, 0, 0));
        UIManager.getDefaults().put("TabbedPane.tabsOverlapBorder", true);
        setFont(new Font("Segoe UI", 1, 14));
    }
}
