class Computer
{
	public Computer();
	{
		System.out.println("Constructor of computer class");
	}
	void computer_method()
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

class Laptop
{
	public Laptop()
	{
		System.out.println("Constructor of laptop class");
	}
	void laptop_method()
	{
		System.out.println("99% battery available...");
	}
}