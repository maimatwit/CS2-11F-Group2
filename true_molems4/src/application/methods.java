package application;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class methods {
	/**
	 * @FXML
	    private Button button;

	    @FXML
	    private Text displaypoint;

	    @FXML
	    private Text timer;

  
	_____________________________________________________
	Following covers moving to set locations
	
	  @FXML
	    private Circle circ1;

	    @FXML
	    private Circle circ2;

	    @FXML
	    private Circle circ3;

	    @FXML
	    private Circle circ4;

	    @FXML
	    private Circle circ5;

	    @FXML
	    private Circle circ6;

	    @FXML
	    private Circle circ7;

	    @FXML
	    private Circle circ8;

	    @FXML
	    private Circle circ9;

	    @FXML
	    private Button tile1;
	    
	    @FXML
	    private Rectangle moleshape;
	    int x = 281;
	    int y = 120;
	    
	    ArrayList<Circle> hole = new ArrayList<Circle>(Arrays.asList(circ,circ1,circ2,circ3,circ4,circ5,circ6,circ7,circ8));
	    
	    public void movetoHole()//DOES NOT WORK INTENDED
	    {
	    	
	    	
	    	for (Circle i: hole)
	    	{
	    	moveCircleX(returnx(i));
	    	moveCircleY(returny(i));
	    	}
	    }
	    
	    public double returnx(Circle burrow)//something about burrow being null
	    {
	    	return  burrow.getCenterX();
	    }
	    public double returny(Circle burrow)
	    {
	    	return  burrow.getCenterY();
	    }
	    
	    
	    
	    public void moveToY(double positionChangeY)//changes position to y
	    {
	    	mole.setY(positionChangeY);
	    	
	    }
	    public void moveToX(double positionChangeX)//changes position to x 
	    {
	    	mole.setX(positionChangeX);
	    }

	 */
	  

//
//	  @FXML
//	    private Text Score;
//
//	    @FXML
//	    private Text Timer;
//
//	    @FXML
//	    private GridPane array;
//
//	    @FXML
//	    private Button testmole;
//
//	    @FXML
//	    private ImageView tile1;
//
//	    @FXML
//	    private ImageView tile2;
//
//	    @FXML
//	    private ImageView tile3;
//
//	    @FXML
//	    private ImageView tile4;
//
//	    @FXML
//	    private ImageView tile5;
//
//	    @FXML
//	    private ImageView tile6;
//
//	    @FXML
//	    private ImageView tile7;
//
//	    @FXML
//	    private ImageView tile8;
//
//	    @FXML
//	    private ImageView tile9;

//	    @FXML
//	    void isseen(MouseEvent event) {
//	    	score = score + 100;
//	    }
//
//	    @FXML
//	    void isup(ActionEvent event) {
//	    	isup();
//	    }

  
//	    @FXML
//	    void increasetimeby1(MouseEvent event) {
//	    	time ++;
//	    }
  
//  public static int time = 15;//time
//  public int scorept = 0;
  

  
  
//  @FXML
//  public void add() {
//  	System.out.print(10);
//  	scorept +=10;
//  	Score.setText(String.valueOf(scorept));
//  	System.out.println(scorept);
//  }
  
  //methods
//  private void changemole(Button tile, ImageView img)
//  {
//  	tile.setGraphic(img);
//  	
//  }
//  public void IsHit()
//	{
//		setVisibility(false);
//	}
  
//  
//  @FXML
//  void isseen(MouseEvent event) {
//  		System.out.print("10");
//  		mole.setVisibility(false);
//  }
//  
//  public void isseen()
//  {
//  	if (mole.getVisibility()==true )//and is clicked 
//  	{
//  		score+= mole.getpoints();
//  		mole.setVisibility(false);
//  	}
//  }
//  
//  public void gridpane(GridPane arrays)//DOES NOT WORK AS INTENDED stalls 
//  {
//  	int delay_milli = 500;
//  	for (int i = 0;i<10;i++)
//  	{
//  	arrays.setRowIndex(testmole ,(int)Math.random()*2);
//  	arrays.setColumnIndex(testmole ,(int)Math.random()*2);
//  	
//  	try {
//			Thread.sleep(300);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//  	}
//  }
  
  
//  public void TileisTaken()
//  {
//  	if()
//  }
//  
//  
//  
//  
//  public void isup()//if time passed display mole 
//  {
//  	
//  	mole.setVisibility(true);
//  	FadeTransition fadeT = new FadeTransition(Duration.millis(1234), testmole);
//  	isseen();
//		fadeT.setFromValue(1);
//		fadeT.setToValue(0);
//		fadeT.setCycleCount(2);
//		fadeT.setAutoReverse(false);
//		fadeT.play();
//  	//fade transition then set visibility to false
//  }
//  
//  public void setrandom_mole(Button tile)//spawns mole in tile object's location 
//  {
//  	int tile_pos = (int)Math.random();
//
//  }
//  public boolean istaken()//checks if the point the image moves is taken 
//  {
//  	return false;
//  }
//  
//  public void endgame()
//  {
//  	//makes retry menu appear and transition to first scene
//  	//stops all animations and set all objects invisible 
//  }
//  
//  Mole mole = new Mole(100,300,265,true);
//  public void Timecountdown()
//  {
//  	Timer.setText(String.valueOf(time));
//  	Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000),e->{
//  	if(time>0) {
//  	time--;	
//  	Timer.setText(String.valueOf(time));
//  	}
//  	else
//  	{
//  	System.out.print("done");
//  	timeline.setCycleCount(time+1); //make it indefinite but end when game ends
//  	timeline.play();	
//  	
//  }
	
	//_______________________________________________________________________________ botched code
  
	//initializes something at the start of the program
	
//	//below implements a count down timer of i.
////	gridpane(array); does not work as intended 
////	Score.setText(String.valueOf(scorept));
//	Timer.setText(String.valueOf(time));
//	Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000),e->{
//	if(time>0) {
//	time--;	
//	Timer.setText(String.valueOf(time));
//	}
//	else
//	{
//	System.out.print("done");
//	}
//	}));
//	//this for mole game implement
////	Image img_mole = new Image("0050Diglett.png");
////	ImageView View = new ImageView(img_mole);
//	//import image
//	timeline.setCycleCount(time+1); //make it indefinite but end when game ends
//	timeline.play();	
////	isup();
//	
//_________________________________
//	private int scorecounter;
//  Mole_tile_time, Bomb_tile_time in ms
// private boolean hittable = true;
// 
//	public void points(){
//		if(molehit)
//		scorecounter+=100;
//		Score.setText(String.valueOf(scoreCounter));)
//	}
//	public void hidepos() 
//	{
//		array list the moles get current put into array and print to file 
//	}

	
//	possible logic to implement moles on grid
//	give mole timers and they will appear at said timer on a random tile
// 
//
	

	
	
	
//  public void tile() {	
//  ArrayList<Button> tiles = new ArrayList<Button>(Arrays.asList(tile1,tile2,tile3,tile4,tile5,tile6,tile7,tile8,tile9));
//	private boolean istaken(ArrayList<Button>)
// { 
//		if(currmoletile !=null);
//		
// }
	
//	public void Gameend()
//	{
//		if (time ==0 || hitbomb())
//	{
//		hittable = false;
//		display restart (switch to scene 1);
//	}
//	}


//	private void setlevel (int level)
// {
//	
// }
//	
//	
//}
}