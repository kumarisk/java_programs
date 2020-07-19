class Number_one
{
   protected int a[]=new int[5];
   public void getNo1(int h[])
   {
      a=h;
   }
   public void showNo1()
   {
     for(int x:a)
	 System.out.print(x+" ");
   }
}
class Number_two extends Number_one
{
   protected int b[]=new int[5];
   public void getNo2(int i[])
   {
      b=i;
   }
   public void showNo2()
   {
	 System.out.print("\n");
     for(int x:b)
	 System.out.print(x+" ");
   }
}
class Result extends Number_two
{
	protected int c[]=new int[10];
	int i;
	public void getResult()
	{
		int len=a.length;
		int j=0,k,l=0;
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(k=0;k<b.length;k++)
			{
				l=0;
				for(j=0;j<a.length;j++)
					{		 
					if(b[k]==a[j])
						{		   
							l++;
						}	  
					}
				if(l==0)
				{
					c[i]=b[k];
					i++;
				}			   
			}		
    }
	public void showResult()
	{
		System.out.print("\n");
		for(int j=0;j<i;j++)
		System.out.print(c[j]+" ");
	}
}
class UnionEx
{
  public static void main(String args[])
  {
	int d[]={1,2,3,4,5};
	int e[]={5,6,7,8,9};
    Result r=new Result();
	r.getNo1(d);
	r.getNo2(e);
	r.showNo1();
	r.showNo2();
	r.getResult();
	r.showResult();
  }
}