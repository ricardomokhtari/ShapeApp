package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    public ArrayList<Shape> shapes = new ArrayList<>();

    public static double getRandomIntegerBetweenRange(double min, double max) {
        return (int)(Math.random()*((max-min)+1))+min;
    }

    public void addSquare(Point pos, Color col, int side){
        Square sq = new Square(pos,col, side);
        shapes.add(sq);
    }

    public void addCircle(Point pos, Color col, int radius){
        Circle c = new Circle(pos,col,radius);
        shapes.add(c);
    }

    public void addRect(Point pos, Color col, int w, int h){
        Rect r = new Rect(pos,col, w,h);
        shapes.add(r);
    }

    public void drawShapes(){
        for(Shape s : shapes){

        }
    }
}
