import uwcse.graphics.*;
import java.awt.Color;

/**
 * A smiling face in a graphics window This is the solution of last week's lab.
 * Adapt it to add two methods: public void moveTo(int x, int y) to move the
 * face to (x,y) public void moveBy(int dx, int dy) to move the face by dx and
 * dy
 */

public class SmilingFace {

    // The graphics window
    private GWindow window;

    // Location of the face
    private int x, y;

    // Scale used to draw the face
    private double scale;

    /**
     * Draws a smiling face in a graphics window
     *
     * @param x
     *            the x coordinate of the center of the face
     * @param y
     *            the y coordinate of the center of the face
     * @param scale
     *            the multiplication factor for all default dimensions
     * @param window
     *            the graphics window where to draw
     */
    public SmilingFace(int x, int y, double scale, GWindow window) {
        // Initialize the instance fields
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.window = window;

        // Draw the face in the graphics window
        this.drawFace();
    }

    /**
     * Draw a face in the graphics window
     */
    private void drawFace() {
        // The face (a circle)
        int faceRadius = (int) (50 * this.scale);
        Oval head = new Oval(this.x - faceRadius, this.y - faceRadius, 2 * faceRadius, 2 * faceRadius, Color.yellow,
                true);
        this.window.add(head);

        // The mouth
        this.drawMouth(this.x, this.y + 9 * faceRadius / 10);

        // The eyes
        // left
        this.drawEye(this.x - faceRadius / 2, this.y);
        // right
        this.drawEye(this.x + faceRadius / 2, this.y);

        // The nose
        this.drawNose(this.x, this.y);

        // Show the face
        this.window.doRepaint();
    }

    /**
     * Draws an eye
     *
     * @param eyex
     *            the x coordinate of the center of the eye
     * @param eyey
     *            the y coordinate of the center of the eye
     */
    private void drawEye(int eyex, int eyey) {
        // A black circle in a white oval
        int eyeHalfWidth = (int) (15 * this.scale);
        int eyeHalfHeight = (int) (8 * this.scale);
        Oval eye = new Oval(eyex - eyeHalfWidth, eyey - eyeHalfHeight, 2 * eyeHalfWidth, 2 * eyeHalfHeight, Color.white,
                true);
        this.window.add(eye);
        int pupilRadius = eyeHalfHeight;
        Oval pupil = new Oval(eyex - pupilRadius, eyey - pupilRadius, 2 * pupilRadius, 2 * pupilRadius, Color.black,
                true);
        this.window.add(pupil);
    }

    /**
     * Draws a nose
     *
     * @param nosex
     *            the x coordinate of the top point of the nose
     * @param nosey
     *            the y coordinate of the top point of the nose
     */
    private void drawNose(int nosex, int nosey) {
        // A nose is a triangle
        int noseHeight = (int) (20 * this.scale);
        int noseWidth = (int) (20 * this.scale);
        Triangle nose = new Triangle(nosex, nosey, nosex + noseWidth / 2, nosey + noseHeight, nosex - noseWidth / 2,
                nosey + noseHeight, Color.black, true);
        this.window.add(nose);
    }

    /**
     * Draws a mouth
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
        int mouthRadius = (int) (30 * this.scale);
        int mouthThickness = (int) (6 * this.scale);
        Oval blackCircle = new Oval(mouthx - mouthRadius, mouthy - 2 * mouthRadius, 2 * mouthRadius, 2 * mouthRadius,
                Color.black, true);
        this.window.add(blackCircle);
        Oval yellowCircle = new Oval(mouthx - mouthRadius, mouthy - 2 * mouthRadius - mouthThickness, 2 * mouthRadius,
                2 * mouthRadius, Color.yellow, true);
        this.window.add(yellowCircle);
    }

    public void moveBy(int dx, int dy) {

    }

    public void flipColor() {

    }



}