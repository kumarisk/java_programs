class digit1
{
   public static void main(String args[])
   {
	int a=Integer.parseInt(args[0]);
	int i=1,sum=0,r,fact,temp;
	temp=a;
	do
	{
		r=a%10;
		fact=1;
		for(i=1;i<=r;i++)
		fact=fact*i;
		sum=sum+fact;
		a=a/10;
	}while(a>0);
	if(temp==sum)
	System.out.println(temp+" is strong ");
	else
	System.out.println(temp+" is not strong ");   
}
}