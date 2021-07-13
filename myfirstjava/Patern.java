package myfirstjava;

import java.util.Scanner;

public class Patern {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner st = new Scanner(System.in)) {
			System.out.println("enter number of rows you want to print: ");
			int row=st.nextInt();
			for(int i=0;i<=row;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
