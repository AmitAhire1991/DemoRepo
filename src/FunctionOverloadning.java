
public class FunctionOverloadning {

	public static void main(String[] args) {
		FunctionOverloadning aa = new FunctionOverloadning();
		aa.getdata(10);
		aa.getdata(23, 30);
		aa.getdata("Hello");
		

	}
	
	
	public void getdata(int i)
	{
		System.out.println(i);
	}
	
	public void getdata(int i,int j)
	{
		System.out.println(j);
	}
	
	public void getdata(String x)
	{
		System.out.println(x);
	}
	
	

}
