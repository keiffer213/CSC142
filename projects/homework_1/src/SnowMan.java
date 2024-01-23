import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>Create a snow man in a graphics window</p>
 * @author Keiffer Tan 202974671
 */

public class SnowMan {

    // Your instance fields go here
    private GWindow window;
    //location of snowman
    private int x, y;
    private int smRad = 50; //set radius of snowman ball to 50
    private double scale; //scale to draw snowman

    /**
     * Creates a snow man in at location (x,y) in the GWindow window.
     * @param x the x coordinate of the center of the head of the snow man
     * @param y the y coordinate of the center of the head of the snow man
     * @param scale the factor that multiplies all default dimensions for this snow man
     * (e.g. if the default head radius is 20, the head radius of this snow man is
     * scale * 20)
     * @param window the graphics window this snow man belongs to
     */
    public SnowMan(int x, int y, double scale, GWindow window)
    {
        // initialize the instance fields
        this.window = window;
        this.scale = scale;
        this.x = x;
        this.y = y;

        // Put the details of the drawing in a private method
        this.draw();
    }

    /** Draw in the graphics window a snow man at location (x,y) */
    private void draw()
    {
        //reduce the amount I type (int)(smRad*this.scale)
        int thisSmDia = (int)(smRad*this.scale);
        int thisSmRad = thisSmDia / 2;

        //draw the snowballs that build the snowman
        Oval snowBall1 = new Oval(this.x-thisSmRad, this.y-thisSmRad,
                thisSmDia, thisSmDia, Color.WHITE, true);
        Oval snowBall2 = new Oval(this.x-(int)(thisSmRad*0.8), this.y-thisSmRad,
                (int)(thisSmDia*0.8),  (int)(thisSmDia*0.8), Color.WHITE, true);
        Oval snowBall3 = new Oval(this.x-(int)(thisSmRad*0.6), this.y-thisSmRad,
                (int)(thisSmDia*0.6),  (int)(thisSmDia*0.6), Color.WHITE, true);

        snowBall2.moveBy(0, -thisSmDia+(int)(thisSmDia*0.5));
        snowBall3.moveBy(0, -thisSmDia+(int)(thisSmDia*0.1));

        //create variables of button size for scale
        int buttonDia = (int)(4*this.scale);
        int buttonRad = (int)(2*this.scale);

        //create buttons
        Oval button1 = new Oval(this.x-buttonRad, this.y-buttonRad,
                buttonDia, buttonDia, Color.BLACK, true);
        Oval button2 = new Oval(this.x-buttonRad, this.y-buttonRad,
                buttonDia, buttonDia, Color.BLACK, true);
        Oval button3 = new Oval(this.x-buttonRad, this.y-buttonRad,
                buttonDia, buttonDia, Color.BLACK, true);

        //move other buttons up
        button2.moveBy(0, -(int)(15*this.scale));
        button3.moveBy(0, -(int)(30*this.scale));

        //create face
        Oval eye1 = new Oval(this.x-buttonRad, this.y-buttonRad,
                buttonDia, buttonDia, Color.BLACK, true);
        Oval eye2 = new Oval(this.x-buttonRad, this.y-buttonRad,
                buttonDia, buttonDia, Color.BLACK, true);

        eye1.moveBy(-(int)(thisSmRad/2.8),-(int)(60*this.scale));
        eye2.moveBy((int)(thisSmRad/2.8),-(int)(60*this.scale));

        //for mouth
        Rectangle mouth = new Rectangle(this.x, this.y, thisSmRad/2, buttonRad,
                Color.BLACK, true);
        mouth.moveBy(-thisSmRad/4,-(int)(50*this.scale));

        //for nose
        Triangle nose = new Triangle(
                this.x, this.y,
                this.x+(int)(20*this.scale), this.y+(int)(2*this.scale),
                this.x, this.y+(int)(4*this.scale),
                Color.ORANGE, true);
        nose.moveBy(0, -(int)(58*this.scale));

        //variables, use snowball3 dia for hat brim width

        //create hats
        Rectangle hatBrim = new Rectangle(this.x, this.y,
                (int)(thisSmDia*0.7), (int)(5*this.scale), Color.YELLOW, true);
        Triangle hatTop = new Triangle(
                this.x-(int)(thisSmDia*0.15), this.y,
                this.x+(int)(thisSmDia*0.15), this.y-(int)(30*this.scale),
                this.x+(int)(thisSmDia*0.3), this.y,
                Color.RED, true);

        hatBrim.moveBy(-(int)(thisSmDia*0.35), -(int)(70*this.scale));
        hatTop.moveBy(-(int)(thisSmDia*0.1), -(int)(70*this.scale));

        //create hands
        Line hand1 = new Line(this.x, this.y,
                this.x+(int)(25*this.scale), this.y-(int)(10*this.scale));
        Line hand2 = new Line(this.x, this.y,
                this.x-(int)(25*this.scale), this.y-(int)(10*this.scale));

        hand2.moveBy(-(int)(thisSmRad/2.8),-(int)(35*this.scale));
        hand1.moveBy((int)(thisSmRad/2.8),-(int)(35*this.scale));

        Polygon star = new Polygon(Color.YELLOW, true);
        star.addPoint(this.x, this.y);
        star.addPoint(this.x+(int)(2*this.scale), this.y+(int)(4.5*this.scale));
        star.addPoint(this.x+(int)(7.5*this.scale), this.y+(int)(4.5*this.scale));
        star.addPoint(this.x+(int)(3*this.scale), this.y+(int)(7*this.scale));
        star.addPoint(this.x+(int)(6*this.scale), this.y+(int)(12*this.scale));
        star.addPoint(this.x, this.y+(int)(9*this.scale));
        star.addPoint(this.x-(int)(6*this.scale), this.y+(int)(12*this.scale));
        star.addPoint(this.x-(int)(3*this.scale), this.y+(int)(7*this.scale));
        star.addPoint(this.x-(int)(7.5*this.scale), this.y+(int)(4.5*this.scale));
        star.addPoint(this.x-(int)(2*this.scale), this.y+(int)(4.5*this.scale));
        star.moveBy(0, -(int)(85*this.scale));

        window.add(snowBall1);
        window.add(snowBall2);
        window.add(snowBall3);
        window.add(button1);
        window.add(button2);
        window.add(button3);
        window.add(eye1);
        window.add(eye2);
        window.add(mouth);
        window.add(nose);
        window.add(hatBrim);
        window.add(hatTop);
        window.add(hand1);
        window.add(hand2);
        window.add(star);
    }
}