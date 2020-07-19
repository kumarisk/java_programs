class grade
{
public static void main(String args[])
{
float per=Float.parseFloat(args[0]);
if(per>=75)
System.out.println("Grade=A");
else 
  {
   if(per>=60)
System.out.println("Grade=B");
else 
{
if(per>=45)
System.out.println("Grade=C");
else 
{
if(per>=35)
System.out.println("Grade=D");
else
System.out.println("Grade=E");
}
}
}
}
}