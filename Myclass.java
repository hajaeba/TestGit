package mypackage;

public class Myclass {
	private int x; //x is instance variable
	  Myclass()//default constructor
	  {
		  this(55);//calls present class parameterized constructor
		  this.access();
		  System.out.println("Default constructor excuted");
	  }
	Myclass(int x) //parameterized constructor
	{
		this.x = x; 
		System.out.println("parameterized constructor excuted");
	}
	void access()//method
	{
		System.out.println("A method is excuted to print x value " );
		System.out.println("x = " +x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Myclass c = new Myclass();
	}

}
