package com.gqt.javacodes.filehandling;

import java.util.ArrayList;

public class File13 {
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
		al.stream().forEach(i->System.out.println(i));
		al.stream().forEach(System.out::println);
		
	}
}
