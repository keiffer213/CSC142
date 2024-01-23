//import uwcse.graphics.*;
import java.awt.Color;

import uwcse.graphics.Triangle;
import uwcse.graphics.Rectangle;
import uwcse.graphics.GWindow;
import uwcse.graphics.Oval;
import uwcse.graphics.Polygon;
/**
 * A smiling face in a graphics window
 */

public class SmilingFace {

    // The graphics window
    private GWindow window;

    // Location of the face
    private int x, y;

    // Scale used to draw the face
    private double scale;

    //good practice to define constants throughout the program
    // use keyword "final" for constants,"static" is feature only 1 copy inside class
    private static final int HEAD_RADIUS = 50;

    /**
     * Draw a smiling face in a graphics window
     *
     * @param x
     *            the x coordinate of the center of the face
     * @param y
     *            the y coordinate of the center of the face
     * @param scale
     *            the multiplication factor for all default sizes
     * @param window
     *            the graphics window where to draw
     */
    public SmilingFace(int x, int y, double scale, GWindow window) {
        // Initialize the instance fields
        // instance field x = value of parameter x
        this.x = x;
        this.y =y;
        this.window = window;
        this.scale = scale;

        //not good idea to write full code to draw face in constructor
        //use private methods to organize code
        // Draw the face in the window
        drawFace();

    }

    /**
     * Draw the face in the graphics window
     */
    private void drawFace() {
        // The head (a circle: default radius = 50)
//        int r = (int)(50 * scale);
        int r = (int)(HEAD_RADIUS * scale);
        //oval starts at the top-left corner the a box "surrounding" the circle
        //need to move the point up and left so that center of circle is in given x, y coordinate
        Oval head = new Oval(x-r, y-r, 2*r, 2*r, Color.yellow, true);
        window.add(head);
        // The mouth (use drawMouth)
        drawMouth(x, (int)(y+0.9*r));
        // The eyes (use drawEye)
        // left
        drawEye(x-r/2, y);
        // right
        drawEye(x+r/2, y);
        // The nose (use drawNose)
        this.drawNose(x, y);
        // Show the face
        this.window.doRepaint();
    }

    /**
     * Draw an eye
     *
     * @param eyex
     *            the x coordinate of the center of the eye
     * @param eyey
     *            the y coordinate of the center of the eye
     */
    private void drawEye(int eyex, int eyey) {
        // A black circle in a white oval
        int eyeHalfWidth = (int)(15*scale);
        int eyeHalfHeight = (int)(8*scale);
        Oval eye = new Oval(eyex - eyeHalfWidth, eyey - eyeHalfHeight, 2*eyeHalfWidth, 2*eyeHalfHeight, Color.white, true);
        int pupilRadius = eyeHalfHeight;
        Oval pupil = new Oval(eyex - pupilRadius, eyey - pupilRadius, 2*pupilRadius, 2*pupilRadius, Color.black, true);

        window.add(eye);
        window.add(pupil);
    }

    /**
     * Draw a nose
     *
     * @param nosex
     *            the x coordinate of the top point of the nose
     * @param nosey
     *            the y coordinate of the top point of the nose
     */
    private void drawNose(int nosex, int nosey) {
        // A nose is a triangle
        int noseHeight = (int)(20*scale);
        int noseHalfWidth = (int)(10*scale);

        Triangle nose = new Triangle(nosex, nosey, nosex+noseHalfWidth, nosey+noseHeight
        , nosex-noseHalfWidth, nosey+noseHeight, Color.BLACK, true);
        window.add(nose);
    }

    /**
     * Draw a mouth
     *
     * @param mouthx
     *            the x coordinate of the middle bottom point of the mouth
     * @param mouthy
     *            the y coordinate of the middle bottom point of the mouth
     */
    private void drawMouth(int mouthx, int mouthy) {
        // Draw two circles (one black and one yellow)
        // The yellow circle is on top of the black circle and slightly shifted
        // up
        int r = (int)(30 * scale);
        Oval blackCircle = new Oval(mouthx-r, mouthy-2*r, 2*r, 2*r, Color.black, true);
        window.add(blackCircle);
        Oval yellowCircle = new Oval(mouthx-r, mouthy-2*r, 2*r, 2*r, Color.yellow, true);
        yellowCircle.moveBy(0, (int)(-.2*r));
        window.add(yellowCircle);

    }
}