package basics;

public class Numpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=5;
		System.out.println("num pyramid looks like:\n");
		for(i=1;i<=n;i++)
		{
			for(j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=(i*2)-1;j+=2)
			{
				System.out.print(j);
			}
			for(j=(i-1)*2-1;j>=1;j-=2)
			{
				System.out.print(j);
			}

			System.out.println("\n");
		}
	}

}
