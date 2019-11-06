package DrawingUI;

import Shapes.Circle;
import Shapes.Drawing;

import javax.swing.*;
import java.awt.*;

public class DrawingUIController {
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();

    public DrawingUIController() {
        controlsPanel.setLayout(new GridLayout(3, 1));
        mainPanel.setLayout(new GridLayout(2, 1));

        Drawing d = new Drawing();

        d.addCircle(new Point(20,20), new Color(0x992266), 50);
        d.addRect(new Point(50,50), new Color(0x992266), 50, 100);
        d.addSquare(new Point(70,70), new Color(0x992266), 50);
        mainPanel.add(controlsPanel);
        mainPanel.add(d);
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}
