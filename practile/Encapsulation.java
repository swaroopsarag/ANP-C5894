package oops;
//Example of Encapsulation

 class Encapsulation 
 { private String name ;
 private int age ; 
 
 //get name method 
 
 
 

	public String getName() {
	return name;
}

//set name method 


public void setName(String name) {
	this.name = name;
}



public int getAge() {
	return age;
}




public void setAge(int age) {
	this.age = age;
}

}

class Main

{ 
	public static void main (String[]args)
	//creating instance of class encapsulation
{
	Encapsulation e=new Encapsulation ();
	//Setting values
	e.setName("swaroop");
	e.setAge(25);
	//print values
	System.out.println("Name is:"+ e.getName());
	System.out.println("Age is:"+ e.getAge());
}
}

	

	
	


	




	


