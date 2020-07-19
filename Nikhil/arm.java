import java.util.*;
class arm
{
     public static void main(String args[])
     {
	int r,sum=0,no,temp;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any no");
                no=sc.nextInt();
	temp=no;
	while(no>0)
	{
		r=no%10;
		sum=sum+(r*r*r);
		no=no/10;
	}
	if(temp==sum)
	System.out.print(temp+" is armstrong");
	else
	System.out.print(temp+" is not armstrong");
     }
}
