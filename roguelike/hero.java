public class hero
{
	char character; //The character that represents the hero
	int health; //Will default to 100 but a second constuctor will be made so the initial health can be changed
	int mana; //Same as health
	int gold; //Same as health but starts at 0
	int hpotions; //Number of health potions
	int mpotions; //Number of mana potions
	int[] loc = new int[2]; //(x,y) cordinates
	int[] stats = new int[3]; //Strength, intellect, dexterity (for now, considering using SPECIAL)
	int points; //Extra points to spend on stats
	
	
	/////////////////
	//Constructors//
	///////////////
	
	//Constructor that sets all variables
	public hero(char pcharacter, int phealth, int pmana, int pgold, int px, int py, int pstr, int pint, int pdex)
	{
		character = pcharacter;
		health = phealth;
		mana = pmana;
		gold = pgold;
		loc[0] = px;
		loc[1] = py;
		stats[0] = pstr;
		stats[1] = pint;
		stats[2] = pdex;
	}

	public hero(int px, int py)
	{
		this('@', 100, 100, 0, px, py, 0, 0, 0);
	}
		
	////////////
	//Methods//
	//////////
	
	//A move method to move the character. I'm unsure how the object variables work and if I can just edit them like I have it.
	public void move(char direction)
	{
		switch(direction)
		{
			case 'u': loc[1]++;
				  break;
			case 'd': loc[1]--;
				  break;
			case 'l': loc[0]--;
				  break;
			case 'r': loc[0]++;
				  break;
		}
	}
	
	//Change the value of the gold variable. The amount variable is how much the gold should be changed, not what it should be changed to.
	public void changeGold(int amount)
	{
		gold = gold + amount;
	}
	
	//Same as changeGold except it would be used for when potions are used or damage is taken.
	public void changeHealth(int amount)
	{
		health = health + amount;
	}
	
	//Same as changeGold except it would be used for when potions are used or spells are cast.
	public void changeMana(int amount)
	{
		mana = mana + amount;
	}
	
	//The stats takes which stat is to be changed and by how much. It checks to make sure there are enough points.
	public void changeStats(char stat, int amount)
	{		
		if(amount <= points)
		{
			int i = 0;
			switch(stat)
			{
				case 's': i = 0;
				case 'i': i = 1;
				case 'd': i = 2;
			}
			stats[i] = stats[i] + amount;
			points = points - amount; //Would like to reference the method for changing points here, but I'm unsure how to do that with an object to call
		}
		else
		{
			System.out.println("You don't have that many points to spend.");
		}
	}
	
	//Change the number of points.
	public void changePoints(int amount)
	{
		points = points + amount;
	}
	
	//Returns an array containing all the status information
	public char[][] getStatus()
	{
		char[][] status = new char[3][30];
		String hstatus = "Health: " + health;
		String mstatus = "Mana: " + mana;
		String gstatus = "Gold: " + gold;

		//hstatus.getChars(0,hstatus.length,status[1],0);
		//mstatus.getChars(0,mstatus.length,status[2],0);
		//gstatus.getChars(0,gstatus.length,status[3],0);

		return status;
	}
}
	
