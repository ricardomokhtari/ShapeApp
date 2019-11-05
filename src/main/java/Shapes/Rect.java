package Shapes;

import java.awt.*;

public class Rect extends Shape {
    private int w;
    private int h;

    public Rect(Point pos, Color col, int w, int h){
        super(pos, col); // The constructor
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x, pos.y, w, h);
    }
}