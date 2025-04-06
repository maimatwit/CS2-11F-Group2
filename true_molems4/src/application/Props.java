package application;
//not necessary anymore keep for archive 
abstract class Props {
	int points;
	int spawnchance;
	public Props(int points, int spawnchance)
	{
		this.points = points;
		this.spawnchance=spawnchance;
	}
	
	public int getpoints()
	{return points;}
	public void setpoints(int points)
	{this.points=points;}
	
	
	public void setspawnchance(int spawnchance)
	{this.spawnchance=spawnchance;}
	
	public int getspawnchance()
	{return spawnchance;}
	
	
	abstract void difficulty_change(int num);


}
