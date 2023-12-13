package com.wrapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//HashMap contains data as Key, Value pairs.
		//Contains only unique keys.
		//Not synchronized and no order
		//Java HashMap may have one null key and multiple null values
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("qa", "https://qa.com");
		hm1.put("uat", "https://uat.com");
		hm1.put("preprod", "https://preprod.com");
		hm1.put("prod", "https://prod.com");
		System.out.println(hm1);
		
		//hm1.remove("qa");
		//hm1.remove("uat", "test"); //this will not be removed bcz the value of uat is wrong
		//hm1.remove("uat", "https://uat.com"); //this will be removed
		//System.out.println(hm1);
		
		System.out.println(hm1.keySet());
		Set s = hm1.keySet();
		
		//for each loop
		for (String key:hm1.keySet())
		{
			System.out.println("Key is : "+key+" Value is : "+ hm1.get(key));
		}
		
		System.out.println();
		
		//using iterator
		Iterator<String> itr = s.iterator();
		while (itr.hasNext())
		{
			String key = itr.next();
			System.out.println("Key is : "+key+" Value is : "+ hm1.get(key));
		}

	}

}
