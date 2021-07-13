package basics;

public class Mersrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,45,36,5,85,45,61,14,26};
		System.out.println("given array:");
		printarray(a);
		MergeSort ob=new MergeSort();
		ob.mrg_srt(a, 0, a.length-1);
		
		System.out.println("sorted array:");
		printarray(a);
	}
	public static void printarray(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
