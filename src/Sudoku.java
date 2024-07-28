import java.io.*;
import javafx.fxml.*;
import javafx.stage.*;
import javafx.scene.*;
import java.util.*;
import javafx.application.*;
public class Sudoku extends Application
{
    //function to override the start method
    public void start(Stage primary) throws IOException
    {
        Parent root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sudoku.fxml")));
        primary.setScene(new Scene(root));
        primary.setTitle("Sudoku!!");
        primary.setResizable(false);
        primary.show();
    }
}