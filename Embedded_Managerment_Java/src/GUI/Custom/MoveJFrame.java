/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Custom;

import javax.swing.JFrame;

/**
 *
 * @author chuna
 */
public class MoveJFrame {

    private boolean flag = false;
    private int x, y;

    public MoveJFrame() {

    }

    public void formMousePressed(java.awt.event.MouseEvent evt) {
        flag = true;
        x = evt.getX();
        y = evt.getY();
    }

    public void formMouseReleased(java.awt.event.MouseEvent evt) {
        flag = false;
    }

    public void formMouseDragged(java.awt.event.MouseEvent evt, JFrame jFrame) {
        if (flag) {
            jFrame.setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
        }
    }

}
