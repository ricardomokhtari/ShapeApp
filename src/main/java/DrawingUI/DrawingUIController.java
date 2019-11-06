package DrawingUI;
import Shapes.Circle;
import Shapes.Drawing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {

    // setting up the control and main panels
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();

    public DrawingUIController() {
        // setting the layout of the control and main panels
        controlsPanel.setLayout(new GridLayout(3, 1));
        mainPanel.setLayout(new GridLayout(2, 1));

        // creating everything that will be added to the panels
        Drawing d = new Drawing();
        ShapeSelector sSel = new ShapeSelector();
        ColourSelector cSel = new ColourSelector();
        CircleDimSelector dSel = new CircleDimSelector();
        SquareDimSelector sqSel = new SquareDimSelector();
        RectDimSelector rectSel = new RectDimSelector();

        // handle mouse click events
        d.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            // what happens when mouse is clicked
            @Override
            public void mousePressed(MouseEvent mouseEvent) {

                // gets current shape
                String val = sSel.getCurrentShape();

                // gets colour
                Color col = cSel.getCurrentColour();

                // gets circle radius
                int radius = dSel.getCurrentRadius();

                // gets square side length
                int side = sqSel.getCurrentSide();

                // gets rectangle dimensions
                int w = rectSel.getCurrentWidth();
                int h = rectSel.getCurrentHeight();

                // draw the correct shape based on the selection with the correct dimensions & colour
                if(val == "Circle"){
                    d.addCircle(new Point(mouseEvent.getPoint()), col, radius);
                    d.repaint();
                } else if(val == "Square"){
                    d.addSquare(new Point(mouseEvent.getPoint()), col, side);
                    d.repaint();
                } else {
                    d.addRect(new Point(mouseEvent.getPoint()), col, w, h);
                    d.repaint();
                }

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        // add control panel to main panel
        mainPanel.add(controlsPanel);

        // add all controls to controls panel
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(dSel);
        controlsPanel.add(sqSel);
        controlsPanel.add(rectSel);

        // add the drawing to the main panel
        mainPanel.add(d);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
