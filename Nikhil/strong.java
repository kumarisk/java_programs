import java.util.*;
class strong
{
     public static void main(String args[])
     {
	int i,r,sum=0,no,temp,fact;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any no");
                no=sc.nextInt();
	temp=no;
	while(no>0)
	{
		fact=1;
		r=no%10;
		for(i=1;i<=r;i++)
		{
			fact=fact*i;
		}
		sum=sum+fact;
		no=no/10;
	}
	if(temp==sum)
	System.out.print(temp+" is armstrong");
	else
	System.out.print(temp+" is not armstrong");
     }
}
