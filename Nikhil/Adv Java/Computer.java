public class Computer
{
	public int a;
	public Computer()
	{
		a=10;	
		System.out.println("Constructor of computer class");
	}
	public void computer_method()
	{
		System.out.println("power gone! shut down ur PC...");
	}	
	public static void main(String args[])
	{
		Computer my=new Computer();
		my.computer_method();
		
		Laptop ur=new Laptop();
		ur.laptop_method();
	}
}

public class Laptop
{
	public Laptop()
	{
		Computer my=new Computer();
		this.a=my.a;
		System.out.println("Constructor of laptop class = "+this.a);
	}
	public void laptop_method()
	{
		System.out.println("99% battery available...");
	}
}