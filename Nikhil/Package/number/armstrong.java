package number;
public class armstrong
{
  public static void armstrong(int a)
  {
    int temp,sum=0;
	temp=a;
	while(a>0)
	  {
	     int b=a%10;
		 sum=sum+(b*b*b);
		 a=a/10;
	  }
	  if(temp==sum)
	    System.out.println(temp+" is armstrong");
	else
	    System.out.println(temp+" is not armstrong");
  }
}