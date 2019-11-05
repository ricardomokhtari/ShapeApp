package Shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public static double getRandomIntegerBetweenRange(double min, double max) {
        return (int)(Math.random()*((max-min)+1))+min;
    }

    public void addSquare(){
        Point p = new Point((int)getRandomIntegerBetweenRange(0,500), (int)getRandomIntegerBetweenRange(0,600));
        Color col = new Color(0x992266);
        Square sq = new Square(p,col, (int)getRandomIntegerBetweenRange(0,50));
        shapes.add(sq);
    }

    public void addCircle(){
        Point p = new Point((int)getRandomIntegerBetweenRange(0,500), (int)getRandomIntegerBetweenRange(0,600));
        Color col = new Color(0x992266);
        Circle c = new Circle(p,col,(int)getRandomIntegerBetweenRange(0,50));
        shapes.add(c);
    }

    public void addRect(){
        Point p = new Point((int)getRandomIntegerBetweenRange(0,500), (int)getRandomIntegerBetweenRange(0,600));
        Color col = new Color(0x992266);
        Rect r = new Rect(p,col, (int)getRandomIntegerBetweenRange(0,50), (int)getRandomIntegerBetweenRange(0,50));
        shapes.add(r);
    }

    public void drawShapes(){
        for(Shape s : shapes){
            s.draw(s);
        }
    }
}
