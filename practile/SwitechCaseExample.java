package loops;

import java.util.Scanner;

public class SwitechCaseExample

{

	    public static void main(String[] args)
	    
	    {
		// input from the user 
		Scanner sc=new Scanner(System.in);
		
        System.out.print("Enter a day(1-7):");
        int day=sc.nextInt();
        String dayname;
        
        //switch case
        switch(day)
        {
        
        case 1:
        dayname="Monday";
        //break is used to jump out of the loop
        break;
        case 2:
        dayname="Tuesday";
        //break is used to jump out of the loop 
        break;
        case 3:
        dayname="Wednesday";
        //break is used to jump out of the loop 
        break;
        case 4:
        dayname="Thursday";
        //break is used to jump out of the loop 
        break;
        case 5:
		dayname="Friday";
		//Break is used jump out of the loop
		break;
        case 6:
		dayname="Saturday";
		//Break is used jump out of the loop
		break;
        case 7:
		dayname="Sunday";
		//Break is used jump out of the loop
		break;
		default:
		dayname="Invalid";
		//break is used to jump out of the loop 
		break;
			
        }
        System.out.println("The Day is:"+dayname);
       
        sc.close();
	}
	
}
