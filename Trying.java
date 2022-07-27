package mypackage;
 class MyWay
 {
	 private String name;
	 private int age;
	 public void setName(String n)
	 {
		 name =n;
	 }
	 public void setAge(int a)
	 {
		 age =a;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public int getAge()
	 {
		 return age;
	 }
 }
public class Trying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   MyWay m = new MyWay();
   m.setName("haju");
   m.setAge(35);
   System.out.println("my name is " +m.getName());
   System.out.println("my age is " +m.getAge());
	}

}
