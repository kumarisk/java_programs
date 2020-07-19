import java.util.*;
class fact
{
     public static void main(String args[])
     {
	int fact=1,no;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any no");
                no=sc.nextInt();
	for(int i=1;i<=no;i++)
	{
		fact=fact*i;
	}
	System.out.print("factorial of "+no+"="+fact);
     }
}
