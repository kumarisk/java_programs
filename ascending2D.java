class ascending2D 
{
public static void main(String args[])
{
int a[][]=new int[3][3],i,j,c,k=0,max=0,temp,r;
int b[]=new int[9],count=0;
System.out.print("2D array:\n");
for(i=0;i<a.length;i++)
     {
     for(j=0;j<a[i].length;j++) 
       {
         a[i][j]=Integer.parseInt(args[k]);
         k++;
         b[count]=a[i][j];
         count++;
         System.out.print(a[i][j]+" ");
        }
        System.out.print("\n");
      }
for(i=0;i<args.length;i++)
{
for(j=i+1;j<args.length;j++)
{
   if(b[i]>b[j])
      {
          temp=b[i];
          b[i]=b[j];
          b[j]=temp;
       }
   }
}
System.out.println("Ascending 2D:");
count=0;
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(b[count]+" ");
count++;
}
System.out.print("\n");
}
}
}