
public class StringInJava {

	public static void main(String[] args) {
		
		//Print the String	
		String s1 ="Geeta Amit Ahire";
		System.out.println(s1);
		
		//Split the string by space
		String[] S2 = s1.split(" ");
		System.out.println(S2[0]);
		System.out.println(S2[1]);
		System.out.println(S2[2]);
		
		//Split the string by middle name
		String[] S3 = s1.split("Amit");
		System.out.println(S3[0]);
		System.out.println(S3[1]);
		System.out.println(S3[1].trim());
		
		//To print all the character of the string
		for(int y=0;y<s1.length();y++)
		{
			System.out.println(s1.charAt(y));
		}
	
		
		//To print all the character in reverse order
		for(int z=s1.length()-1;z>=0;z--)
		{
			System.out.println(s1.charAt(z));
		}
		

	}

}
