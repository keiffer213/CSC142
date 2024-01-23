import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>Create a christmas gift in a graphics window</p>
 * @author Keiffer
 */
public class Gift {

    private GWindow window;
    private int x, y;
    private  int boxWH = 30; //box width/height dimension
    private double scale;
    private Color color;

    /**
     * Create a gift at location (x,y) in the GWindow window
     * @param x: the x coordinate at the center of the gift
     * @param y: the y coordinate at the center of the gift
     * @param scale: the factor that multiplies all default dimensions for the gift
     *             (e.g. if the default size is 3, the size of gift is scale *3)
     * @param color: pass in the color you want the gift to be in main by passing parameter
     *             (e.g. pass in Color.BLUE if  you want a blue gift)
     * @param window: the graphics window this gift belongs to
     */
    public Gift(int x, int y, double scale, Color color, GWindow window) {
        //initialize instance fields
        this.window = window;
        this.scale = scale;
        this.x = x;
        this.y = y;
        this.color = color;

        this.draw();

    }

    private void draw() {

        Rectangle gift = new Rectangle(
                this.x-(int)(boxWH/2*this.scale), this.y-(int)(boxWH/2*this.scale),
                (int)(this.scale*boxWH), (int)(this.scale*boxWH), color, true);

        Rectangle ribbon1 = new Rectangle(
                this.x-(int)(0.5*boxWH*this.scale), this.y-(int)(3*this.scale),
                (int)(this.scale*boxWH), (int)(6*this.scale), Color.WHITE, true
        );
        Rectangle ribbon2 = new Rectangle(
                this.x-(int)(3*this.scale), this.y-(int)(0.5*boxWH*this.scale),
                (int)(6*this.scale), (int)(this.scale*boxWH), Color.WHITE, true
        );

        window.add(gift);
        window.add(ribbon1);
        window.add(ribbon2);


    }

}
