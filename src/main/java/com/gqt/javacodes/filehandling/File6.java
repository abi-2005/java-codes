package com.gqt.javacodes.filehandling;

import java.util.ArrayList;

public class File6 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sachin");
		al.add("dhoni");
		al.add("rohit");
		al.add("virat");
		al.add("bumrah");
		System.out.println(al);
		long count =al.stream().filter(s->s.length()==5).count();
		System.out.println(count);
		}
}
