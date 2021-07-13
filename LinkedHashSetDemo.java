import java.util.*;
class LinkedHashSetDemo{
	public static void main(String[] args){
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("java");
		lhs.add("c progmng");
		lhs.add("javascript");
		lhs.add("python");
		lhs.add("html");
		lhs.add("css");
		System.out.println("hashset value is:"+lhs);
	}
}
//output are in sorted order as per inserting element.
