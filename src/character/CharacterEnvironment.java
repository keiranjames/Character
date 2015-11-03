/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author keiran
 */
class CharacterEnvironment extends Environment {
    
//    Brian myBrian;

    private Brian brianSmall;
    private Brian brianBig;
    
    public CharacterEnvironment() {
//        brianBig = new Brian(100, 150, 200, 100);
        brianSmall = new Brian(350, 150, 300, 330);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
//        if (brianSmall != null) {
//            brianSmall.setX(e.getX());
//            brianSmall.setY(e.getY());
//        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        
       
        if (brianBig != null){
            brianBig.draw(graphics);
        }
        
        if (brianSmall != null){
            brianSmall.draw(graphics);
        }
    }
    
}
