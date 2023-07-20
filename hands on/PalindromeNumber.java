package operators;

import java.util.Scanner;

/*
2.Write a Java program that prompts the user to enter a three-digit number.
 The program should check if the number is a palindrome,
  which means it reads the same forwards and backwards.
*/

public class PalindromeNumber
{

	public static void main(String[] args) 
	{
		// 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a three=digit number:");
		
        int number=sc.nextInt();
        
       // extracting the digits
        int firstDigit=number/100;
        int thirdDigit=number%10;
        
        // checking if it is a palindrome
        if (firstDigit==thirdDigit)
        
        {
        	System.out.println("The Number Is A Palindrome");
        	
        }
        
        else
        	
        {
        	System.out.println("The Number is Not a Palindrome");
        
        }
        sc.close();
	}

}
