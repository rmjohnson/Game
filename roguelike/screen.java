public class screen
{
	char[][] screena;
	String clrscreen;
	int width;
	int height;
	String alert;
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
		alert = "";

	}
	public char[][] statScreen(hero character)
	{
		char[][] statscreen = new char[20][height+2];
		for(int i=0; i < 20;i++)
		{
			statscreen[0][i] = '-';
		}
		String healthstatus = "Health: " + character.health;
		String manastatus = "Mana: " + character.mana;
		String goldstatus = "Gold: " + character.gold;
		
		char[] hstatuschar = new char[healthstatus.length()];
		char[] mstatuschar = new char[manastatus.length()];
		char[] gstatuschar = new char[goldstatus.length()];

		healthstatus.getChars(0, healthstatus.length(), hstatuschar, 0);
		manastatus.getChars(0, manastatus.length(), mstatuschar, 0);
		goldstatus.getChars(0, goldstatus.length(), gstatuschar, 0);

		System.arraycopy(hstatuschar, 0, statscreen[1], 0, healthstatus.length());
		System.arraycopy(mstatuschar, 0, statscreen[2], 0, manastatus.length());
		System.arraycopy(gstatuschar, 0, statscreen[3], 0, goldstatus.length());

		for(int i=0; i < 20; i++)
		{
			statscreen[height+1][i] = '-';
		}
		return statscreen;
	}
	public void updateScreen(hero character, treasure[] treasures)
	{
		for(int i =0;i < treasures.length; i++)
		{
			if(treasures[i].loc[0] == character.loc[0] && treasures[i].loc[1] == character.loc[1])
			{
				alert = "You picked up: ";
				alert = alert + treasures[i].ramount;
				switch(treasures[i].ritem)
				{
					case 0: alert = alert + " mana potion(s).";
						break;
					case 1: alert = alert + " health potion(s).";
						break;
					case 2: alert = alert + " gold.";
						break;
				}
			}
			screena[(height/2)+1+treasures[i].loc[1]][(width/2)+1+treasures[i].loc[0]] = treasures[i].character;
		}
		screena[(height/2)+1+character.loc[1]][(width/2)+1+character.loc[0]] = character.character;
	}
	public void printScreen()
	{
		System.out.println(clrscreen);	
		System.out.println(alert);
		alert = "";
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
