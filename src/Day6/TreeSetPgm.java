package Day6;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating and adding elements
		TreeSet<String> al=new TreeSet<String>();
		al.add("Rajendra");
		al.add("Amit");
		al.add("Ravi");
		al.add("Technolamror");  
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}

}
