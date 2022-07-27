package mypackage;

  class Person
 {
	 private String name;// instance var
	 private int age;
	 //mutator method to store data
   public void setName(String name )
   {
	   this.name = name;
   }
   public void setAge(int age)
   {
	   this.age = age;
   }
   //accessor methods to read data
   public String getName()
   {
	   return name;
   }
   public int getAge()
   {
	   return age;
   }
 }
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person p = new Person();
   p.setName("mandu");
   p.setAge(22);
   //access data from the 
   System.out.println("name = "+p.getName());
   System.out.println("Age = "+p.getAge());
   
	}

}
