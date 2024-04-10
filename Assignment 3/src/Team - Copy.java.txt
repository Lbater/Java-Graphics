/**
 * This is the code for the Team that calls the Player class to draw the robots
 * Author: Logan Bateman, 000918989
 */

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Team{
    private double x;
    private double y;
    private Color color;
    private String name;
    private Player player1;
    private Player player2;
    private Player player3;


    /**
     * This is the team Constructor
     * @param x the starting x position
     * @param y the starting y position
     * @param color is the color they assign to each Team
     * @param name the name they give to each Team
     */
    public Team(double x, double y, Color color, String name){
        this.x=x;
        this.y=y;
        this.color=color;
        this.name=name;
        player1=new Player(x, y, color);
        player2=new Player(x+100, y, color);
        player3=new Player(x+200, y, color);
    }


    /**
     * This draws the Teams
     * @param gc this is the name of our GraphicsContext object
     */
    public void draw(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("Times New Roman", FontWeight.BOLD, 14));
        String avg=String.format("%.1f",(player1.getAverage()+ player2.getAverage()+ player3.getAverage())/3);
        gc.fillText(name+" "+"(team average "+avg+")", x-25, y+100);
        player1.draw(gc);
        player2.draw(gc);
        player3.draw(gc);
    }
}