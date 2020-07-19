class armstrong
{
public static void main(String args[])
{
	int i=Integer.parseInt(args[0]);
	int count=0;
	int a=i,e,sum=0;
	for(;i>0;)
	{
	  e=i%10;
	  sum=sum+(e*e*e);
                    i=i/10;
}
if(a==sum)
System.out.println(a+" is strong ");
else
System.out.println(a+" is not strong ");
}
}