import java.net.URL;
import java.io.*;
import java.util.*;
import javafx.fxml.*;
import javafx.event.*;
import javafx.scene.control.*;
public class EventsC implements Initializable
{
    @FXML
    private Label label;
    @FXML
    private Button button;
    private double xAxis;
    private double yAxis;
    //function to override the initialize method
    public void initialize(URL url, ResourceBundle rb)
    {
        label.setOnMouseClicked(event->
        {
            label.setText("X");
        });

        button.setOnMouseEntered(event->
        {
            label.setText("Mouse Entered");
        });

        button.setOnMouseExited(event->
        {
            label.setText("Mouse Exited");
        });

        button.setOnMousePressed(event->
        {
            label.setText("Mouse Pressed");
            xAxis=event.getSceneX()-button.getTranslateX();
            yAxis=event.getSceneY()-button.getTranslateY();
        });

        button.setOnMouseReleased(event->
        {
            label.setText("Mouse Released");
        });

        button.setOnMouseDragged(event->
        {
            label.setText("Mouse Dragging");
            button.setTranslateX(event.getSceneX()-xAxis);
            button.setTranslateY(event.getSceneY()-yAxis);
        });
    }
}