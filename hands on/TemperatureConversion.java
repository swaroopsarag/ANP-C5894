package loops;

import java.util.Scanner;

public class TemperatureConversion
{

	    public static void main(String[] args)
	{
		// input from the user 
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Celcius to Fahrenheit");
		System.out.println("2.Celcius to kelvin");
		System.out.println("3.Celcius to Rankine");
		
		int cel=sc.nextInt();
        double ft=0.0,ct=0.0;
        
        //switch case
        switch(cel)
        
        {
        
        case 1:
        	
        System.out.println("enter temp in celcius");
        ft=sc.nextDouble();
        ct= ft*9/5+32;
        System.out.println("The conversion to Fahrenheit "+ct);
        
        //break is used to jump out of the loop
        break;
        
        case 2:
        	
        System.out.println("enter temp in celcius");
        ft=sc.nextDouble();
        ct= ft + 273.15;
        System.out.println("The conversion to kelvin "+ct);
        
        //break is used to jump out of the loop
        break;
        
        case 3:
        	
        System.out.println("enter temp in celcius");
        ft=sc.nextDouble();
        ct= ft * 1.8 + 491.67;
        System.out.println("The conversion to rankine "+ct);
        
        //break is used to jump out of the loop
        break;
            
        default :
        System.out.println("invalid");
       
        
        }
        
      
        sc.close();
        
	}

}
