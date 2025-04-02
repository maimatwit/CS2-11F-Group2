package application;

public class Mole {
	private int points;
	private int spawnchance;

	public Mole(int points, int spawnchance ) {
		this.points = points;
		this.spawnchance = spawnchance;
		
	}

	public void difficulty_change(int n) {
		if (n ==0)
		{
			setpoints(points*3);
			setspawnchance(spawnchance*2);
		}
		else if (n ==1)
		{
			setpoints(points*2);
			setspawnchance(spawnchance);			
		}
		else
		{
			setpoints(points);
			setspawnchance(spawnchance);
		}
		
	}

	public int getpoints()
	{return points;}
	public void setpoints(int points)
	{this.points=points;}
	
	
	public void setspawnchance(int spawnchance)
	{this.spawnchance=spawnchance;}
	
	public int getspawnchance()
	{return spawnchance;}

	


	
  
	
	
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