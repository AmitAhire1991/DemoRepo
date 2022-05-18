package CollectionFrameWorkStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> bb = new HashSet<String>();
		
		bb.add("Amit");
		bb.add("Geeta");
		bb.add("Amit");
		bb.add("rs");
		bb.add("fgg");
		bb.add("fggg");
		
		System.out.println(bb);
		
		//Iterator interface
		
		Iterator<String> hs =bb.iterator();
		
		while(hs.hasNext())
		{
		System.out.println(hs.next());
		}

	}

}
