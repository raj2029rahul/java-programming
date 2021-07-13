package myfirstjava;
	import java.util.Scanner;
public class CapatalizeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence:");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		boolean foundSpace=true;
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				if(foundSpace) {
					ch[i]=Character.toUpperCase(ch[i]);
					foundSpace=false;
				}
			}
			else {
				foundSpace=true;
			}
		}
		System.out.println(new String(ch));
	}

}