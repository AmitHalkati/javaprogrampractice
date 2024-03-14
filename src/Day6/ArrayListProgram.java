package Day6;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist
		list.add("Rajendra");//Adding object in arraylist
		list.add("Mahendra");
		list.add("Raja");
		list.add("Technolamror");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}

	}

}
