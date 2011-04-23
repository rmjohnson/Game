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


		////////////////////
		//Screen creation//
		//////////////////

		int width = 50;
		int height = 15;
		screen gscreen = new screen(width, height);
		gscreen.printScreen();
	}
}
