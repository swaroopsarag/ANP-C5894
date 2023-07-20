package operators;

import java.util.Scanner;

//Write a Java program that takes an integer as user input and checks if it is a positive number.

public class PositiveComparison
{

	public static void main(String[] args) 
	{
	    // input from the user
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		// comparison operators
		boolean positive=num>0;
		//boolean negative=num<0;
        //boolean neutral=num==0;
        
        // print statement
        System.out.println("Is The Number Positive?"+positive);
        //System.out.println("Is The Number Negative?"+negative);
        //System.out.println("Is The Number neutral?"+neutral);
           sc.close();
	}

}

