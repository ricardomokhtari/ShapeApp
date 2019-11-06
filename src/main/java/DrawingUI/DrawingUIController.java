package DrawingUI;

import Shapes.Circle;
import Shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();

    public DrawingUIController() {
        controlsPanel.setLayout(new GridLayout(3, 1));
        mainPanel.setLayout(new GridLayout(2, 1));

        Drawing d = new Drawing();
        ShapeSelector sSel = new ShapeSelector();
        ColourSelector cSel = new ColourSelector();
        CircleDimSelector dSel = new CircleDimSelector();
        SquareDimSelector sqSel = new SquareDimSelector();
        RectDimSelector rectSel = new RectDimSelector();

        d.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

                String val = sSel.getCurrentShape();

                Color col = cSel.getCurrentColour();

                int radius = dSel.getCurrentRadius();

                int side = sqSel.getCurrentSide();

                int w = rectSel.getCurrentWidth();
                int h = rectSel.getCurrentHeight();

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

        mainPanel.add(controlsPanel);

        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(dSel);
        controlsPanel.add(sqSel);
        controlsPanel.add(rectSel);

        mainPanel.add(d);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
