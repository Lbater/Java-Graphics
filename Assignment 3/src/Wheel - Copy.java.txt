/**
 * This is the code for the Wheel
 * Author: Logan Bateman, 000918989
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Wheel {
    private double x;
    private double y;

    /**
     * This is the wheels Constructor
     * @param x the starting x position
     * @param y the starting y position
     */
    public Wheel(double x, double y){
        this.x=x;
        this.y=y;
    }


    /**
     * This draws the wheels
     * @param gc this is the name of our GraphicsContext object
     */
    public void draw(GraphicsContext gc){
        gc.setFill(Color.GREY);
        gc.fillOval(x-25, y+55, 5, 25);
        gc.fillOval(x+50, y+55, 5, 25);
        x+=100;
    }
}