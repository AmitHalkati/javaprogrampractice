package Day6;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating HashSet and adding elements
		HashSet<String> set=new HashSet<String>();
		set.add("Rajendra");
		set.add("Raja");
		set.add("Ravi");
		set.add("Technolamror");
		//Traversing elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}

}
