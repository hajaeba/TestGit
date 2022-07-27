package mypackage;

public class CallMethod {
     int  val = 150;// actual parameter
     int operation(int val)//formal parameter in method
     {
    	this.val = val*10/100;
    	 System.out.println("During operation value of data:"
 				+ val);//call by value
    	 return val;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallMethod d = new CallMethod();
		System.out.println("Before operation value of data:"
				+ d.val);
		d.operation(100);//call method
		System.out.println("After operation value of data:"
				+ d.val);
	}

}
