package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    public ArrayList<Shape> shapes = new ArrayList<>();

    // method has package-private access
    void addSquare(Point pos, Color col, int side){
        shapes.add(new Square(pos,col, side));
    }

    void addCircle(Point pos, Color col, int radius){
        shapes.add(new Circle(pos,col,radius));
    }

    void addRect(Point pos, Color col, int w, int h){
        shapes.add(new Rect(pos,col, w,h));
    }

    void drawShapes(Graphics g){
        for(Shape s : shapes){
            s.draw(g);
        }
    }
}
