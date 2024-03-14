package Day6;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> al=new LinkedHashSet<String>();
		al.add("Rajendra");
		al.add("Raja");
		al.add("Ravi");
		al.add("Technolamror");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
