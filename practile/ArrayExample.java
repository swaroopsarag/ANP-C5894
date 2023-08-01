package array;
// single dimension array example 
import java.util.Scanner;

public class ArrayExample
{

	public static void main(String[] args) 
	{
		// Scanner class object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		int[] numbers=new int[size];
		
		System.out.println("Enter"+size+"integers:");
		
		for(int i=0 ;i<size ; i++ )
		{
			numbers[i]=sc.nextInt();
			
		}
		
		// display the element entered by the user 
		System.out.println("Element in the array:");
		for(int i=0;i<size;i++)
		{
			System.out.print(numbers[i]+" ");
			
		}
		
		sc.close();

	}

}
// 5-index start from 0
// 1 2 3 4 