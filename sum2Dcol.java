class sum2Dcol
{
public static void main(String args[])
{
int a[][]=new int[3][3],i,j,k=0,sum;
for(i=0;i<a.length;i++)
     for(j=0;j<a[i].length;j++)
         {
           a[i][j]=Integer.parseInt(args[k]);
          k++;
         }
for(i=0;i<a.length;i++)
{
sum=0;
for(j=0;j<a[i].length;j++)
{
sum=sum+a[j][i];
}
System.out.print("\nsum of "+(i+1)+" row "+sum);
}
}
}