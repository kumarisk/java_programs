class palin
{
   public static void main(String args[])
   {
	int a=Integer.parseInt(args[0]);
	int sum=0,r,temp;
	temp=a;
	do
	{
		r=a%10;
		sum=sum+(r*r*r);
		a=a/10;
	}while(a>0);
	if(temp==sum)
	System.out.println(temp+" is armstrong");
	else
	System.out.println(temp+" is  not armstrong");
   }
}