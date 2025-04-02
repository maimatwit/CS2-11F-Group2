package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;


public class moleController implements Initializable{
	@FXML
    private RadioButton difficulty1;

    @FXML
    private RadioButton difficulty2;

    @FXML
    private RadioButton difficulty3;
    
    
    @FXML
    private ToggleGroup difficulty;
    
	  @FXML
	  private Text gameover;
	  @FXML
	    private Button start;
	  @FXML
	    private Text scoretext;

	   @FXML
	   private Text timetext;
	   @FXML
	    private Button tile1;

	    @FXML
	    private Button tile2;

	    @FXML
	    private Button tile3;

	    @FXML
	    private Button tile4;

	    @FXML
	    private Button tile5;

	    @FXML
	    private Button tile6;

	    @FXML
	    private Button tile7;

	    @FXML
	    private Button tile8;

	    @FXML
	    private Button tile9;
	    
	    @FXML
	    void easy(ActionEvent event) {
	    	 starttime=60;
		     time = starttime;
		     animal.difficulty_change(0);
		     bomb.difficulty_change(0);
	    }

	    @FXML
	    void hard(ActionEvent event) {
	    	 starttime=30;
		     time = starttime;	
		     animal.difficulty_change(2);
		     bomb.setend_game(1);
		     bomb.difficulty_change(2);
		     bomb.setend_game(1);
		     
	    }

	    @FXML
	    void medium(ActionEvent event) {
	    	 starttime=45;
		     time = starttime;
		     animal.difficulty_change(1);
		     bomb.difficulty_change(1);
	    }
	    
	    
	    
	    @FXML
	    void begingame(ActionEvent event) {
	    	score = 0;
	    	time = starttime;
			timetext.setText("Time Left: " + time);
			scoretext.setText("Score: " + score);
	    	start.setDisable(true);
	    	gameover.setOpacity(0);
	    	
	    	tiles = new ArrayList<>(Arrays.asList(tile1,tile2,tile3,tile4,tile5,tile6,tile7,tile8,tile9));
	    	tiles.forEach(tile->{
	    		tile.setDisable(false);
	    		tile.setOpacity(1);
					});
			Timeline timeline =  new Timeline(new  KeyFrame(Duration.seconds(1), e->{
			if (time>0) {
				
					timetext.setText("Time Left: " + time);	
				tiles.forEach(tile->{
			choice = (int)(Math.random()*100)+1;
					setupButton(tile);
				});
				time--;
			}
			else {
				resetgame();
				}
			}));
			timeline.setCycleCount(time+1);
			timeline.play();
	    }
	    
	    
	public static int starttime=45;
    public int time=starttime;
    public int score =0;
    public double randomspawn;
    public int choice;
    public int molespawn =30;
    public int bombspawn = 30;
    
    Props animal = new Mole(100,30);
    Props bomb = new Bomb(100,20,0);
    ArrayList<Button> tiles;
    //methods
    
   
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		time = starttime;
		timetext.setText("Time Left: " + time);
		scoretext.setText("Score: " + score);

		  tiles = new ArrayList<>(Arrays.asList(tile1,tile2,tile3,tile4,tile5,tile6,tile7,tile8,tile9));
		
		
		
	}
	
	
	void setupButton(Button tile)
	{
    	if (choice < molespawn || choice == molespawn )
    	{
    		tile.setStyle("-fx-base: maroon");
    		tile.setText("MOLE");
    		tile.setOnMouseClicked(mouseEvent ->{
    			if(mouseEvent.getClickCount()<2)//makes sure to only click once on mole
    			{
    		score+=animal.getpoints();
    		scoretext.setText("Score: " + score);
    			}
    		});
    	}
    	else if (choice < molespawn + bombspawn || choice == molespawn+bombspawn)
    	{
    		tile.setStyle("-fx-base: red");
    		tile.setText("BOMB");
    		tile.setOnMouseClicked(mouseEvent ->{
    			if(mouseEvent.getClickCount()<2)//makes sure to only click once on mole
    			{
    				if(bomb.getend_game() == 1)
    				{
    					resetgame();
    				}
    				else
    				{
    					
    					score-=bomb.getpoints();
    		    		scoretext.setText("Score: " + score);
    				}
    			}
    		});
    	}
    	else 
    	{
    		tile.setText(" ");
    		tile.setStyle("-fx-base: lawngreen");
    		tile.setTextFill(Color.BLACK);
    		tile.setOnMouseClicked(mouseEvent ->{
        		});
    	}
	}
	
	
	
	 public void resetgame()
	    {
		 time = 0;
		 tiles.forEach(tile->{
				tile.setDisable(true);
				tile.setOpacity(0);
		 });
		 gameover.setOpacity(1);
		 start.setDisable(false);
	    	
	    }
	
	
}