import java.util.Random;

public class treasure
{
	int mpotions;
	int hpotions;
	int gold;
	Random r = new Random();
	int ritem = r.nextInt(3);
	int ramount = r.nextInt(3);		

	public treasure ()
	{
		switch(ritem)
		{
			case 0:
				mpotions = ramount;
				hpotions = 0;
				gold = 0;
			case 1:
				mpotions = 0;
				hpotions = ramount;
				gold = 0;
			case 2:
				mpotions = 0;
				hpotions = 0;
				gold = ramount;
		}
	}
}

