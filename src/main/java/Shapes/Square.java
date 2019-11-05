package Shapes;

import java.awt.*;

public class Square extends Rect {
    private int side;

    public Square(Point pos, Color col, int side){
        super(pos, col,side,side);
    }

    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x, pos.y, side, side);
    }
}
