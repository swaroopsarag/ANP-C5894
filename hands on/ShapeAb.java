package oops;

abstract class ShapeAb
{
public abstract void calculateArea();

public abstract void calculatePerimeter();


}
class Rectangles extends ShapeAb
{
	public void calculateArea()

	{
		System.out.println("Area of rec is ");
	}
	public void calculatePerimeter()
	{
		System.out.println("perimeter of rec is ");
	}
	
}

class Circle extends ShapeAb
{
	public void calculateArea()

	{
		System.out.println("Area of circle is ");
	}
	public void calculatePerimeter()
	{
		System.out.println("perimeter of circle is ");
	}
}
class Triangle extends ShapeAb
{
	public void calculateArea()

	{
		System.out.println("Area of tri is ");
	}
	public void calculatePerimeter()
	{
		System.out.println("perimeter of tri is ");
	}
}
class MainShapeAb
{
	public static void main(String[]args)
	
	{
	  Rectangles g=new Rectangles();
	  g.calculateArea();
	  g.calculatePerimeter();
	  
	  Circle c=new Circle();
	  c.calculateArea();
	  c.calculatePerimeter();
	  
	  Triangle t=new Triangle();
	  t.calculateArea();
	  t.calculatePerimeter();
	  
	}
	
}





