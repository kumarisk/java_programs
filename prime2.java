class sum
{
public static void main(String args[])
{
	int a=Integer.parseInt(args[0]);
	int sum=0,b=0,c=0;
                               	for(int i=1;i<=a;i++)
	{
		b++;
                    for(int j=1;j<=i;j++)
	 { 
                  c++;
	 }

}
sum=sum+(b*c);
b=0;
c=0;

System.out.println(sum+"Sum of n numbers");
}
}
	