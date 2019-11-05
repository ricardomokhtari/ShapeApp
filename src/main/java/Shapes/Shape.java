package Shapes;

import java.awt.*;

public abstract class Shape {
    protected Point pos;
    protected Color col;

    public Shape(Point pos, Color col) {
        this.pos = pos;
        this.col = col;
    }

    public abstract void draw(Graphics g);
}
