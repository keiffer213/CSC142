import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class


/**
 * <p>Create a cable car in a graphics window</p>  
 * @author Keiffer Tan 202974671
 */

public class CableCar {

    // Your instance fields go here
    private GWindow window;
    private int x, y;
    private double scale;

    /**
     * Create a cable car at location (x,y) in the GWindow window.
     * @param x the x coordinate of the center of the cable car
     * @param y the y coordinate of the center of the cable car
     * @param scale the factor that multiplies all default dimensions for this cable car
     * (e.g. if the default size is 80, the size of this cable car is
     * scale * 80)
     * @param window the graphics window this cable car belongs to
     */
    public CableCar(int x, int y, double scale, GWindow window)
    {
        // initialize the instance fields
        this.window = window;
        this.scale = scale;
        this.x = x;
        this.y = y;

        // The details of the drawing are in a private method
        this.draw();
    }

    /** Draw a cable car at location (x,y) */
    private void draw()
    {
        //adding cable car lines to drawing
        Line cable = new Line(this.x-400, this.y, this.x+400, this.y);
        Line cable2 = new Line(this.x, this.y, this.x+(int)(40*this.scale), this.y+(int)(40*this.scale));
        Line cable3 = new Line(this.x, this.y, this.x-(int)(40*this.scale), this.y+(int)(40*this.scale));

        //add cable car
        Rectangle car = new Rectangle(this.x-(int)(70*this.scale), this.y+(int)(40*this.scale),
                (int)(140*this.scale),(int)(70*this.scale), Color.BLUE, true
                );
        Rectangle window1 = new Rectangle(this.x-(int)(12*this.scale), this.y+(int)(60*this.scale),
                (int)(24*this.scale),(int)(24*this.scale), Color.WHITE, true );
        Rectangle window2 = new Rectangle(this.x-(int)(12*this.scale), this.y+(int)(60*this.scale),
                (int)(24*this.scale),(int)(24*this.scale), Color.WHITE, true );
        Rectangle window3 = new Rectangle(this.x-(int)(12*this.scale), this.y+(int)(60*this.scale),
                (int)(24*this.scale),(int)(24*this.scale), Color.WHITE, true );

        window2.moveBy((int)(40*this.scale), 0);
        window3.moveBy(-(int)(40*this.scale), 0);

        window.add(cable);
        window.add(cable2);
        window.add(cable3);
        window.add(car);
        window.add(window1);
        window.add(window2);
        window.add(window3);
    }
}