package personalProjects;

import java.util.Random;
import java.util.Scanner;

public class ttt {
	
	public static int MAX = 3;
	public static char[] arr = {'X', 'O', ' '};
	public static char[][] board = new char[MAX][MAX];
	public static void main(String[] args)
	{
		fillBoard();
		int[] userWin = {0,0};
		
		Random rand = new Random();
		int X,O, count =0;
		System.out.println("Enter row and column number starting from 0");
		System.out.println("Format as such: [r c]");
		System.out.println();
		printBoard();
		do
		{
			
			
			Scanner sc = new Scanner(System.in);
			int r,c;
			do {
				do
				{
					System.out.print("Enter Value: ");
					r = sc.nextInt();
					c = sc.nextInt();
				}while(r>=MAX || c>=MAX);
			}while(board[r][c] != arr[2]);
			count++;
			
			board[r][c] = arr[0];
			
			int rb;
			int cb;
			do
			{
				rb = rand.nextInt(3);
				cb = rand.nextInt(3); 
			}while(board[rb][cb] != arr[2]);
			count++;
			board[rb][cb] = arr[1];
			
			X = check(arr[0]);
			O = check(arr[1]);
			
			
			printBoard();
			
		}while(X != 1 && O != 1 && count < 7);
		if(count >= 7)
		{
			System.out.println("DRAW");
		}else
		{
			printFooter(X);
		}
	}
	
	public static void printBoard()
	{
		for(int i =0; i<MAX; i++)
		{
			for(int j = 0; j<MAX; j++)
			{
					System.out.print(board[i][j]);
					if(j != 2)
					{
						System.out.print("|");
					}
			}
			System.out.println();
			for(int j = 0; j<MAX*2-1; j++)
			{
				if(i != 2)
				{
					System.out.print("-");	
				}
			}
			System.out.println();
		}
	}
	
	public static void fillBoard()
	{
		for(int i = 0; i<MAX; i++)
		{
			for(int j = 0; j<MAX; j++)
			{
				board[i][j] = ' ';
			}
		}
	}
	
	
	public static int check(char val)
	{
		for(int i = 0; i<MAX; i++)
		{
			for(int j = 0; j<MAX; j++)
			{
				if(board[0][j] == val && board[1][j] == val && board[2][j] == val)
				{
					return 1;
				}
			}
			
			
			if(board[i][0] == val && board[i][1] == val && board[i][2] == val)
			{
				return 1;
			}
		}
		
		if(board[0][0] == val && board[1][1] == val && board[2][2] == val)
		{
			return 1;
		}
		
		if(board[2][0] == val && board[1][1] == val && board[0][2] == val)
		{
			return 1;
		}
		
		return 0;
	}
	
	
	public static void printFooter(int X)
	{
		if(X == 1)
		{
			System.out.println("User WINS YAYYAYAYAYYAYAYYAYA");
		}else
		{
			System.out.println("Bot WINS booooooooo :(");
		}
	}
	
}
