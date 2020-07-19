class Test
{   
    public final float PI=3.14f;
	private int r;
	private float aoc;
	public Test(int r)
	{
		this.r=r;
		
	}
	public void result()
	{
		aoc=PI*r*r;
		System.out.println("\nRadius="+r);
		System.out.println("\nArea of Circle="+aoc);
		//PI=3.15f;
	}
    public static void main(String args[])
	{
	     /* int a=10;
		 final int B=a*5;
		 System.out.println("\nA="+a);
		 System.out.println("\nB="+B);
		 a=a+10;
	     B=a/5;//error occures
		  */
        Test t=new Test(6);
		t.result();
	}
}