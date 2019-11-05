package Shapes;

import java.awt.*;

/**
 * The shapes.Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */

public class Circle extends Shape {
    private int rad; // Fields

    public Circle(Point pos, Color col, int rad){
        super(pos, col); // The constructor
        this.rad = rad;
    }

    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(this.col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }
}