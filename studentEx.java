/*copy the information of one student into another student using copy constructor*/
class student
{
private String name;
private int roll;
public student(String nm,int r)
{
   name=nm;
   roll=r;
}
public student(student s1)
{
name=s1.name;
roll=s1.roll;
}
public void show()
{
System.out.print("name="+name+"\troll"+roll);
}
}
class studentEx
{
public static void main(String args[])
{
student s1=new student("ajay",10);
student s2=new student(s1);
System.out.print("Data of s1:\n");
s1.show();
System.out.print("Data of s2:\n");
s2.show();
}
}