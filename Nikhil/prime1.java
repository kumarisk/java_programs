class prime1
{
    public static void main(String args[])
    {
	int a[][]=new int[3][3],j,i,k=0,count=0;
	int b[][]=new int[3][3];
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			a[i][j]=Integer.parseInt(args[k]);
			k++;
			System.out.print(a[i][j]+" ");
		}
		System.out.print("\n");
	}
	for(i=0;i<a.length;i++)
	{
			
		for(j=0;j<a[i].length;j++)
		{
			count=0;
			for(k=1;k<=a[i][j];k++)
			{
				if(a[i][j]%k==0)
				count++;
			}
			if(count==2)
		                System.out.print(" "+a[i][j]);	
		}
		
	}
    }
}