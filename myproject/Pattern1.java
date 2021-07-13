package myproject;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		int i,j,n;
		Scanner p=new Scanner(System.in);
		System.out.println("enter no of rows");
		n=p.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
				System.out.print(i);
				
			}
			System.out.println("\n");
		}
	}

}
