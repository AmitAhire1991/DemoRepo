package TryCatchBlock;

public class TryCatchDemo {
	
	

	public static void main(String[] args) {
		int i =9;
		int j =0;
		
		try
		{
			int k =i/j;
			System.out.println("Error caught");
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("big num erorr");
		}
		catch(Exception e) {
			System.out.println("Errort");
			
					}
		
		
		
		
		

	}

}
