class data
{
private int n1,n2;
public void get(int a, int b)
{
n1=a;
n2=b;
}
public void show()
{
System.out.print("Num 1="+n1);
System.out.print("\tNum 2="+n2);
}
public data add(data d2)
{
data d1=new data();
d1.n1=n1+d2.n1;
d1.n2=n2+d2.n2;
return d1;
}
}
class data_ex2
{
public static void main(String args[])
{
data d1=new data();
data d2=new data();
d1.get(10,20);
d2.get(30,40);
System.out.print("Data in D1:");
d1.show();
System.out.print("\nData in D2:");
d2.show();
data d3=new data();
d3=d1.add(d2);
System.out.print("\nResult:");
d3.show();
}
}