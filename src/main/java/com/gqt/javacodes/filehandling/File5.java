package com.gqt.javacodes.filehandling;

import java.util.ArrayList;

public class File5 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sachin");
		al.add("dhoni");
		al.add("rohit");
		al.add("virat");
		al.add("bumrah");
		System.out.println(al);
		int count=0;
		for(int i=0;i<al.size();i++) {
			if(al.get(i).length()==5) {
				count++;
			}
		}
		System.out.println(count);
}
}