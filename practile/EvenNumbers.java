package loops;

//print sum of even numbers from 1 to 100

public class EvenNumbers 
{

	public static void main(String[] args)
	{
		
		// numb initialized to 1 
		int num=1;
		
		// sum initialized to 0 
		int sum=0;
		
       //condition to check numb is less than equal to 100
		while(num<=100)
	{
		// if condition to check even number
			if(num%2==0)
			{
				sum+=num;
			}
			//numb is incremented by 1
			num++;
	}
		//print sum of even numbers from 1 to 100 
		System.out.println("Sum of even numbers:"+sum);
		
	}

}
