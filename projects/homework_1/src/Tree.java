import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>Create a tree with ornaments in a graphics window</p>
 * @author Keiffer Tan 202974671
 */

public class Tree {

    // Instance fields
    // The graphics window this tree belongs to
    private GWindow window;
    // The location of this tree
    // (precisely (as done in the draw method), (x,y) is
    // the upper left corner of the tree trunk)
    private int x;
    private int y;
    // The scale used to draw this tree
    private double scale;

    /**
     * Creates a tree
     * @param x the x coordinate of the tree location (upper left corner of the tree trunk)
     * @param y the y coordinate of the tree location
     * @param window the graphics window this Tree belongs to
     * @param scale the scale of the drawing (all default dimensions are multiplied
     * by scale)
     */
    public Tree(int x, int y, double scale, GWindow window)
    {
        // Initialize the instance fields (the use of this is required
        // since the instance fields have the same name as the
        // parameters of the constructor)
        this.window = window;
        this.scale = scale;
        this.x = x;
        this.y = y;

        // the details of the drawing are in written in the private method draw()
        this.draw();
    }

    /**
     * draw a pine tree
     */
    private void draw()
    {
        // trunk of the tree: a brown rectangle
        // (int) converts to an int 20*this scale (etc...), which is a double
        // For instance, (int)23.8 is 23
        // This is necessary since the Rectangle constructor takes integers
        Rectangle trunk = new Rectangle(this.x,this.y,(int)(20*this.scale),(int)(60*this.scale),
                Color.black,true);
        // Foliage (improve the drawing!)
        // a green triangle
        Triangle foliage = new Triangle(
                this.x-(int)(30*this.scale),this.y+(int)(30*this.scale),
                this.x+(int)(10*this.scale),this.y-(int)(10*this.scale),
                this.x+(int)(50*this.scale),this.y+(int)(30*this.scale),
                Color.green,true);
        Triangle foliage2 = new Triangle(
                this.x-(int)(30*this.scale),this.y+(int)(30*this.scale),
                this.x+(int)(10*this.scale),this.y-(int)(10*this.scale),
                this.x+(int)(50*this.scale),this.y+(int)(30*this.scale),
                Color.green,true);
        Triangle foliage3 = new Triangle(
                this.x-(int)(30*this.scale),this.y+(int)(30*this.scale),
                this.x+(int)(10*this.scale),this.y-(int)(10*this.scale),
                this.x+(int)(50*this.scale),this.y+(int)(30*this.scale),
                Color.green,true);

        //move the other 2 foliage up to make a tree
        foliage2.moveBy(0, -(int)(20*this.scale));
        foliage3.moveBy(0, -(int)(40*this.scale));

        //add ornaments on tree
        Oval ball1 = new Oval(this.x-(int)(20*this.scale), this.y+(int)(25*this.scale),
                (int)(12*this.scale), (int)(12*this.scale), Color.RED, true);
        Oval ball2 = new Oval(this.x-(int)(20*this.scale), this.y+(int)(25*this.scale),
                (int)(12*this.scale), (int)(12*this.scale), Color.MAGENTA, true);
        Oval ball3 = new Oval(this.x-(int)(20*this.scale), this.y+(int)(25*this.scale),
                (int)(12*this.scale), (int)(12*this.scale), Color.BLUE, true);

        //move other ornaments to different areas
        ball2.moveBy((int)(50*this.scale), -(int)(25*this.scale));
        ball3.moveBy((int)(20*this.scale), -(int)(50*this.scale));

        Polygon star = new Polygon(Color.YELLOW, true);
        star.addPoint(this.x, this.y);
        star.addPoint(this.x+(int)(4*this.scale), this.y+(int)(9*this.scale));
        star.addPoint(this.x+(int)(15*this.scale), this.y+(int)(9*this.scale));
        star.addPoint(this.x+(int)(6*this.scale), this.y+(int)(15*this.scale));
        star.addPoint(this.x+(int)(12*this.scale), this.y+(int)(24*this.scale));
        star.addPoint(this.x, this.y+(int)(18*this.scale));
        star.addPoint(this.x-(int)(12*this.scale), this.y+(int)(24*this.scale));
        star.addPoint(this.x-(int)(6*this.scale), this.y+(int)(15*this.scale));
        star.addPoint(this.x-(int)(15*this.scale), this.y+(int)(9*this.scale));
        star.addPoint(this.x-(int)(4*this.scale), this.y+(int)(9*this.scale));
        star.moveBy((int)(10*this.scale), -(int)(60*this.scale));

        this.window.add(trunk);
        this.window.add(foliage);
        this.window.add(foliage2);
        this.window.add(foliage3);
        this.window.add(ball1);
        this.window.add(ball2);
        this.window.add(ball3);
        this.window.add(star);

        // Improve the drawing of the foliage and add the ornaments...
    }
}