interface shape
{
public void area();
}
class circle implements shape
{
int r=4;
public void area()
{
System.out.println("A of cirlce"+(3.14*r*r));
}
}
class rectangle implements shape
{
int l=4,b=5;
public void area()
{
System.out.println("Area of rect:"+(l*b));
}
}
class square implements shape
{
int l=6;
public void area()
{
System.out.println("Area of square:"+(l*l));
}
}
class shapex
{
public static void main(String args[])
{
circle c=new circle();
c.area();
rectangle R=new rectangle();
R.area();
square s=new square();
s.area();
}
}