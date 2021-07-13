package myfirstjava;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner oe = new Scanner(System.in)) {
			System.out.print("enter the number to check even or odd: ");
			int num=oe.nextInt();
			if(num%2==0)
			{
				System.out.println("it is even number");
			}
			else
			{
				System.out.println("it is odd number");
			}
		}
	}

}
