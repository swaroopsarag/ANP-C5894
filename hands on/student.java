package oops;

//Example of encapsulation 

 class Student 
 { 
	private int rollno;
	private String name ;
	private int age ;
	private String address ;
	
	// getRollno method 
	
	

	public int getRollno() {
		return rollno;
	}
// setRollno method 

    public void setRollno(int rollno) {
		this.rollno = rollno;
	}
// getName method 
	

	public String getName() {
		return name;
	}

// setName method 

	public void setName(String name) {
		this.name = name;
	}

// getAge method 

	public int getAge() {
		return age;
	}

//setAge method 

	public void setAge(int age) {
		this.age = age;
	}
//getAddress method


	public String getAddress() {
		return address;
	}
// setAddress method


	public void setAddress(String address) {
		this.address = address;
	}

 }
 
class MainMethod 
{

public static void main(String[] args)
{
	//creating instance of class student 
	Student s=new Student();
	//setting values 
	s.setRollno(1); 
	s.setName("swaroop");
	s.setAge(23);
	s.setAddress("sangli");
	
	System.out.println("roll no is:"+s.getRollno());
	System.out.println("name is:"+s.getName());
	System.out.println("Age is :"+s.getAge());
	System.out.println("Address is :"+s.getAddress());

	
}


}


