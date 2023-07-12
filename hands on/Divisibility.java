package loops;

import java.util.Scanner;

public class Divisibility
{

	public static void main(String[] args)
	{
		//scanner class to take input from the user 
    Scanner s=new Scanner(System.in);
    
		System.out.println("Enter Value");
		//integer input from the user 
		int d=s.nextInt();
		//condition
	if (d%2==0&&d%3==0)
		
	{
		System.out.println("divisible by 2 & 3");
	}
	else if (d%3==0)
	{
		System.out.println("divisible by 3");
		
	}
	else if (d%2==0)
	{
		System.out.println("divisible by 2");}
			
		
		
	
	else { System.out.println("not divisible by 2 & 3");
	}
	
	
      s.close();

	}
	
}

