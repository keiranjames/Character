/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author keiran
 */
public class Brian {

    Brian() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(Color.red);
        graphics.drawRect(x, y, width, height);
        
        //body
        
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 11 / 100), y + (height * 1 / 100) , width * 77 / 100, height * 92 / 100);
        
        graphics.setColor(Color.yellow);
        graphics.fillOval(x + (width * 12 / 100), y + (height * 2 / 100) , width * 75 / 100, height * 90 / 100);
        
        //eyes
        
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 4 / 10), y + (height * 12 / 100), width * 6 / 100, height * 12 / 100);
        graphics.fillOval(x + (width * 5 / 10), y + (height * 12 / 100), width * 6 / 100, height * 12 / 100);
        
        //smile
        
        graphics.drawArc(x + (width * 33 / 100), y + (height * 15 / 100), width * 3 / 10, height * 37 / 100, 180, 180);
        graphics.drawArc(x + (width * 33 / 100), y + (height * 153 / 1000), width * 3 / 10, height * 37 / 100, 180, 180);
        graphics.drawArc(x + (width * 33 / 100), y + (height * 147 / 1000), width * 3 / 10, height * 37 / 100, 180, 180);
        
        //cheek smile
        
        graphics.drawArc(x + (width * 305 / 1000), y + (height * 28 / 100), width * 5 / 100, height * 5 / 100, 200, 140);
        graphics.drawArc(x + (width * 305 / 1000), y + (height * 279 / 1000), width * 5 / 100, height * 5 / 100, 200, 140);
        
        //cheek smile
        
        graphics.drawArc(x + (width * 604 / 1000), y + (height * 28 / 100), width * 5 / 100, height * 5 / 100, 200, 140);
        graphics.drawArc(x + (width * 604 / 1000), y + (height * 279 / 1000), width * 5 / 100, height * 5 / 100, 200, 140);
        
        //left feet
        graphics.setColor(Color.black);
        graphics.fillRoundRect(x + (width * 196 / 1000) , y + (height * 9966 /10000), width * 212 / 1000, height * 112 / 1000, 20, 250);
        
        graphics.setColor(Color.yellow);
        graphics.fillRoundRect(x + (width * 20 / 100) , y + (height * 10 /10), width * 2 / 10, height * 97 / 1000, 20, 250);
        
         
        
    }
    
    public Brian(int x, int y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
    
    private int x;
    private int y;
    private int height;
    private int width;

//    void setX(int x) {
//    this.x = x;   
//            }
//
//    void setY(int y) {
//        this.y = y;
//    }
    
}
