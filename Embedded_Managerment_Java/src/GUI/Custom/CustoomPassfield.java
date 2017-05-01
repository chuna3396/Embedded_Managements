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
import javax.swing.JPasswordField;
import javax.swing.Timer;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.RoundedBalloonStyle;

/**
 *
 * @author chuna
 */
public class CustoomPassfield extends JPasswordField implements FocusListener, KeyListener, MouseListener {

    private String str;
    BalloonTip Balonik;
    BalloonTip tip;
    private String regexPass = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,25}$";
    private int h = 0;
    private Timer t;

    public CustoomPassfield(String str) {
        this.str = str;
        setText(str);
        setForeground(new Color(153, 153, 153));
        setEchoChar((char) 0);

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

    private void waiting() {
        t = new Timer(2000, new ActionListener() {
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

    @Override
    public void focusGained(FocusEvent e) {
        tip.setVisible(false);
        if (getText().trim().isEmpty() || getText().trim().equals(str)) {
            setCaretPosition(0);
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        if (getText().trim().isEmpty() || getText().equals(str)) {
            tip.setVisible(true);
            setText(str);
            setEchoChar((char) 0);
            setForeground(new Color(153, 153, 153));
            waiting();
        } else if (!getText().matches(regexPass)) {
            waiting();
            tip = new BalloonTip(
                    this,
                    new JLabel("Không hợp lệ"),
                    new RoundedBalloonStyle(5, 5, Color.WHITE, Color.BLACK),
                    BalloonTip.Orientation.RIGHT_BELOW,
                    BalloonTip.AttachLocation.ALIGNED,
                    15,
                    15,
                    false);
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
            setEchoChar('*');
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
