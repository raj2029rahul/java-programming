package basics;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		int x=1,n=5;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				x=x*(i-k+1)/(k);
				System.out.print(" "+x);
			}
			System.out.println();
		}
	}
}
