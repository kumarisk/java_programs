import java.util.*;
class StringTest1
{
	public static void main(String args[] )
	{
	  String s[]=new String[5];
	  Scanner sc=new Scanner(System.in);
 	  System.out.println("\nEnter 5 Strings:");
                for(int i=0;i<s.length;i++)
                 {
                      s[i]=sc.next(); 
                 }
                for(int i=0;i<s.length;i++)
               {
                  for(int j=0;j<s.length;j++)
                  {
                      int r=s[i].compareTo(s[j]);   
                        if(r<0)
                        {
                            String temp=s[i];
                            s[i]=s[j];
                            s[j]=temp;
                         }
                  }
	}
          System.out.println("\nString in Ascending order:");
            for(int i=0;i<s.length;i++)
               System.out.println(" "+s[i]);
      }
}