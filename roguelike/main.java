public class main
{
	public static void main(String[] args)
	{
		///////////////////////
		//Character creation//
		/////////////////////

		char character = '@';
		int health = 100;
		int mana = 100;
		int gold = 0;
		int[] loc = {0,0};
		int[] stats = {0,0,0};
		int points = 10;
		hero ryan = new hero(character, health, mana, gold, loc, stats, points);
		//ryan.getStatus();

		///////////////////////
		//Treasure Creation///
		/////////////////////

		int[] tloc1 = {1,1};
		treasure t1 = new treasure(tloc1);
		int[] tloc2 = {2,2};
		treasure t2 = new treasure(tloc2);
		int[] tloc3 = {0,0};
		treasure t3 = new treasure(tloc3);
		treasure[] treasures = {t1,t2,t3};

		////////////////////
		//Screen creation//
		//////////////////

		int width = 50;
		int height = 15;
		screen gscreen = new screen(width, height);
		gscreen.updateScreen(ryan, treasures);
		gscreen.printScreen();
	}
}
