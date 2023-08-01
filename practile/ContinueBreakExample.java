package loops;

import java.util.Scanner;

public class ContinueBreakExample
{

	public static void main(String[] args)
	{
		// input from the user 
		Scanner sc=new Scanner (System.in);
				
				//Get the number of iterations from the user 
				System.out.println("Enter the number of iterations: ");
				
				int iterations=sc.nextInt();
				
				
			    //Perform a loop for the given number of iterations
				for(int i =1;i<=iterations;i++)
				{
					//check if the current iteration is divisible by 3
					if(i%3==0)
					{
						//skip this iteration and continue to next one
						continue;
					}
					//print the current iteration number
					System.out.println("iteration: "+i);
				 
				
				
                // print the current number 
				System.out.println(i+"");
				
			   // check if the current number is greater than or equal to 10 
				if (i>=10)
				{ 
					// break the loop if the condition is true 
					break;
				}
				 sc.close();
				}
	}

}
