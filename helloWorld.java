/** 
 * The Hello WorldApp class implements an application that 
 * simply prints "Hello World!" to standard output
 */


class HelloWorldApp
{
	int limbs;
	int[] anArray = new int[10];

	public static void main (String[] args)
	{
		System.out.println("Mundo!"); // Display the string
		
		welcome();

	}
	
	private static void welcome()
	{
		System.out.println("Welcome to Hangman!");
		
		try 
		{
  			Thread.sleep(1000L);	  // one second
		}
		catch (Exception e) {}	   // this never happen... nobody check for it
		System.out.println(tester('b', "ardvark"));
	
	}

	private static boolean tester(char ch, String word)
	{
		int truth = 0;
		for (int i = 0; i < word.length(); i++)
		{
			if (word.charAt(i) == ch)
			{
				truth = 1;
			}
		}
		if (truth == 1)
		{
			return true;
		}
		return false;
	}
}
