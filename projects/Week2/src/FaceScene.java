import java.awt.Color;

// access the graphics utilities in the uw library
import uwcse.graphics.GWindow;
import uwcse.graphics.Rectangle;

// could also use import uwcse.graphics.*; but not as informative

/**
 * <p>
 * A FaceScene displays smiling faces in a graphics window
 * </p>
 *
 * @author Your name here
 */

public class FaceScene {

    /**
     * Creates a picture
     */
    public FaceScene() {

        // The graphics window
        // Create a window with width = 800 and height = 600
        GWindow w = new GWindow(800, 600); //x, y
//        Rectangle bgd = new Rectangle(0, 0, 800, 600, Color.cyan, true);
        Rectangle bgd = new Rectangle(0, 0, w.getWindowWidth(), w.getWindowHeight(), Color.cyan, true);
        // Background (e.g. cyan)
        w.add(bgd);

        // Exit when closing the window
        w.setExitOnClose();

        // Create the scene elements
        // e.g. a face in the lower area 3.2 times the default size
        /*SmilingFace s1 = */

        new SmilingFace(300, 300, 1.5, w);
        new SmilingFace(250, 50,  1, w);
        new SmilingFace(200, 200, 0.5, w);
        new SmilingFace(50, 200, 0.25, w);
    }

    /**
     * Starts the application
     */
    public static void main(String[] args) {
        new FaceScene();
    }
}