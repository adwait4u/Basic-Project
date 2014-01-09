package groceriesPkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashInHash {

	public static void main(String[] args) {
		
		//Map<String, HashMap<String, Parameters>> hm1 = new HashMap<String, HashMap<String, Parameters>>();
		Map<String, Parameters> hm2 = new HashMap<String, Parameters>();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a user");
		String name1 = in.next();
		System.out.println("Please enter next user");
		String name2 = in.next();
		System.out.println("Please enter the description of item 1");
		String desc1 = in.next();
		System.out.println("Please enter the description of item 2");
		String desc2 = in.next();
		/*
		System.out.println("Please enter the name of item 1");
		String item1 = in.next();
		System.out.println("Please enter the name of item 2");
		String item2 = in.next();*/
		
		System.out.println("Please enter the value of item 1");
		int value1 = in.nextInt();
		System.out.println("Please enter the value of item 2");
		int value2 = in.nextInt();
		
		
		
		Parameters p1 = new Parameters();
		p1.setItem(desc1);
		p1.setValue(value1);
		hm2.put(desc1, p1);
		
		Parameters p2 = new Parameters();
		p2.setItem(desc2);
		p2.setValue(value2);
		hm2.put(desc2, p2);
		
		
		System.out.println("Purchases made by "+name1);
		//System.out.println(hm2);
		
		Set set = hm2.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			String key1 = (String) it.next();
			String val1 = hm2.get(key1).toString();
			String val11 = p1.getItem(); 
			int val12 = p1.getValue();
			System.out.println(key1 +" and " + val11 +" and "+val12);
		}

	}
	
}
