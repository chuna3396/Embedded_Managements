/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Custom;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author chuna
 */
public class SetContainer {

    public SetContainer() {
    }

    public static void clearTextFields(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setText("");
            } else if (c instanceof Container) {
                clearTextFields((Container) c);
            }
        }
    }

    public static void clearCombox(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JComboBox) {
                JComboBox f = (JComboBox) c;
                f.setSelectedIndex(-1);
            } else if (c instanceof Container) {
                clearCombox((Container) c);
            }
        }
    }

    public static void clearTextArea(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextArea) {
                JTextArea f = (JTextArea) c;
                f.setText("");
            } else if (c instanceof Container) {
                clearTextArea((Container) c);
            }
        }
    }

    public static void clearButton(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JButton) {
                JButton f = (JButton) c;
                f.setText("No Image");
                f.setIcon(null);
            } else if (c instanceof Container) {
                clearButton((Container) c);
            }
        }
    }

    public static void setLineBorder(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }
//            else if (c instanceof Container) {
//                setLineBorder((Container) c);
//            }
        }
    }

    public static void setNullBorder(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setBorder(null);
            } else if (c instanceof Container) {
//                setLineBorder((Container) c);
            }
        }
    }

    public static void setEditTextField(Container container, boolean b) {
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                f.setFocusable(b);
            } else if (c instanceof Container) {
//                setEditTextField(container, b);
            }
        }
    }
 

     

    public static void setEditComboBox(Container container, boolean b) {
        for (Component c : container.getComponents()) {
            if ((c instanceof JComboBox)) {
                JComboBox f = (JComboBox) c;
                f.setEnabled(b);
            } else if (c instanceof Container) {
//                setEditComboBox((Container) c, b);
            }
        }
    }

    public static void setEditSpinner(Container container, boolean b) {
        for (Component c : container.getComponents()) {
            if ((c instanceof JSpinner)) {
                JSpinner f = (JSpinner) c;
                f.setEnabled(b);
            } else if (c instanceof Container) {
//                setEditSpinner((Container) c, b);
            }
        }
    }

    public static void setEditComponent(Container container, boolean b) {
        setEditComboBox(container, b);
        setEditSpinner(container, b); 
        setEditTextField(container, b);
    }
}
