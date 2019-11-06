package DrawingUI;

import Shapes.Shape;

import javax.swing.*;

public class ShapeSelector extends JPanel {
    JRadioButton bCirc;
    JRadioButton bRect;
    JRadioButton bSquare;

    public ShapeSelector() {

        // make buttons
        bCirc = new JRadioButton("Circle");
        bRect = new JRadioButton("Rectangle");
        bSquare = new JRadioButton("Square");


        ButtonGroup bg = new ButtonGroup();

        // add buttons to a button group so only one can be selected
        // at a time
        bg.add(bCirc);
        bg.add(bRect);
        bg.add(bSquare);

        // add the buttons to the shape selector (JFrame)
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
