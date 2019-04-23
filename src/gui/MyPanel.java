/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Ball;
import com.sun.prism.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author jose0
 */
public class MyPanel extends JPanel{
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;

    public MyPanel() {
        this.ball1 = new Ball(Color.ORANGE, 100, 100);
        this.ball2 = new Ball(Color.GREEN, 20, 100);
        this.ball3 = new Ball(Color.MAGENTA, 70, 50);
    }

    @Override
    public void paint(java.awt.Graphics g) {
        super.paint(g);
        this.ball1.paint(g );
        this.ball1.move();
        this.ball1.bounce(getWidth(), getHeight());        
        this.ball2.paint(g );
        this.ball2.move();
        this.ball2.bounce(getWidth(), getHeight());
        this.ball3.paint(g );
        this.ball3.move();
        this.ball3.bounce(getWidth(), getHeight());
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(350, 300 ); 
    }
    
     
    
    
}
