package Shapes;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Frame f;
    private Circle circle;
    private Rect rectangle;
    private Square square;

    public Drawing() {

        setupShapes();
        setupFrame();
        setupCanvas();
        f.addWindowListener(new WindowAdapter() {    // Closes the frame if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setVisible(true);
    }

    private void setupShapes() {
        Point p = new Point(200, 200);
        Color col = new Color(0x992266);
        Circle c = new Circle(p, col, 50);

        this.circle = c;

        Point p1 = new Point(100, 100);
        Color col1 = new Color(0x992266);
        Rect r = new Rect(p1, col, 20,40);

        this.rectangle = r;

        Point p2 = new Point(50, 50);
        Color col2 = new Color(0x992266);
        Square sq = new Square(p2,col2,50);

        this.square = sq;
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
        circle.draw(g);
        rectangle.draw(g);
        square.draw(g);
    }
}
