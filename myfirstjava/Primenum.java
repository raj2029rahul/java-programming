package myfirstjava;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner pn = new Scanner(System.in)) {
			System.out.println("enter number to check prime or not");
			int n=pn.nextInt();
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("prime number");
			}
			else {
				System.out.println("not prime number");
			}
		}
	}

}
