class Ascending1
{
	  private int a[]=new int[5];
	
		
	public void get(int a[])
{
	a[]=a;
}
	public void show()
{
	System.out.println("\na[]:"+a);
}
	public void call()
{
	int i,j,temp=0;
	for(i=0;i<5;i++)
{
	for(j=i+1;j<5;j++)
{
	
	if(a[i]>a[j])
{

	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
}
}
class AscendingEx
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Ascending1 a1=new Ascending1();
	a1.get(a[]={1,2,3,4,5});
	a1.show();
	a1.call();
}
}		
