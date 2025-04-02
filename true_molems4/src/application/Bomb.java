package application;

class Bomb extends Mole {
	boolean end_game;
	public Bomb(int points, int spawnchance, boolean end_game) {
		super(points, spawnchance);
		this.end_game = end_game;
	}
	public boolean getend_game()
	{return end_game;}
	
	public void setend_game(boolean setting)
	{this.end_game=setting;}
	
	
	
	 @Override
		public void difficulty_change(int n) {
			if (n ==0)
			{
				setend_game(false);
				setpoints(getpoints());
				setspawnchance(getspawnchance()/2);
			}
			else if (n ==1)
			{
				setend_game(false);
				setpoints((getpoints()*2));
				setspawnchance(getspawnchance());			
			}
			else
			{
				setend_game(true);
				setspawnchance(getspawnchance()*2);
			}
	 }


	

}
