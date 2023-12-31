package com.lumen.set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NaviSet {

	public static void main(String[] args) {
NavigableSet<String> set = new TreeSet<>(Arrays.asList("apple","orange","mango","grapes"));
System.out.println(set);
System.out.println(set.descendingSet());
//headset
SortedSet<String> headData = set.headSet("mango");
System.out.println(headData);
SortedSet<String> headData1 = set.headSet("mango",true);
System.out.println(headData1);
System.out.println(set.first());
System.out.println(set.last());
System.out.println(set.floor("grapes"));
System.out.println(set.floor("grape"));
System.out.println(set.ceiling("grapes"));
System.out.println(set.ceiling("orange"));
	}

}
