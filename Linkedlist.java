import java.util.*;
class Linkedlist{
	public static void main(String[] args){
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.add("F");
		ll.addLast("Z");
		ll.addFirst("X");
		System.out.println("Original linklist is:"+ll);
		ll.remove(3);
		ll.remove("F");
		System.out.println("after removal of linklist is:"+ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("removal of first-last linklist is:"+ll);
		String val=ll.get(2);
		ll.set(2,val +"changed");
		System.out.println("changed linklist is:"+ll);
	}
}
