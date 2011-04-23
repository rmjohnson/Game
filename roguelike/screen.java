public class screen
{
	char[][] screena;
	String clrscreen;
	int width;
	int height;
	public screen(int pwidth, int pheight)
	{
		width = pwidth;
		height = pheight;
		screena = new char[height+2][width+2];
		for(int i=0;i< width+2;i++)
		{
			screena[0][i] = '-';
		}
		for(int i=1; i< height+1;i++)
		{
			screena[i][0] = '|';
			for (int ii=1; ii<width;ii++)
			{
				screena[i][ii] = ' ';
			}
			screena[i][width+1] = '|';
		}
		for(int i=0;i< width+2;i++)
		{
			screena[height+1][i] = '-';
		}
		clrscreen = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

	}
	public void updateScreen(hero character)
	{
		screena[(height/2)+1+character.loc[1]][(width/2)+1+character.loc[0]] = character.character;
	}
	public void printScreen()
	{
		System.out.println(clrscreen);	
		for(int i=0; i < height+2; i++)
		{
			for(int ii=0; ii< width+2; ii++)
			{
				System.out.print(screena[i][ii]);
			}
			System.out.println();
		}
	}
}
