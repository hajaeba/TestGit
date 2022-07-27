package mypackage;
 class Class1//current object
 {
	 private int a;//instance var
	 public void Add(int x, int y)//method with local var
	 {
		 this.a = x + y;
		 System.out.println("Sum = " + (x + y));
	 }
	 public void PrintValue()//method
	 {
		 
		 System.out.println("The value of instance variable a: "+a);
	 }
 }
public class Test {
  public static void main(String[] args)
  {
	  Class1 c = new Class1();
	  c.Add(10, 20);
	  c.PrintValue();
  }
}
