package application;
import javafx.fxml.Initializable;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.event.*;
import java.util.random.*;
public class moleController implements Initializable {

    @FXML
    private GridPane array;

    @FXML
    private Button testmole;
    @FXML
    private Text Score;

    @FXML
    private Text Timer;

//    @FXML
//    private Button tile1;
//
//    @FXML
//    private Button tile2;
//
//    @FXML
//    private Button tile3;
//
//    @FXML
//    private Button tile4;
//
//    @FXML
//    private Button tile5;
//
//    @FXML
//    private Button tile6;
//
//    @FXML
//    private Button tile7;
//
//    @FXML
//    private Button tile8;
//
//    @FXML
//    private Button tile9;
    
    public static int time = 15;//time
    public int score;

    //methods
//    private void changemole(Button tile, ImageView img)
//    {
//    	tile.setGraphic(img);
//    	
//    }
//    public void IsHit()
//	{
//		addpoint();
//		setVisibility(false);
//	}
    
    public void isseen()
    {
    	if (mole.getVisibility()==true )//and is clicked 
    	{
    		score += mole.getpoints();
    		mole.setVisibility(false);
    	}
    }
    
    public void gridpane(GridPane arrays)
    {
    	int delay_milli = 500;
    	for (int i = 0;i<10;i++)
    	{
    	arrays.setRowIndex(testmole ,(int)Math.random()*2);
    	arrays.setColumnIndex(testmole ,(int)Math.random()*2);
    	
    	try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	}
    }
    
    
    
    
    public void isup()//if time passed display mole 
    {
    	
    	mole.setVisibility(true);
    	FadeTransition fadeT = new FadeTransition(Duration.millis(1234), testmole);
		fadeT.setFromValue(0);
		fadeT.setToValue(.9);
		fadeT.setCycleCount(1000);
		fadeT.setAutoReverse(true);
		fadeT.play();
    	//fade transition then set visibility to false
    }
    
    public void setrandom_mole(Button tile)//spawns mole in tile object's location 
    {
    	int tile_pos = (int)Math.random();
 
    }
    public boolean istaken()//checks if the point the image moves is taken 
    {
    	return false;
    }
    
    public void endgame()
    {
    	//makes retry menu appear and transition to first scene
    	//stops all animations and set all objects invisible 
    }
    
    Mole mole = new Mole(100,300,265,false);
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	//initializes something at the start of the program
    	
    	//below implements a count down timer of i.
    	gridpane(array);
    	Score.setText(String.valueOf(score));
    	Timer.setText(String.valueOf(time));
    	Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000),e->{
    	if(time>0) {
    	time--;	
    	Timer.setText(String.valueOf(time));
    	}
    	else
    	{
    	System.out.print("done");
    	}
    	}));
    	//this for mole game implement
//    	Image img_mole = new Image("0050Diglett.png");
//    	ImageView View = new ImageView(img_mole);
    	//import image
    	timeline.setCycleCount(time+1); //make it indefinite but end when game ends
    	timeline.play();	
    	isup();
    	
    }
}
