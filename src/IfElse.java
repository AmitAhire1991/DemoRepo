
public class IfElse {

	public static void main(String[] args) 
	{
		
		int[] arr = {1,4,6,8,9,10,7,12,114};
		//for loop
		//Check if number is divided by 2
		for(int i=0;i<arr.length;i++)
			{
			  if(arr[i]%2==0)	
			  {
				  System.out.println(arr[i]);
			  }
			  else
			  {
				  System.out.println(arr[i] +" Number is not divided by 2");
			  }
			
			}

	}

}
