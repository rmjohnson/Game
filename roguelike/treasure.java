import java.util.Random;

public class treasure
{
	int mpotions;
	int hpotions;
	int gold;
	Random r = new Random();
	int ritem;
	int ramount;
	char character;
	int[] loc = new int[2];

	public treasure (int pwidth, int pheight)
	{
		ritem = r.nextInt(3);
		ramount = r.nextInt(3) + 1;
		loc[0] = r.nextInt(pwidth) - pwidth/2;
		loc[1] = r.nextInt(pheight) - pheight/2;
		switch(ritem)
		{
			case 0:
				mpotions = ramount;
				hpotions = 0;
				gold = 0;
				character = '=';
				break;
			case 1:
				mpotions = 0;
				hpotions = ramount;
				gold = 0;
				character = '!';
				break;
			case 2:
				mpotions = 0;
				hpotions = 0;
				gold = ramount;
				character = '$';
				break;
		}

	}
}

