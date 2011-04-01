package bargraph;

/**
 *
 * @author Pradyumna
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Bar1 extends JComponent{
    private int pointX;
    private int pointY;
    private int gWidth;
    private int gHeight;



        public  Bar1(int x, int y, int width, int height) {
            pointX = x;
            pointY = y;
            gWidth = width;
            gHeight = height;

        }
        @Override
        public void paint(Graphics g) {
            g.drawRect(pointX, pointY, gWidth, gHeight);
        }

}
