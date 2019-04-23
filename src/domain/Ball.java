/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author jose0
 */
public class Ball {

    private Color color;
    private int x;
    private int y;
    private int dir;

    private final int   SPEED = 1;

    public Ball(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.dir= 1;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 50, 50);
    }

    public void move() {
        
        switch (dir) {
            case 0:
                y +=   SPEED;
                break;
            case 1:
                y -=   SPEED;
                break;
            case 2:
                x +=   SPEED;
                break;
            case 3:
                x -=   SPEED;
                break;
            case 4:
                x +=   SPEED;
                y +=   SPEED;
                break;
            case 5:
                x -=   SPEED;
                y -=   SPEED;
                break;
            case 6:
                x -=   SPEED;
                y +=   SPEED;
                break;
            case 7:
                x +=   SPEED;
                y -=   SPEED;
                break;
            default:
                break;
        }
       
    }

    public void bounce(int limitX, int limitY) {
        int move = (int)(Math.random() * 500) + 1;
        if(move == 1){
            dir = 1;
        }
        if(move == 2){
           dir = 2; 
        }
        if(move == 3){
           dir = 3; 
        }
        if(move == 4){
           dir = 4; 
        }
        if(move == 5){
           dir = 5; 
        }
        if(move == 6){
           dir = 6; 
        }
        if(move == 7){
           dir = 7; 
        }
        
        
        if(y <= 0) {
            int rd = (int)(Math.random() * 3) + 1;
            dir = rd == 1 ? 6 : rd == 2 ? 0: 4;
        } else if(x <= 0) {
            int rd = (int)(Math.random() * 3) + 1;
            dir = rd == 1 ? 7 : rd == 2 ? 2: 4;
        } else if(x == limitX - 50) {
            int rd = (int)(Math.random() * 3) + 1;
            dir = rd == 1 ? 3 : rd == 2 ? 5: 6;
        } else if(y == limitY -50) {
            int rd = (int)(Math.random() * 3) + 1;
            dir = rd == 1 ? 1 : rd == 2 ? 5: 7;
        }
    }

}
