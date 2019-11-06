package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class CircleDimSelector extends JPanel {
    private JSlider radius;

    public CircleDimSelector() {
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label = new JLabel(" Circle Radius");
        radius = new JSlider(1,100);
        controls.add(label);
        controls.add(radius);
        add(controls);
    }

    public int getCurrentRadius(){
        return radius.getValue();
    }
}
