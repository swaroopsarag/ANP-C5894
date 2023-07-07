package oops;
//Example of abstraction
abstract class AnimalsAb {

//contains abstract method
	//Abstract method does not have body 
	public abstract void sound ();
	//can contain non abstract method 
	public void sleep ()
	{
		System.out.println("Animals Sleep..");
	
	}
}
//subclass inherits Animals
class Monkey extends AnimalsAb
{
	public void sound()
	{
		System.out.println("Monkey sounds like human");
		
	}
}
class AnimalsAbMain
{
	public static void main(String[]args)
	{
		Monkey m=new Monkey();
		m.sound();
		m.sleep();
	}
}































































