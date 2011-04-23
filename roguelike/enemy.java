import java.util.Random;

public class enemy
{
	int health;
	int attack;
	int points;
	int speed;
	Random r = new Random();
	int direction;
	int[] loc = new int[2];

	public enemy(int phealth, int pattack, int ppoints, int pspeed)
	{
		health = phealth;
		attack = pattack;
		points = ppoints;
		speed = pspeed;
	}

	public void attackHero(hero character)
	{
		character.health = character.health - attack;
	}
	public void getHit(hero character)
	{
		//if(health - character.attack <= 0)
		//{
			//character.points = character.points + points;
		//}
		//else
		//{
			//health = health - character.attack;
		//}
	}
	public void move()
	{
		for(int i = 0; i < speed; i++)
		{
			direction = r.nextInt(4);
			switch(direction)
			{
				case 0: loc[0] = loc[0] + 1; //Move right
					break;
				case 1: loc[0] = loc[0] - 1; //Move left
					break;
				case 2: loc[1] = loc[1] + 1; //Move up
					break;
				case 3: loc[1] = loc[1] - 1; //Move down
			}
		}
	}
}
