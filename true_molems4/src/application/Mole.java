package application;

import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Mole {
	private int points;
	private int timespawn;//ms
	private int duration;//ms
	private Timeline totaltime;
	private boolean Visibility = false;

//	int starttime = 15;
	private int score;
	
  
	Mole(int points,int timespawn,int duration,boolean Visibility){
		this.points = points;
		this.timespawn = timespawn;
		this.duration = duration;
		this.Visibility = Visibility;
//		totaltime = new Timeline(new KeyFrame(Duration.millis(1000)));
	}
	//__________________________________________________________________________________________________________________________________________________________
	public int getpoints()
	{return points;}
	public void setpoints(int points)
	{this.points=points;}
	
	public int gettimespawn()
	{return timespawn;}
	public void settimespawn(int timespawn)
	{this.timespawn= timespawn;}
	
	
	public int getduration()
	{return duration;}
	public void setduration(int duration)
	{this.duration= duration;}
	
	public boolean getVisibility()
	{return Visibility;}
	public void setVisibility(boolean Visibility )
	{this.Visibility= Visibility;}
	//________________________________________________________________________________________________________________________________________________________________
	
//	public boolean is_Up()//displays mole for duration
//	{
//			if () // if the duration than when the time started && current instance of time is less than when 
//				//spawned whe
//			{
//				setVisibility(true);
//			}
//			else
//			{
//				setVisibility(false);
//			}
//		
//	}
	
	
//	public void addpoint()
//	{
//		score += getpoints();
//	}
	
	//is_hitmethod with picture
	
//	public int is_Up()//displays mole for duration
//	{
//		if (starttime >duration && totaltime <timespawn +duration )
//		{
//		
//		starttime=x;
//		return 1;
//		}
//		else {
//		//reset total time to 0;
//		return 0;
//		}
//	}

	
	
	
	
	
	
//	int[][] array= new int[row][col];
//	return array;
	
//	public void wheremolespawn(int[][] hole)
//	{
//	Random random =new Random();
//	for (int i=0;i<3<i++)
//	{
//		for (int j =0; j<3;j++)
//		{
//			System.out.print(is_Up();)
//		}
//	}
//	
//	}
	
	

}