import java.util.*;
class perfect
{
     public static void main(String args[])
     {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any no");
	int no=sc.nextInt();
	for(int i=1;i<no;i++)
	{
		if(no%i==0)
		sum=sum+i;
	}
	if(sum==no)
	System.out.print(no+" is perfect");
	else
	System.out.print(no+" is not perfect");
     }
}
