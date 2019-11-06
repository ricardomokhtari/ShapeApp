package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class RectDimSelector extends JPanel {
    private JSlider w;
    private JSlider h;

    public RectDimSelector(){
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        JLabel label = new JLabel("Rectangle Width & Height");
        w = new JSlider(1,100);
        h = new JSlider(1,100);
        controls.add(label);
        controls.add(w);
        controls.add(h);
        add(controls);
    }

    public int getCurrentHeight(){
        return h.getValue();
    }

    public int getCurrentWidth(){
        return w.getValue();
    }
}
