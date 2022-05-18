
public class MultiDimentionArray {
	
	public static void main(String[] args) {
		
	int i=0;
	int j=0;
	//This is the easiest way to declared an Array
	int a[][] = {{1,2,3},{4,5,6}};
	
	//System.out.println(a[1][2]);
	
	
	//Second way to declared multidimention array
	//a[row][column]
	int b[][] =new int[2][3];
	b[0][0]=2;
	b[0][1]=3;
	b[0][2]=4;
	b[1][0]=5;
	b[1][1]=6;
	b[1][2]=7;
	
	for(i=0;i<2;i++)
	{
		for(j=0;j<3;j++)
		{
			System.out.print(b[i][j]);
			System.out.print("\t");
		}
		System.out.println(" ");
	}
	
	//System.out.println(b[1][2]);
	
	
	}
	
}
