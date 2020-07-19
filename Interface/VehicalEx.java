/*Assigning Reference to Interface object(Dynamic method dispatching=>Dymanic Polymorphism)*/
interface Vehical
{
   public void drive();
}
class Solapur implements Vehical
{
     public void drive()
	 {
		 System.out.println("Driving Vehical in Solapur");
		
	 }
}
class Mumbai implements Vehical
{
	public void drive()
	{
		System.out.println("Driving Vehical in Mumbai");
    }
}
class Pune implements Vehical
{
	public void drive()
	{
		System.out.println("Driving Vehical in Pune");
	}
}
class VehicalEx
{
	public static void main(String args[])
	{
		Vehical v;
		v=new Pune();
		v.drive();
		v=new Solapur();
		v.drive();
		v=new Mumbai();
		v.drive();
	}
}