package myfirstjava;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("enter first number");
			int n1=sc.nextInt();
			
			System.out.println("enter second number");
			int n2=sc.nextInt();
			
			System.out.println("enter third number");
			int n3=sc.nextInt();
			
			int n4=n1+n2+n3;
			System.out.println("fourth number after sum of all three is: "+n4);
		}
		
	}

}
