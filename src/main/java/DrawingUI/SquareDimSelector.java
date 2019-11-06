package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class SquareDimSelector extends JPanel {
    private JSlider side;

    public SquareDimSelector(){
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label = new JLabel("Square Side");
        side = new JSlider(1,100);
        controls.add(label);
        controls.add(side);
        add(controls);
    }

    public int getCurrentSide(){
        return side.getValue();
    }
}
