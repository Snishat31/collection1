package setCollection;

import java.util.*;


public class SampleTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> t1=new TreeSet<String>();
		
		t1.add("c#");
		t1.add("c++");
		t1.add("Python");
		t1.add("java");
		t1.add("jss");
		t1.add("SAP ABAP");
		
		t1.remove("c#");
		System.out.println("Tree Set is: "+t1);
		
		t1.remove("jss");
		System.out.println("Tree Set is: "+t1);

		t1.add("ASD");
		t1.add("yuo");
		t1.add("kuh");
		
		
		System.out.println(" is java there :"+t1.contains("java"));
		
		t1.clear();
		System.out.println("Tree Set is: "+t1);
		
		
	}

}
