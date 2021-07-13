package basics;

public class MergeSort {
	public void mrg_srt(int a[],int lb ,int ub)
	{
		int mid;
		if(lb<ub)
		{
			mid=(lb+ub)/2;
			mrg_srt(a,lb,mid);
			mrg_srt(a,mid+1,ub);
			mrg(a,lb,mid,ub);
			
		}
	}
	public void mrg(int a[],int lb,int mid,int ub)
	{
		int i,j,k;
		int b[]=new int[100];
		i=lb;
		j=mid+1;
		k=lb;
		while(i<=mid && j<=ub)
		{
			if(a[i]<a[j])
			{
				b[k]=a[i];
				i++;
			}
			else
			{
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k]=a[i];
				i++;
				k++;
			}
		}
		for(k=lb;k<=ub;k++)
		{
			a[k]=b[k];
		}
	}
}
