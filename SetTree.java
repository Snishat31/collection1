package setCollection;

import java.util.*;

public class SetTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("asdf");
		//ts.add('a');
	//	ts.add(123);
		//ts.add(true);
//		ts.add(23.3f);
	//	ts.add(1231432L);
	//	ts.add(34.2);
		
		
		System.out.println(" Tree Set is"+ts);
		System.out.println("Size of Tree set is "+ts.size());
		System.out.println("TreeSet conTains a "+ts.contains("asdf"));
		
		
		

	}

}
