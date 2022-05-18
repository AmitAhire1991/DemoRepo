package CollectionFrameWorkStudy;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		ArrayList<String> aa = new ArrayList<String>();
		
		aa.add("Amit");
		aa.add("Ahire");
		aa.add("Java");
		aa.add("Amit");
		
		System.out.println(aa);
		System.out.println(aa.get(2));
		
		//aa.remove(1);
	//	System.out.println(aa);
		
		System.out.println(aa.contains("Amit"));
		System.out.println(aa.indexOf("Ahire"));
		

	}

}
