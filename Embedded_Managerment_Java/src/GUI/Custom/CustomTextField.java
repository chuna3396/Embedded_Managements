/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Custom;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;

/**
 *
 * @author chuna
 */
public class CustomTextField extends JTextField
        implements FocusListener, KeyListener, MouseListener {

    private int h = 0;
    private Timer t;
    private String str;
    private BalloonTip tip;

    private void waiting() {
        t = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                h++;
                if (h == 1) {
                    tip.setVisible(false);
                    t.stop();
                }
            }
        });
        t.start();
    }

    public CustomTextField(String str) {
        this.str = str;
        setText(str);
        setForeground(new Color(153, 153, 153));
        tip = new BalloonTip(
                this,
                new JLabel("Không được để trống"),
                new RoundedBalloonStyle(5, 5, Color.WHITE, Color.BLACK),
                BalloonTip.Orientation.RIGHT_BELOW,
                BalloonTip.AttachLocation.ALIGNED,
                15,
                15,
                false);
        tip.setVisible(false);
        addFocusListener(this);
        addMouseListener(this);
        addKeyListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        tip.setVisible(false);
        if (getText().trim().isEmpty() || getText().trim().equals(str)) {
            setCaretPosition(0);
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (getText().trim().equals("") || getText().equals(str)) {
            tip.setVisible(true);
            setForeground(new Color(153, 153, 153));
            waiting();
            setText(str);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (getForeground().equals(new Color(153, 153, 153))) {
            setText("");
            setForeground(new Color(0, 0, 0));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (getText().trim().isEmpty() || getText().trim().equals(str)) {
            e.consume();
            setCaretPosition(0);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
