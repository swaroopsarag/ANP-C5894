package loops;

import java.util.Scanner;

/* Write a Java program that takes an integer as input and checks if it is divisible by 5 and 11.
  Print "Divisible" if it is divisible by both, and "Not Divisible" otherwise.*/
 
public class Divisible
{
	//scanner class to take input from the user 
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Divisible");
	//integer input from the user 
	int d=s.nextInt();	
	//condition
	if (d%5==0&&d%11==0)
	{
		System.out.println("Divisible by 5 & 11");
	}
	else
		{System.out.println("not divisible");
	}
     s.close();
}


}
