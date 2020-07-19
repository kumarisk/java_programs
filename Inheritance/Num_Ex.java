/*An abstract class contains non-abstract methods*/
abstract class Number
{
   protected int no;
   public void getNo(int n)
   {
      no=n;
   }
   public abstract void show();
}
class Cube extends Number
{
    private int result;
	public void show()
	{
		result=no*no*no;
		System.out.println("\nNo="+no+"\tCube="+result);
	}
}
class Num_Ex
{
	 public static void main(String args[])
	 {
		Cube c=new Cube();
		 c.getNo(5);
		 c.show(); 
	 }
}