package operators;

/*
The user is prompted to enter the initial value,
increment value, and decrement value. 
These values are stored in the variables value, increment, 
and decrement, respectively.
*/

import java.util.Scanner;
public class AssignmentOperatorExample
{

	public static void main(String[] args) 
	{
		// input from the user 
        Scanner sc=new Scanner(System.in);
        
        // input for the initial 
        System.out.println("Enter a initial value:");
        int value=sc.nextInt();
    
        // input for the increment value
        System.out.println("Enter a increment value:");
        int increment=sc.nextInt();
        
        // input for the decrement value
        System.out.println("Enter a decrement value:");
        int decrement=sc.nextInt();
        
        // equivalent to:value = value+increment; 
        value+=increment; //4+1=5
        System.out.println("After increment:"+value);
        
        // equivalent to:value-decrement;
        value-=decrement; //5-1=4
        System.out.println("After decrement:"+value);
        sc.close();
        
	}

}
