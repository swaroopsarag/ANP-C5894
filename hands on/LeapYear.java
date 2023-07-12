package loops;

import java.util.Scanner;

public class LeapYear
{

	public static void main(String[] args)
	{
		//scanner class to take input from the user 
 Scanner l=new Scanner(System.in);
 System.out.println("Enter Year");
//integer input from the user 
 int y=l.nextInt();
//condition
 if (y%4==0) 

 {
	 System.out.println("Leap Year");
	 
	 
 }
 
 else if (y%100==0)
 {
	 System.out.println("Divisible by 100");
	  
	 
 }
 else if (y%400==0)
 {
	 System.out.println("Divisible by 400");
 }
 
 else
 {
	 System.out.println("not leap year");
 }
 
l.close();	}

}
