package com.gqt.javacodes.filehandling;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class File10 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sachin");
		al.add("dhoni");
		al.add("rohit");
		al.add("virat");
		al.add("bumrah");
		System.out.println(al);
		List<String> res=al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(res);
	}
}
