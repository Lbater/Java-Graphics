import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 *This draws a team which draws players and such
 *
 * This is the class that creates the Teams
 * Along with the referee
 *
 * @author Logan Bateman, 000918989
 */
public class ThreeTeams extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(700, 500); // Set canvas Size in Pixels
        stage.setTitle("The O . lympics"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE

        Team team1=new Team(50,50, Color.BLUE, "B1 Battle Droids");
        team1.draw(gc);

        Team team2=new Team(50,175, Color.BLACK, "Super Battle Droids");
        team2.draw(gc);

        Team team3=new Team(50,300, Color.ORANGE, "Droidekas");
        team3.draw(gc);

        Player referee=new Player(450,200, Color.BLACK, "Referee");
        referee.draw(gc);


        // YOUR CODE STOPS HERE
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}