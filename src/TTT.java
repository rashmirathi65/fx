import javafx.fxml.*;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
public class TTT
{
    @FXML
    private Label one;
    @FXML
    private Label two;
    @FXML
    private Label three;
    @FXML
    private Label four;
    @FXML
    private Label five;
    @FXML
    private Label six;
    @FXML
    private Label seven;
    @FXML
    private Label eight;
    @FXML
    private Label nine;
    private String text="X";
    private boolean labels[]={true, true, true, true, true, true, true, true, true};
    private String texts[][]={{"", "", ""}, {"", "", ""}, {"", "", ""}};
    //function to handle label one
    public void labelOne()
    {
        if(labels[0])
        {
            one.setText(text);
            texts[0][0]=text;
            text=text=="X"?"O":"X";
            labels[0]=false;
            checkOne();
        }
    }
    //function to handle label one
    public void labelTwo()
    {
        if(labels[1])
        {
            two.setText(text);
            texts[0][1]=text;
            text=text=="X"?"O":"X";
            labels[1]=false;
            checkTwo();
        }
    }
    //function to handle label one
    public void labelThree()
    {
        if(labels[2])
        {
            three.setText(text);
            texts[0][2]=text;
            text=text=="X"?"O":"X";
            labels[2]=false;
            checkThree();
        }
    }
    //function to handle label one
    public void labelFour()
    {
        if(labels[3])
        {
            four.setText(text);
            texts[1][0]=text;
            text=text=="X"?"O":"X";
            labels[3]=false;
            checkFour();
        }
    }
    //function to handle label one
    public void labelFive()
    {
        if(labels[4])
        {
            five.setText(text);
            texts[1][1]=text;
            text=text=="X"?"O":"X";
            labels[4]=false;
            checkFive();
        }
    }
    //function to handle label one
    public void labelSix()
    {
        if(labels[5])
        {
            six.setText(text);
            texts[1][2]=text;
            text=text=="X"?"O":"X";
            labels[5]=false;
            checkSix();
        }
    }
    //function to handle label one
    public void labelSeven()
    {
        if(labels[6])
        {
            seven.setText(text);
            texts[2][0]=text;
            text=text=="X"?"O":"X";
            labels[6]=false;
            checkSeven();
        }
    }
    //function to handle label one
    public void labelEight()
    {
        if(labels[7])
        {
            eight.setText(text);
            texts[2][1]=text;
            text=text=="X"?"O":"X";
            labels[7]=false;
            checkEight();
        }
    }
    //function to handle label one
    public void labelNine()
    {
        if(labels[8])
        {
            nine.setText(text);
            texts[2][2]=text;
            text=text.equals("X")?"O":"X";
            labels[8]=false;
            checkNine();
        }
    }
    //function to check for path one
    public void checkOne()
    {
        if(texts[0][0].equals(texts[0][1]) && texts[0][1].equals(texts[0][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            two.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[0][0].equals(texts[1][1]) && texts[1][1].equals(texts[2][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[0][0].equals(texts[1][0]) && texts[1][0].equals(texts[2][0]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            four.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    //function to check for path two
    public void checkTwo()
    {
        if(texts[0][0].equals(texts[0][1]) && texts[0][1].equals(texts[0][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            two.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[0][1].equals(texts[1][1]) && texts[1][1].equals(texts[2][1]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            two.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            eight.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    //function to check for path three
    public void checkThree()
    {
        if(texts[0][0].equals(texts[0][1]) && texts[0][1].equals(texts[0][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            two.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[2][0].equals(texts[1][1]) && texts[1][1].equals(texts[0][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[0][2].equals(texts[1][2]) && texts[1][2].equals(texts[2][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            six.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    //function to check for path four
    public void checkFour()
    {
        if(texts[1][0].equals(texts[1][1]) && texts[1][1].equals(texts[1][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            four.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            six.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[1][0].equals(texts[0][0]) && texts[1][0].equals(texts[2][0]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            four.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    //function to check for path five
    public void checkFive()
    {
        if(texts[1][1].equals(texts[0][1]) && texts[1][1].equals(texts[2][1]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            two.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            eight.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[1][1].equals(texts[1][0]) && texts[1][1].equals(texts[1][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            four.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            six.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[1][1].equals(texts[0][0]) && texts[1][1].equals(texts[2][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[1][1].equals(texts[2][0]) && texts[1][1].equals(texts[0][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    //function to check for path six
    public void checkSix()
    {
        if(texts[1][2].equals(texts[0][2]) && texts[1][2].equals(texts[2][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            six.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[1][2].equals(texts[1][1]) && texts[1][1].equals(texts[1][0]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            four.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            six.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    //function to check for path seven
    public void checkSeven()
    {
        if(texts[2][0].equals(texts[1][1]) && texts[1][1].equals(texts[0][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[2][0].equals(texts[2][1]) && texts[2][1].equals(texts[2][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            eight.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[2][0].equals(texts[1][0]) && texts[1][0].equals(texts[0][0]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            four.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    //function to check for path eight
    public void checkEight()
    {
        if(texts[2][1].equals(texts[1][1]) && texts[1][1].equals(texts[0][1]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            eight.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            two.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[2][1].equals(texts[2][0]) && texts[2][1].equals(texts[2][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            eight.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
    //function to check for path nine
    public void checkNine()
    {
        if(texts[2][2].equals(texts[1][1]) && texts[1][1].equals(texts[0][0]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            one.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            five.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[2][2].equals(texts[2][1]) && texts[2][1].equals(texts[2][0]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            seven.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            eight.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(texts[2][2].equals(texts[1][2]) && texts[1][2].equals(texts[0][2]))
        {
            texts=new String[][]{{"", "", ""}, {"", "", ""}, {"", "", ""}};
            nine.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            six.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
            three.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
}