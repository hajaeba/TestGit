package mypackage;

class Sample //current object
{
	//x is instance variable
	private int x;
	//a is a local variable
	//void modify(int a)//method
	void modify(int x)
	{
		this.x = x;
		 System.out.println("x = " + x);
		//x = a; a is local variable
		//System.out.println("a = " + a);
	}
	//we can access x, but not a
	
   void access()
   {
	   System.out.println("x = " + x);
	 //  System.out.println("a = " + a); error a is local var
   }
}
public class Local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Sample s = new Sample();
       s.modify(10);
       s.access();
	}

}
