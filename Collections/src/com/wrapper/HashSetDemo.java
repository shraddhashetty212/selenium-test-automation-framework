package com.wrapper;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hsetdemo = new HashSet<Integer>();
		hsetdemo.add(10);
		hsetdemo.add(20);
		hsetdemo.add(30);
		hsetdemo.add(40);
		hsetdemo.add(40);
		System.out.println(hsetdemo);
		
		hsetdemo.remove(10);
		System.out.println(hsetdemo);
		
		
		//print values using iterator
		Iterator itr = hsetdemo.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		//print values using for each
		for (Integer intdemo: hsetdemo)
		{
			System.out.println(intdemo);
		}
	}

}

/*
 * https://www.javadoc.io/doc/io.javaslang/javaslang/2.0.2/javaslang/collection/HashSet.html
 * 
 */
