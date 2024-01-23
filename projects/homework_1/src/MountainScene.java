import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>
 * A MountainScene displays snow men, trees (with ornaments), a cable car and a
 * fourth element of your choice in a graphics window
 * </p>
 *
 * @author Keiffer Tan 202974671
 */

public class MountainScene {

    /** The graphics window that displays the picture */
    private GWindow window;

    /**
     * Create an image of a mountain scene
     */
    public MountainScene() {

        // The graphics window
        // The window is by default 500 wide and 400 high
        this.window = new GWindow("Mountain scene");
        this.window.setExitOnClose(); // so that a click on the close box of the
        // window terminates the application

        // Background (cyan here)
        Rectangle bgnd = new Rectangle(0, 0, window.getWindowWidth(), window
                .getWindowHeight(), Color.CYAN, true);
        this.window.add(bgnd);

        // Create the scene elements
        // e.g. a tree in the lower left area 1.5 times the normal size
        new Tree(100, 300, 1.5, this.window);
        new Tree(300, 100, 0.8, this.window);
        new Tree(420, 50, 0.4, this.window);
        new Tree(40, 70, 1, this.window);
        new Tree(350, 350, 0.7, this.window);
        new Tree(20, 310, 0.6, this.window);


        new SnowMan(120, 100, 0.8, this.window);
        new SnowMan(450, 300, 0.5, this.window);
        new SnowMan(220, 350, 1.5, this.window);
        new SnowMan(370, 120, 1, this.window);
        new SnowMan(470, 70, 0.6, this.window);

        new CableCar(350, 180, 1, this.window);
        new CableCar(200, 10, 0.4, this.window);

        new Gift(20, 130, 1, Color.BLUE, this.window);
        new Gift(270, 150, 0.8, Color.RED, this.window);
        new Gift(330, 150, 0.5, Color.GREEN, this.window);
        new Gift(440, 90, 0.6, Color.MAGENTA, this.window);
        new Gift(50, 380, 1.3, Color.PINK, this.window);
        new Gift(390, 390, 0.6, Color.YELLOW, this.window);

    }

    /**
     * Entry point of the program
     */
    public static void main(String[] args) {
        new MountainScene();
    }

}