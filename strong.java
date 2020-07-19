class strong
{
public static void main(String args[])
{
	int count=0;
	int e,temp=1,sum=0,i;
	for(int x=1;x<500;x++)
                 {
                     i=x;
                     sum=0;
                     for(;i>0;)
	   {
	      temp=1;
                       
	      e=i%10;
	      for(int j=1;j<=e;j++)
	      {
	         temp=temp*j;
	      }
	      sum=sum+temp;
                        i=i/10;
	      if(x==sum)
	     System.out.println(x+" is strong ");
                     }
                    
                    }

}
}