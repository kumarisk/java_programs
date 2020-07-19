class diginum
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int count=0;
for(;i>0;)
{
i=i/10;
count++;
}
System.out.println("the num of digits are "+count);
}
}