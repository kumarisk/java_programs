/*Dynamic method dispatching(dynamic polymorphism using method overiding)*/
class Animal
{
    public void travel()
    {
       System.out.print("\nAnimal Travels...");
    }
}
class Bird extends Animal
{
   public void travel()
   {
     System.out.println("\nBirds travels in air");
   }
}
class Fish extends Animal
{
    public void travel()
    {
      System.out.println("\nFish travels in sea");
   }
/*   public void show()
  { 

 }*/
}
class AnimalEx
{
    public static void main(String args[])
    {
      Animal a;
      a=new Fish();
      a.travel();
   // a.show();
      a=new Bird();
      a.travel();
   }
}
      
