package myfirstjava;

import java.util.ArrayList;

public class Array_List_Test {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("initial size of array :"+al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add(2,"X");
		System.out.println("after inserting element:"+al.size());
		System.out.println("array:"+al);
		al.remove(3);
		al.remove("F");
		System.out.println("after removal of elememt:"+al);
	}

}
