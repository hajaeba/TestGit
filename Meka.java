package mypackage;
import java.util.Scanner;
public class Meka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner n = new Scanner(System.in);
   System.out.println("What is your name");
   String name = n.nextLine();
   System.out.println(" Hello " + name);
   System.out.println("what is your age");
   int age = n.nextInt();
   System.out.println(" your Age is " + age);
	}

}
