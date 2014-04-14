/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alexey
 */
public class Car extends Thread{
    private int x;
    private final int y;
    private int length = 100;
    GamePanel panel;

//    public Car() {
//        this.x = panel.getWidth()/2-length/2;
//        this.y = panel.getHeight()-10;
//    }

    Car(GamePanel aThis) {
        panel=aThis;
        this.x = panel.getWidth()/2-length/2;
        this.y = panel.getHeight()-10;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void run() {
        
        
    }
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, length, 15);
    }
}