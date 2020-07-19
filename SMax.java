class SMax
{
    public static void main(String args[])
    {
         int a[]={60,4,78,43,20};
         int i,max=0,smax=0;
         for(i=0;i<a.length;i++)
         {
              if(max<a[i]) 
               max=a[i];
         }
         System.out.println("\nMax No:"+max);
         for(i=0;i<a.length;i++)
         {
              if(smax<a[i]&&a[i]!=max)
               smax=a[i];
         }
         System.out.println("\nSecond Max no:"+smax);
     }
}
       
  