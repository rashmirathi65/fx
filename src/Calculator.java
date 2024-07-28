import java.io.*;
import java.util.Objects;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.scene.image.*;
public class Calculator extends Application
{
    //function to override the start method
    public void start(Stage primary) throws IOException
    {
        Parent root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("calculator.fxml")));
        primary.setTitle("Calculator");
        Image icons=new Image("testing2.png");
        primary.getIcons().add(icons);
        primary.setScene(new Scene(root));
        primary.setResizable(false);
        primary.show();
    }
}