package SuperKeyword;

public class SuperChild extends SuperParent {
	
	String name = "Ahire";
	
	public SuperChild()
	{
		super();    //To call parent class constructor
		System.out.println("I am child constructor");
	}
	
	public void getdata()
	{
		System.out.println(name);
		System.out.println(super.name);  //to get parent variable
		super.getdata();   //to get parent method
	}
	
	
	public static void main(String[] args) {
		
		SuperChild sc = new SuperChild();
		sc.getdata();
		
		
	}
}
	
	