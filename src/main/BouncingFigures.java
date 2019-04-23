/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import gui.MyPanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author jose0
 */
public class BouncingFigures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Rebote en Swing");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(new MyPanel()); 
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        while(true) {
            try {
                jFrame.repaint();
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(BouncingFigures.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
