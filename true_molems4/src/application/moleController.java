package application;
import javafx.fxml.Initializable;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

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
public class moleController //implements Initializable 
{
	
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
	    private Text dpoint;

	    @FXML
	    private Rectangle molemove;

	    @FXML
	    private Button molesub;

	    @FXML
	    private Text timer;


	    /**
* //following is for mole class
  int point =100;
  int duration = 3000;//ms
  int frequency = 2000;//ms
  boolean is_active = true;
  //
  private int score =0;
  private int timecountdown = 30;
  @FXML 
  public void initialize()
  {
  displaypoint.setText(String.valueOf(score));
  }
  @FXML
  void add(MouseEvent event) {
  	add();
  }
  public void add() {  	
  	score +=10;
  	dpoint.setText(String.valueOf(score));
  	molesub.setDisable(true);
  }
  
//methods
  public void animation()//combines adding points on click with fading animation
	{
  	int randomvar = 3;// will probably set it to games start time 
  	while (randomvar >0)
  	{
  	FadeTransition fadeT = new FadeTransition(Duration.millis(5000), button);//how long it takes to disappear 
		fadeT.setFromValue(1);
		fadeT.setToValue(0);
		fadeT.setCycleCount(1000);// how many times it does it will bind it to the initial time #note no need to reverse because we want it to pop and disappear 
		button.setDisable(false);//unlocks interaction with button before might need a delay to give it time to move 
		fadeT.play();
//		button.setOnMouseClicked(mouseEvent ->{  //issue with animation and mouse event 
//			add();
//		});
		randomvar--;
  	}
	}
	
	    int x = molemove.getX();
	    int y = molemove.getY();
	    
	    ArrayList<Circle> hole = new ArrayList<Circle>(Arrays.asList(circ1,circ2,circ3,circ4,circ5,circ6,circ7,circ8,circ9));
	    
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
	    	molemove.setY(positionChangeY);
	    	
	    }
	    public void moveToX(double positionChangeX)//changes position to x 
	    {
	    	molemove.setX(positionChangeX);
	    }

	     * 
	     */
//    @Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//   
//    }
 
}

