package oops;

class Vehicle
{ 
	public String name;
	public int year;
	
	
	public void displayInfo()
	{
		System.out.println("Brand & year of the Vehilce");
	}
}
class Car extends Vehicle 
{
	public void model()
	{ 
		System.out.println("Model of Car");
	}
}
class SportsCar extends Car 
	
{
public String topSpeed;
public String brandyear;

	public void displayInfo ()
	{
		System.out.println("Top Speed of SportsCar");
	}


class VehicleMain
{
	public static void main (String[]args)
	{
		SportsCar s=new SportsCar();
		s.name="BMW";
		{
			System.out.println("Brand Name is"+s.name);
		}
		s.topSpeed="120";
		{
			System.out.println("topSpeed is"+s.topSpeed);
		}
		
		s.brandyear="2012";	
		{ 
			System.out.println("year is "+ s.brandyear);
		}
		s.model();
		
		s.displayInfo();
		
		
		
		
    		
		
		}
	}
	
}