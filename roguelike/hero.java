public class hero
{
	public char character; //The character that represents the hero
	public int health; //Will default to 100 but a second constuctor will be made so the initial health can be changed
	public int mana; //Same as health
	public int gold; //Same as health but starts at 0
	public int hpotions; //Number of health potions
	public int mpotions; //Number of mana potions
	public int[] loc = new int[2]; //(x,y) cordinates
	public int[] stats = new int[3]; //Strength, intellect, dexterity (for now, considering using SPECIAL)
	public int points; //Extra points to spend on stats
	
	
	/////////////////
	//Constructors//
	///////////////
	
	//Constructor that sets all variables
	public hero(char pcharacter, int phealth, int pmana, int pgold, int[] ploc, int[] pstats, int ppoints)
	{
		character = pcharacter;
		health = phealth;
		mana = pmana;
		gold = pgold;
		System.arraycopy(ploc,0,loc,0,1);
		System.arraycopy(pstats,0,loc,0,2);
		points = ppoints;
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
	
	//Prints out all variables
	public void getStatus()
	{
		System.out.print("Character: ");
		System.out.println(character);
		System.out.print("Health: ");
		System.out.println(health);
		System.out.print("Mana: ");
		System.out.println(mana);
		System.out.print("Gold: ");
		System.out.println(gold);
	}
}
	
