package StaticAndNonStatic;

public class StaticDemo {
	
	//Instance Variable as there value gets change as per object creation check line
	String name;
	String address;
	//String city;
	
	//Here City is common for all student so get ride of memory leakage we can write static keyword to city
	// and it will be common for all the object
	
	static String city ="Nashik";
	
	
	StaticDemo(String name, String address)   //Parameterized constructor
	{
		this.name=name;
		this.address=address;
		//this.city=city;
	}
	
	public void getaddress()    //normal method
	{
		System.out.println(address);
		System.out.println(address+" "+city);
		
	}
	
	public static void getcity()
	{
		System.out.println(city);
	}
	

	public static void main(String[] args) {
		StaticDemo sd = new StaticDemo("Amit", "Cidco");
		sd.getaddress();
	
		StaticDemo sd1 = new StaticDemo("Geeta", "nagar");
		sd1.getaddress();
		StaticDemo.getcity();
		
		

	}

}
