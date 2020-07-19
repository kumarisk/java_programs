class Person 
{
    public Person()
    {
       System.out.println("\nFrom Person class");   
    }
}
class Student extends Person
{
     public Student()
     {
       System.out.println("\nFrom Student class");
     }
}
class StudentEx
{
    public static void main(String args[])
    {
        Student s=new Student();
     }
}