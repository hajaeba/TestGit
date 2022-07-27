package mypackage;


class Employee
{
	//instance variable
	int id1,id2;
	Employee(int id1,int id2)//para construtor
	{
		this.id1 = id1;
		this.id2 = id2;
	}
	
}
class Check1
{
	// to interchange employee class objects
	void swap(Employee obj)
	{
		int temp;
		temp = obj.id1;
		obj.id1 = obj.id2;
		obj.id2 = temp;
	}
	}
public class PassObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Employee obj1 = new Employee(10,20);
  
  Check1 c = new Check1();
  //display data before call
  System.out.println(obj1.id1+"\t"+obj1.id2);
  //call swap()method by passing employee objects
  c.swap(obj1);
  //display data after call
  System.out.println(obj1.id1+"\t"+obj1.id2);
  
  
  
  
  
  
  
  
  
	}

}
