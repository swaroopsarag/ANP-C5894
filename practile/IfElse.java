package loops;

import java.util.Scanner;

//simple ifElse program

public class IfElse 
{

	public static void main(String[] args)
	{
		
//scanner class to take input from the user 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		
		//integer input from the user 
		int a=s.nextInt();
		
		
		//condition
		if (a>=18)
		{
			System.out.println("Eligible for voting");
			
		}
		else 
		{
		System.out.println("not Eligible for voting");	
		}
		s.close();
	}
}


