package DrawingUI;

import javax.swing.*;
import java.awt.*;

public class DrawingUIController {
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();

    public DrawingUIController() {
        controlsPanel.setLayout(new GridLayout(3,1));
        mainPanel.setLayout(new GridLayout(2,1));
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }


}
