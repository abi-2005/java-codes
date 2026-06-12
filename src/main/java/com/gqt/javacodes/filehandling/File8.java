package com.gqt.javacodes.filehandling;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;

public class File8 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(175);
		al.add(125);
		System.out.println(al);
	List<Integer> res=al.stream().sorted().collect(Collectors.toList());
		System.out.println(res);

	}

}
