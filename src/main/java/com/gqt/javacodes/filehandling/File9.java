package com.gqt.javacodes.filehandling;

import java.util.ArrayList;
import java.util.Collections;

public class File9 {
	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("sachin");
	al.add("dhoni");
	al.add("rohit");
	al.add("virat");
	al.add("bumrah");
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
}
}
