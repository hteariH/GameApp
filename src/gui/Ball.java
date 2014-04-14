package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eugeny
 */
public class Ball extends Thread {

    private int x;
    private int y;
    private int diameter = 10;
    GamePanel panel;
    private int vx = 1;
    private int vy = 1;

    public Ball(int x, int y, GamePanel panel) {
        this.x = x;
        this.y = y;
        this.panel = panel;
    }

    @Override
    public void run() {
        while (true) {
            x += vx;
            y += vy;
            if (x > panel.getWidth() - diameter) {
                x -= 2 * vx;
                vx = -vx;
            }
            //there is not about this game
//            if (y > panel.getHeight() - diameter) {
//                y -= 2 * vy;
//                vy = -vy;
//            }

            if (x < 0) {
                x -= 2 * vx;
                vx = -vx;
            }
            if (y < 0) {
                y -= 2 * vy;
                vy = -vy;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, diameter, diameter);
    }

}
