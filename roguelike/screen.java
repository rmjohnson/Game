public class screen
{
	String strscreen;
	String clrscreen;
	public screen(int width, int height)
	{
		strscreen = "";
		for(int i=0;i< width+2;i++)
		{
			strscreen = strscreen + "-";
		}
		strscreen = strscreen + "\n";
		for(int i=0; i< height;i++)
		{
			strscreen = strscreen + "|";
			for (int ii=0; ii<width;ii++)
			{
				strscreen = strscreen + " ";
			}
			strscreen = strscreen + "|\n";
		}
		for(int i=0;i< width+2;i++)
		{
			strscreen = strscreen + "-";
		}
		clrscreen = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

	}
	public void updateScreen(hero character, treasure[] treasures)
	{
		
	}
	public void printScreen()
	{
		System.out.println(clrscreen);	
		System.out.println(strscreen);
	}
}
