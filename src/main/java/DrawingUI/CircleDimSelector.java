package DrawingUI;

import javax.swing.*;

public class CircleDimSelector extends JPanel {
    private JSlider radius;

    public CircleDimSelector(){
        radius = new JSlider(1,100);
        add(radius);
    }

    public int getCurrentRadius(){
        return radius.getValue();
    }
}
