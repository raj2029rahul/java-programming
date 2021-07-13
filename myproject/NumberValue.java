package myproject;

public class NumberValue {

	public static void main(String[] args) {
		
		int num=3;
		switch(num)
		{
		case 0:
			System.out.print("number  is 0");
			break;
		case 1:
			System.out.print("number  is 1");
			break;
		case 2:
		case 3:
		case 4:
			System.out.print("number  is 2,3,4");
			break;
		default:
			System.out.print("number  is less than 0 and greatre than 4");		
		}
	}

}
