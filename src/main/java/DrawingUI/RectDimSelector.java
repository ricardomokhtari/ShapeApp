package DrawingUI;

import javax.swing.*;

public class RectDimSelector extends JPanel {
    private JSlider w;
    private JSlider h;

    public RectDimSelector(){
        w = new JSlider(1,100);
        h = new JSlider(1,100);
        add(w);
        add(h);
    }

    public int getCurrentHeight(){
        return h.getValue();
    }

    public int getCurrentWidth(){
        return w.getValue();
    }
}
