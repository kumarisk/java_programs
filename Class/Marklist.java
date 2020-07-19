import java.util.*;
class result
{
 private int sub1,sub2,sub3;
 private double percentage;
 public void get()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter marks of English: ");
       sub1=sc.nextInt();
       System.out.println("Enter marks of Maths: ");
       sub2=sc.nextInt();
       System.out.println("Enter marks of Science: ");
       sub3=sc.nextInt();
       percentage=(sub1+sub2+sub3)/3.0;
     }
 public void show()
    {
     percentage=(sub1+sub2+sub3)/3.0;
     System.out.println("English="+sub1);
     System.out.println("Maths="+sub2);
     System.out.println("Science="+sub3);
     System.out.println("percentage="+percentage);  
     }
}
class Marklist 
{
public static void main(String args[])
{
result r=new result();
r.get();
r.show();
}
}