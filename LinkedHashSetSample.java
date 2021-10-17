package setCollection;

import java.util.*;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		
		LinkedHashSet l1 = new LinkedHashSet();
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();

		l1.add(10);
		l1.add(20);
		l1.add(20.1f);
		l1.add(3.0f);
		l1.add('a');
		l1.add('r');
		l1.add(true);
		
		System.out.println("Enter the elements in List 2: ");

		
		Scanner input = new Scanner(System.in);
		int s1 = input.nextInt();
		int s2 = input.nextInt();
		int s3 = input.nextInt();
		int s4 = input.nextInt();
		int s5 = input.nextInt();
		int s6 = input.nextInt();
		int s7 = input.nextInt();
		int s8 = input.nextInt();
		
		l2.add(s1);
		l2.add(s2);
		l2.add(s3);
		l2.add(s4);
		l2.add(s5);
		l2.add(s6);
		l2.add(s7);
		l2.add(s8);
		
		
		System.out.println("Linked List 1: "+l1);
		System.out.println("Linked List 2: "+l2);


		
		

	}

}
