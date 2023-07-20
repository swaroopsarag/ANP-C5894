package operators;
/*
Q1.Write a Java program that prompts the user to enter their age.
The program should check if the age is greater than or 
equal to 18 and print "You are an adult" if true,
or "You are a minor" otherwise.
*/
import java.util.Scanner;
public class AgeComparison
{

	public static void main(String[] args)
	{
		// input for the user
		Scanner sc=new Scanner(System.in);
		
		// print statement
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		// comparison operators in if condition
		if (age>=18)
		
		{
			System.out.println("you are an adult");
		}
		else
		{
			System.out.println("you are a minor");
		}
		sc.close();
	}

}
