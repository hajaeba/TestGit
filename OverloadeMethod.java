package mypackage;

public class OverloadeMethod 
{
	
	public void area(int b, int h) 
	{
		System.out.println("The area of triangle: "
				+ (0.5* b*h));
		
	}
	public void area(int r)
	{
		System.out.println("Area of Circle: "+(3.14*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadeMethod obj = new OverloadeMethod();
		obj.area(10, 15);
		obj.area(8);
	}

}
