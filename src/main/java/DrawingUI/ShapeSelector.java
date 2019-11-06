package DrawingUI;

import Shapes.Shape;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    JRadioButton bCirc;
    JRadioButton bRect;
    JRadioButton bSquare;

    public ShapeSelector() {
        bCirc = new JRadioButton();
        bRect = new JRadioButton();
        bSquare = new JRadioButton();

        ButtonGroup bg = new ButtonGroup();

        bg.add(bCirc);
        bg.add(bRect);
        bg.add(bSquare);

        add(bCirc);
        add(bRect);
        add(bSquare);

        bCirc.setSelected(true);

    }

    public String getCurrentShape() {
        if(bCirc.isSelected()){
            return "Circle";
        } else if(bSquare.isSelected()){
            return "Square";
        } else {
            return "Rectangle";
        }
    }
}
