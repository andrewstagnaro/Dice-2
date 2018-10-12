/**
 * 
 * @author andrew stagnaro
 *
 */
public class Dice 
{
	
	private int numRolls;
	
	
	public Dice()
	{
		numRolls = 0;
	}
	
	public int roll()
	{
	 numRolls++;
	 int roll = (int)(Math.random()*6) + 1;
	 return roll;
	}
	
	public void reset()
	{
		numRolls = 0;
	}
 
	public int getNumRolls()
	{
		return numRolls;
	}

	public int repRoll()
	{
		int roll = (int)(Math.random()*6) + 1;
		
	}
}