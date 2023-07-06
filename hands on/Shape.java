package oops;

 class Shape

{  
  public String name ;
  public void calculateArea()
  {
	 System.out.println("Calculating Area of the Shape");	 
  }
	 
 }
 
 class Rectangle extends Shape 
 {
	 public void calculateArea()
	 {
		 System.out.println("Calculating Area of the rectangle");
	 }
	 
 }
 class ShapeMain 
 { 
 public static void main (String[]args) {
	 
    Rectangle r=new Rectangle();
 
 r.name="Quadra";
 {
	 System.out.println("Name is"+r.name);
	
 }
      r.calculateArea();
 }
 }