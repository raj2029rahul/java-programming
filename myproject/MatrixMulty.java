package myproject;

public class MatrixMulty {

	public static void main(String[] args) {
		int sum[][]= {{0,0,0},{0,0,0},{0,0,0}};
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int mul[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"   ");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum[i][j]=sum[i][j]+a[i][k]*b[k][j];
					mul[i][j]=sum[i][j];
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mul[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
