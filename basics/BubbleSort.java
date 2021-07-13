package basics;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int a[]= {12,10,5,45,86,3,25};
		int n=a.length;
		int temp;
		System.out.println("array befor sorted:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("sorted array:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
