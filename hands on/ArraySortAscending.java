package array;
/*
  Write a Java program to take an 15  array of integers as input from the user and
  sort it in ascending order using any suitable sorting algorithm.
  Display the sorted array.
 */
import java.util.Scanner;

public class ArraySortAscending
{

	public static void main(String[] args) 
	{
		// Step 1: Set the dimensions of the array
        Scanner in = new Scanner(System.in);
        int n = 15;
        int arr[] = new int[n];
        
        // Step 2: Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        // Step 3: Sort the array in ascending order
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            } 
        }
        
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        in.close();
	}

}
