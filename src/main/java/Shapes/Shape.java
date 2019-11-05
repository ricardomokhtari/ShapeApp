package Shapes;

import Interfaces.Drawable;

import java.awt.*;

abstract public class Shape implements Drawable {
    protected Point pos;
    protected Color col;

    public Shape(Point pos, Color col) {
        this.pos = pos;
        this.col = col;
    }

    public abstract void draw(Graphics g);
}
