import DrawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.*;

public class Main {
    static GraphicsConfiguration gc; // Class field containing config info
    public static void main(String[] args) {
        DrawingUIController dui = new DrawingUIController();
        JFrame frame= new JFrame(gc); // Create a new JFrame
        frame.setSize(500,600);
        frame.getContentPane().add(dui.getMainPanel());
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
