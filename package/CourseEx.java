import std.Student;
import std.college.Course;
class CourseEx
{
  public static void main(String args[])
  {
      Student s=new Student(1,"BBB");
	  Course c=new Course("Java",3000);
	  s.display();
	  c.display();
  }
}

