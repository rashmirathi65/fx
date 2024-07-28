import java.io.*;
import java.util.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.image.*;
import javafx.application.*;
public class TicTacToe extends Application
{
    //function to override the start method
    public void start(Stage primary) throws IOException
    {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ttt.fxml")));
        Image icon = new Image("64.png");
        primary.getIcons().add(icon);
        primary.setTitle("Tic Tac Toe");
        primary.setScene(new Scene(root));
        primary.setResizable(false);
        primary.show();
    }
}