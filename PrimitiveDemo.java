package mypackage;
// call by value changes made to the method 
//are not permanent
 class Check
 {
	 //to interchange num1 and num2 variables
	 void swap(int num1, int num2)
	 {
		 int temp;
		 temp = num1;//call by value 
		 num1 = num2;
		 num2 = temp;
		 System.out.println("Num1= "+num1 + ", Num2 = " +num2);
	 }
 }
public class PrimitiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //two primitive data types
		int num1 = 10;
		int num2 =20;
		Check ch = new Check();
		System.out.println("Num1= "+num1 + ", Num2 = " +num2);
		ch.swap(num1, num2);
		System.out.println("Num1= "+num1 + ", Num2 = " +num2);
	}

}
