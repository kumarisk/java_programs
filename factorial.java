class factorial
{
public static void main(String args[])
{
	int count=0,a=Integer.parseInt(args[0]);
	int e,temp=1,sum=0,i;
	for(int x=1;x<a;x++)
                 {
                  temp=1;
	      for(int j=1;j<=x;j++)
	      {
	         temp=temp*j;
	      }
	           System.out.println(x+" = " +temp);
                     }
                    
 }
}