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
		int width = 50;
		int height = 15;

		hero ryan = new hero(character, health, mana, gold, loc, stats, points);
		//ryan.getStatus();

		///////////////////////
		//Treasure Creation///
		/////////////////////

		treasure t1 = new treasure(width, height);
		treasure t2 = new treasure(width, height);
		treasure t3 = new treasure(width, height);
		treasure[] treasures = {t1,t2,t3};

		////////////////////
		//Screen creation//
		//////////////////

		screen gscreen = new screen(width, height);
		gscreen.updateScreen(ryan, treasures);
		gscreen.printScreen();
	}
}
