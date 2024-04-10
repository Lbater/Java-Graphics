/**
 * This is the code for the Head
 * Author: Logan Bateman, 000918989
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Head {
    private double x;
    private double y;

    /**
     * This is the head, neck and arms Constructor
     * @param x the starting x position
     * @param y the starting y position
     */
    public Head (double x, double y){
        this.x=x;
        this.y=y;
    }


    /**
     * This draws the head, arms, neck and little pom pom type things robots
     * @param gc this is the name of our GraphicsContext object
     */
    public void draw(GraphicsContext gc){
        gc.setFill(Color.GREEN);
        gc.fillOval(x,y,30,30);
        gc.setFill(Color.RED);
        gc.fillRect(x+12, y+30, 5,30);
        gc.setFill(Color.PURPLE);
        gc.fillRect(x+17,y+40,40,5);
        gc.fillRect(x-27,y+40,40,5);
        gc.fillRect(x-27,y+10,5,30);
        gc.fillRect(x+52,y+10,5,30);
        gc.setFill(Color.PEACHPUFF);
        gc.fillOval(x+47,y+5,15,15);
        gc.fillOval(x-32,y+5,15,15);
        x+=100;
    }
}