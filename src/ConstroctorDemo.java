
public class ConstroctorDemo {
     
	//Default constructor
	public ConstroctorDemo()
	{
		System.out.println("I am in Constructor");
	}
	
	//Method
	public void demo()
	{
		System.out.println("I am in method");
	}
	
	//Parameterized Constroctor
	public ConstroctorDemo(int i,int j)
	{
		System.out.println("I am in parameterized constructor");
		int c =i+j;
		System.out.println(c);
		
		}
	
	//Parametrized constructor with string
	public ConstroctorDemo(String ss)
		{
			System.out.println(ss);
			
		}

	public static void main(String[] args) {
		
		ConstroctorDemo cd =new ConstroctorDemo();  ///calling default constructor
		cd.demo();    //Method print
		
		ConstroctorDemo cc = new ConstroctorDemo(6,7);  //Parameterized constructor
		ConstroctorDemo hh = new ConstroctorDemo("Hello World");  //String constructor

	}

}