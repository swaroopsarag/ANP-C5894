package loops;

/*
 1.Grade Calculator:

Prompt the user to enter a numerical grade (0-100).
Use a switch case statement to determine the corresponding letter grade based on the following scale:
90-100: A
80-89: B
70-79: C
60-69: D
0-59: F
Display the letter grade to the user.
Handle input validation to ensure the grade is within the valid range.
 */
import java.util.Scanner;
public class GradeCalculator
{

	public static void main(String args[])
	{
		// input from the user 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a numerical grade(0-100)");
		
		int marks=sc.nextInt();
		
		
		
		String grade;
		
		if (marks>100 || marks<0)
		{
			System.out.println("invalid marks");
		}
		else
		{
			
		
		switch(marks/10)
		{
		case 10:
		case 9:
		grade="A";
		break;
		
		case 8:
		grade="B";
		break;
			
		case 7:
		grade="C";
		break;
				
		case 6:
		grade="D";
		break;
				
		
		default:
		grade="F";
		break;
			
		}
		
		System.out.println("grade is "+grade);
		
		sc.close();
		
		}

	}

}
