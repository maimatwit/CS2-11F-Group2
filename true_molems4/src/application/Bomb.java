package application;

import java.util.ArrayList;

import javafx.scene.control.Button;

class Bomb extends Props {
	int end_game;
	public Bomb(int points, int spawnchance, int end_game) {
		super(points, spawnchance);
		this.end_game = end_game;
	}
	public int getend_game()
	{return end_game;}
	public void setend_game(int setting)
	{this.end_game=end_game;}
	
	
	 @Override
		public void difficulty_change(int n) {
			if (n ==0)
			{
				setend_game(0);
				setpoints(points);
				setspawnchance(spawnchance/2);
			}
			else if (n ==1)
			{
				setend_game(0);
				setpoints((points*2));
				setspawnchance(spawnchance);			
			}
			else
			{
				setend_game(1);
				setspawnchance(spawnchance*2);
			}
	 }


	

}
