package GUI.Custom;

import static GUI.Custom.SetContainer.clearCombox;
import java.awt.Component;
import java.awt.Container;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Check {

    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
    private static Calendar cal = Calendar.getInstance();
    static String date;

    public static String formatDate(Object date, int type) {
        if (type == 0) {
            Check.date = sdf1.format(Date.valueOf(date.toString()));
        } else if (type == 1) {
            Check.date = sdf2.format(Date.valueOf(date.toString()));
        }

        return Check.date;
    }

    public static boolean isNumber(String SL) {
        boolean number = false;
        try {
            int sl = Integer.parseInt(SL);
            number = true;
        } catch (NumberFormatException e) {
            number = false;
        }
        return number;
    }

    public static boolean txtIsEmpty(Container container) {
        int i = 0;
        int j = 0;
        for (Component c : container.getComponents()) {
            if (c instanceof JTextField) {
                JTextField f = (JTextField) c;
                j++;
                if (!f.getText().trim().isEmpty()) {
                    i++;
                }
            } else if (c instanceof Container) {
                txtIsEmpty((Container) c);
            }
        }
        return i == j;
    }

    public static boolean isSelected(Container container) {
        for (Component c : container.getComponents()) {
            if (c instanceof JComboBox) {
                JComboBox f = (JComboBox) c;
                if (f.getSelectedIndex() == -1) {
                    return false;
                } else {
                    return true;
                }
            } else if (c instanceof Container) {
                clearCombox((Container) c);
            }
        }
        return false;
    }

    public static boolean taIsEmpty(Container container) {
        int i = 0;
        int j = 0;
        for (Component c : container.getComponents()) {
            if (c instanceof JTextArea) {
                JTextArea f = (JTextArea) c;
                j++;
                if (!f.getText().trim().isEmpty()) {
                    i++;
                }
            } else if (c instanceof Container) {
                taIsEmpty((Container) c);
            }
        }
        return i == j;
    }

    public static boolean checkAll(Container container) {
        return txtIsEmpty(container) && taIsEmpty(container);
    }

    public static void setVisible(Container container, boolean b) {
        int i = 0;
        int j = 0;
        for (Component c : container.getComponents()) {
            if (c instanceof JButton) {
                JButton f = (JButton) c;
                f.setVisible(b);
            } else if (c instanceof Container) {
                setVisible((Container) c, b);
            }
        }
    }

    public static void setVisibleLB(Container container, boolean b) {
        for (Component c : container.getComponents()) {
            if (c instanceof JLabel) {
                JLabel f = (JLabel) c;
                f.setVisible(b);
            } else if (c instanceof Container) {
                setVisibleLB((Container) c, b);
            }
        }
    }

    public static void setVisible(Container container, String name) {
        for (Component c : container.getComponents()) {
            if (c instanceof JButton) {
                JButton f = (JButton) c;
                if (f.getActionCommand().compareToIgnoreCase(name) >= 0) {
                    f.setVisible(true);
                } else {
                    f.setVisible(false);
                }
            } else if (c instanceof Container) {
                setVisible((Container) c, name);
            }
        }
    }

    public static void setVisibleLB(Container container, String name) {
        for (Component c : container.getComponents()) {
            if (c instanceof JLabel) {
                JLabel f = (JLabel) c;
                if (f.getText().compareToIgnoreCase(name) >= 0) {
                    f.setVisible(true);
                } else {
                    f.setVisible(false);
                }
            } else if (c instanceof Container) {
                setVisibleLB(container, name);
            }
        }
    }
}
