package loops;

import java.util.Scanner;

/*Write a Java program that takes an integer as input and checks if it is positive or negative.
  Print "Positive" if the number is greater than 0, and "Negative" if it is less than 0.
  */

public class PositiveOrNegative 
{

	public static void main(String[] args)
	{
		//scanner class to take input from the user 
		Scanner s=new Scanner(System.in);

		System.out.println("Enter number");
		//integer input from the user 
		int n=s.nextInt();
		//condition
		if (n>0)
		{ 
			System.out.println("the number is positive");
		}
		else if (n<0)
		{
			System.out.println("the number is negetive");
			
		}
		else 
		{
			System.out.println(" neutral number");
		}
		s.close();
	}
}
