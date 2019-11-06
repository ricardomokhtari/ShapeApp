package Shapes;

import java.awt.*;

public class Rect extends Shape {
    protected int w;
    protected int h;

    public Rect(Point pos, Color col, int w, int h){
        super(pos, col); // The constructor
        this.w = w;
        this.h = h;
    }

    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x, pos.y, w, h);
    }
}
