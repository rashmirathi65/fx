import java.io.*;
import java.util.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.application.*;
public class Events extends Application
{
    //function to override the start method
    public void start(Stage primary) throws IOException
    {
        Parent root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("events.fxml")));
        primary.setTitle("Events");
        primary.setScene(new Scene(root));
        primary.show();
    }
}