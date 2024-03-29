package Shapes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private ShapeDB shapeDB = new ShapeDB();
    private Frame f;

    public Drawing() {
        setupFrame();
        setupCanvas();
        f.addWindowListener(new WindowAdapter() {    // Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setVisible(true);
    }

    public void addSquare(Point pos, Color col, int side){
        shapeDB.addSquare(pos, col, side);
    }

    public void addCircle(Point pos, Color col, int radius){
        shapeDB.addCircle(pos, col, radius);
    }

    public void addRect(Point pos, Color col, int w, int h){
        shapeDB.addRect(pos,col,w,h);
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400);
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
    }

    public void paint(Graphics g) {
        shapeDB.drawShapes(g);
    }
}
