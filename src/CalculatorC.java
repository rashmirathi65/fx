import java.io.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.*;
import javafx.stage.*;
public class CalculatorC
{
    @FXML
    private Label label;
    private boolean dotFlag=false;
    //function to add zero
    public void zero()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"0");
        }
    }
    //function to add one
    public void one()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"1");
        }
        else
        {
            label.setText("1");
        }
    }
    //function to add two
    public void two()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"2");
        }
        else
        {
            label.setText("2");
        }
    }
    //function to add three
    public void three()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"3");
        }
        else
        {
            label.setText("3");
        }
    }
    //function to add four
    public void four()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"4");
        }
        else
        {
            label.setText("4");
        }
    }
    //function to add five
    public void five()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"5");
        }
        else
        {
            label.setText("5");
        }
    }
    //function to add six
    public void six()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"6");
        }
        else
        {
            label.setText("6");
        }
    }
    //function to add seven
    public void seven()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"7");
        }
        else
        {
            label.setText("7");
        }
    }
    //function to add eight
    public void eight()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"8");
        }
        else
        {
            label.setText("8");
        }
    }
    //function to add nine
    public void nine()
    {
        if(!label.getText().equals("0"))
        {
            label.setText(label.getText()+"9");
        }
        else
        {
            label.setText("9");
        }
    }
    //function to add plus
    public void plus()
    {
        label.setText(label.getText()+"+");
    }
    //function for minus
    public void minus()
    {
        label.setText(label.getText()+"-");
    }
    //function for division
    public void division()
    {
        label.setText(label.getText()+"/");
    }
    //function for
    public void multiplication()
    {
        label.setText(label.getText()+"*");
    }
    //function for
    public void modulus()
    {
        label.setText(label.getText()+"%");
    }
    //function for
    public void dot()
    {
        String s=label.getText();
        if(Character.isDigit(s.charAt(0)) && !dotFlag)
        {
            dotFlag=true;
            label.setText(s + ".");
        }
    }
    //function to clear the screen
    public void clear()
    {
        if(!label.getText().equals("0"))
        {
            label.setText("0");
        }
    }
    //function to evaluate the expression
    public void equals()
    {
    }
    //function for right parenthesis
    public void right()
    {
    }
    //function for left parenthesis
    public void left()
    {
    }
    //function for deleting a character
    public void delete()
    {
        String s=label.getText();
        if(!s.equals("0"))
        {
            if(s.charAt(s.length()-1)=='.')
            {
                dotFlag=false;
            }
            if(s.length()==1)
            {
                label.setText("0");
                return;
            }
            label.setText(s.substring(0, s.length()-1));
        }
    }
    //function to show history button
    public void history(ActionEvent e) throws IOException
    {
        Parent root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("calculate.fxml")));
        Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
//        Image icon=new Image("C:\\Users\\rashm\\Downloads\\history.png");
//        stage.getIcons().add(icon);
        stage.setScene(new Scene(root));
        stage.show();
    }
    //function to use back button
    public void back(ActionEvent e) throws IOException
    {
        Parent root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("calculator.fxml")));
        Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}