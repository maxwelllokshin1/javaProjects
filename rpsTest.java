package personalProjects;

import java.util.Random;
import java.util.Scanner;

public class rpsTest {
	
	public static String[] arr = {"Rock", "Paper", "Scissors"};
	
	public static void main(String[] args)
	{
		printHeader();
		String val = "";
		rps players = new rps(); // created 2 new players
		do {
			do
			{
				System.out.print("Enter Rock, Paper, or Scissors: ");
				Scanner sc = new Scanner(System.in);
				val = sc.nextLine();
			}while(!val.equals(arr[0]) && !val.equals(arr[1]) && !val.equals(arr[2]));
			
			
				Random rand = new Random();
				int bot = rand.nextInt(3);
				int user = -1;
				
				
				for(int i = 0; i<3; i++)
				{
					if(val.equals(arr[i]))
					{
						System.out.println(arr[i]);
						user = i;
					}
				}
				
				System.out.println("******************************************");
				System.out.println("User=" + arr[user]+" Bot =" + arr[bot]);
				System.out.println("******************************************");

				if(user == bot)
				{
					System.out.println("DRAW");
				}
				else
				{
					if(bot == 2 && user == 0)
					{
						System.out.println("WIN");
						System.out.println(arr[user] + " beat " + arr[bot]);
						players.setUserScore(1);
					}
					else if(bot == 0 && user == 2)
					{
						System.out.println("LOSE");
						System.out.println(arr[bot] + " beat " + arr[user]);
						players.setBotScore(1);
					}else if(user>bot)
					{
						System.out.println("WIN");
						System.out.println(arr[user] + " beat " + arr[bot]);
						players.setUserScore(1);
					}else if(bot>user)
					{
						System.out.println("LOSE");
						System.out.println(arr[bot] + " beat " + arr[user]);
						players.setBotScore(1);
					}
				}
				
				System.out.println("******************************************");
				System.out.println("SCORE: User= "+ players.getUserScore() + " Bot= " + players.getBotScore());
				System.out.println("******************************************");
		}while(players.getBotScore() != 3 && players.getUserScore() != 3);
		printFooter(players); 
	}
	
	
	public static void printHeader()
	{
		System.out.println("Welcome to Rock Paper Scissors rules as follows:");
		System.out.println(" -Rock beats Scissors");
		System.out.println(" -Scissors beats Paper");
		System.out.println(" -Paper beats Rock");
		System.out.println("Best to 3 wins");
	}
	
	public static void printFooter(rps player)
	{
		if(player.getUserScore() == 3)
		{
			System.out.println("USER WINS AYYYAYAYYAYAYYAYYA");
		}
		else
		{
			System.out.println("BOT wins :( BOOOOOOOOOO");
		}
	}
	
	
	public static int win()
	{
		return 0;
		
	}
}
