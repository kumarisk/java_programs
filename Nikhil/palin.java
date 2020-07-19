import java.util.*;
class palin
{
     public static void main(String args[])
     {
	int rev=0,r,no,temp;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any no");
                no=sc.nextInt();
	temp=no;
	while(no>0)
	{
		r=no%10;
		rev=rev*10+r;
		no=no/10;
	}
	if(temp==rev)
	System.out.print(temp+" is palindrome");
	else
	System.out.print(temp+" is not palindrome");
     }
}
