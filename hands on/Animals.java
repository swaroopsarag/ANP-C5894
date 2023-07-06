package oops;

 class Animals 
 {
 String name;
 public void eat ()
 {
	 System.out.println( "Animal Eat");
   
 }
 }
 

 class Dogs extends Animals
 { 
	 public void sound ()
	 {
		 System.out.println("Dog Barks");
		 
	  }
 }
   
 class Puppy extends Dogs 
 { 
	 public void colour()
	 {
		 System.out.println("Black & White ");
		 
	 }
 }
 
 
	class Animalsmain 
	{ 
		public static void main (String[]args)
		
		{ 
			Puppy p=new Puppy();
			 
	p.name ="cookie";
	p.eat();
	p.sound();
	p.colour();
		}
	}
 
	
					
		
	
 
 
 
 
 
 
	


