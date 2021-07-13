package myproject;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		StringBuffer str= new StringBuffer("Object language");
		System.out.println("original string :"+str);
		System.out.println("length of string :"+str.length());
		for(i=0;i<str.length();i++)
		{
			int p=i+1;
			System.out.println("character at position :"+ p + " is " + str.charAt(i));
		}
		String astr= new String(str.toString());
		int pos=astr.indexOf("l");
		str.insert(pos, "Oriented ");
		System.out.println("modified string :"+str);
		//modifing character
		str.setCharAt(6, '-');
		System.out.println("string now :"+str);
		//appending string at end
		str.append(" improve security");
		System.out.println("appended string :"+str);
	}

}
