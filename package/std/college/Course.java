/*Creating sub Package*/
package std.college;
public class Course
{
     private String name;
	 private int fees;
	 public Course(String nm,int f)
	 {
	    name=nm;
		fees=f;
	 }
	 public void display()
	 {
		 System.out.println("\nName of Course:"+name);
		 System.out.println("\nFees of course:"+fees);
		 
	 }
}	 