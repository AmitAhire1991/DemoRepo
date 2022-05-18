package ThisKeyword;

public class ThisDemo {
	
	int i =5;
	
	public void getdata()
	{
		int i =10;
		System.out.println(i);
		System.out.println(this.i);
		
		int c = i+this.i;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		td.getdata();
		

	}

}
