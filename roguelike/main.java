public class main
{
	public static void main(String[] args)
	{
		///////////////////////
		//Character creation//
		/////////////////////

		int width = 50;
		int height = 15;

		hero ryan = new hero();
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
