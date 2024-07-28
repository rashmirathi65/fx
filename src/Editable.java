import javafx.event.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.application.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
public class Editable extends Application
{

    //function to override the start method
    public void start(Stage primaryStage)
    {
        BorderPane root = new BorderPane();

        root.setCenter(new EditableButton("Editable Button"));

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private class EditableButton extends Button
    {
        TextField tf = new TextField();

        public EditableButton(String text)
        {
            setText(text);
            setOnMouseClicked(e ->
            {
                tf.setText(getText());
                setText("");
                setGraphic(tf);
            });
            tf.setOnAction(event ->
            {
//                if (validateText(tf.getText()))
//                {
                    setText(tf.getText());
                    setGraphic(null);
//                }
            });
        }
    }
}