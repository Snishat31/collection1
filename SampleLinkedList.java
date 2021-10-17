package setCollection;

import java.util.*;

public class SampleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l1=new LinkedList<String>();
		
		l1.add("May");
		l1.add("June");
		l1.add("July");
		l1.add("August");
		l1.add(0,"April");
		l1.add("November");
		
		l1.addLast("December");
		
		l1.addFirst("January");
		
		l1.add(1, "March");
		l1.add(1, "February");
		l1.add(8, "September");
		l1.add(9, "October");
		
		System.out.println("Linked List is : "+l1);
		
		for(int i=0;i<12;i+=2)
		{
			System.out.println("Even Linked List is : "+l1.get(i));

		}
		
		System.out.println("Linked List is : "+l1);

		
		for(int i=0;i<12;i+=2)
		{
			System.out.println("Odd Linked List is : "+l1.get(i+1));

		}
		
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println("The List is :"+itr.next());
		}
				
		System.out.println("The First month is : "+l1.peekFirst());
		System.out.println("The Last month is : "+l1.peekLast());
		
		System.out.println("The Birthday month is : "+l1.pollLast());
		
		System.out.println("The List is : "+l1);
		
		System.out.println("Check if there is December : "+l1.contains("December"));



		
		
		

	}

}
