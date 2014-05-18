/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import gui.GamePanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alexey
 */
public class Car extends Thread{

    private int x;
    private int y;
    private int length = 100;
    public GamePanel panel;

//    public Car() {
//        this.x = panel.getWidth()/2-length/2;
//        this.y = panel.getHeight()-10;
//    }
    public Car(GamePanel panel) {
        this.panel = panel;
//        this.x = x - length / 2;
//        this.y = panel;
        System.out.println(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
    public void move(int x){
        this.x=this.x+x;
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
        x= panel.getWidth()/2-length/2;
        y= panel.getHeight()-10;
        g.setColor(Color.BLACK);
        g.fillRect(x, y, length, 15);

//        g.fillOval(x, y, 15, 15);
    }
}
