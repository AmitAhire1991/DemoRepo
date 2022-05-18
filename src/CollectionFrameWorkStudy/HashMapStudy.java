package CollectionFrameWorkStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(0, "Amit");
		hs.put(1, "aa");
		hs.put(22, "ss");
		hs.put(3, "dd");
		hs.put(4, "ff");
		System.out.println(hs.get(3));
		System.out.println(hs.get(1));

		Set ss = hs.entrySet();
		Iterator ff = ss.iterator();

		while (ff.hasNext()) {

		  //System.out.println(ff.next());
		  Map.Entry rr= (Map.Entry) ff.next();
		  System.out.println(rr.getKey());
		  System.out.println(rr.getValue());
		}

	}
}
