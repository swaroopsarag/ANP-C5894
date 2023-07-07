package oops;

class PolymorphismExample
{
//2 types
//1. method over loading/compile time Polymorphism
//same method name with different parameters and return type.
	
	public int sum(int a,int b)
	{
		return a+b;
		
	}
	
	public int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	public double sum (double a,double b)
	{
		return a+b;
		
	}
}
	class PolymorphismMain
	{
		public static void main(String[] args)
		
		{
			PolymorphismExample p=new PolymorphismExample();
			
		System.out.println("The sum is:"+p.sum(10, 10));
		System.out.println(" The sum is"+p.sum(22,143,22));
		System.out.println("the sum is:"+p.sum(22.03,30.22));
		
		}
}
	//2.Method override/Runtime polymorphism
	//inheritance concept