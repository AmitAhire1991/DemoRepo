
public class NestedForLoop {

	public static void main(String[] args) 
	{
	    int k=0;
		for(int i=1;i<5;i++)
	  {
		
		  for(int j=1;j<=5-i;j++)
		  {
			  System.out.print( k);
			  System.out.print("\t");
			  k++;
			  
			 
		  }
		  System.out.println("");
		  
		  
	  }
	}

}
