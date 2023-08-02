package com.java.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestDS {

	public static void main(String[] args) {
		
		//List<Integer> list=new LinkedList<>();
//		list.add(14);
//		list.add(12);
//		list.add(13);
//		list.add(14);
//		
		Set<Integer> set=new TreeSet<>();
		set.add(14);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(9);
		set.add(33);
		
		for(Integer x:set)
		{
			System.out.println(x);
		}
	}
	
}
