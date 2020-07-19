/*super method in Hierarchical Inheritance*/
class A
{
	public A(String nm)
	{	    
		System.out.println("\nFrom class A:"+nm);
	}
}
class B extends A
{
	public B(String nm1,String nm2)
	{
		super(nm1);
		System.out.println("\nFrom class B:"+nm2);
	}
}
class C extends A
{
	public C(String nm1,String nm2)
	{
		super(nm1);
		System.out.println("\nFrom class C:"+nm2);
	}
}
class ABC
{
	public static void main(String args[])
	{
		System.out.println("\nFrom class B:");
		B b=new B("AAA","BBB");
		System.out.println("\nFrom class C:");
		C c=new C("AAA","CCC");
	}
}  