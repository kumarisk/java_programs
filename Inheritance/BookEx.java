  class book
{
   protected String name;
   protected float price;
   public void getBook(String nm,float pr)
   {
       name=nm;
       price=pr;  
   }
   public void showBook()
   {
     System.out.println("Book name="+name);
     System.out.println("Price of book="+price);
    }
}
class Author extends book
{
protected String A_name;
protected String mob;
   public void getauthor(String Anm,String mobile)
   {
      A_name=Anm;
     mob=mobile;  
   }
public void showauthor()
  {
    System.out.println("Author name="+A_name);
    System.out.println("Moible number="+mob);
  }
}
class Publication extends Author
{
private int year;
public void getPub(int yr)
{
year=yr;
}
public void showPub()
{
System.out.println("Year="+year);
}
}
class BookEx
{
public static void main(String args[])
{
String M="9848022338";
Publication P=new Publication();
P.getBook("AAA",120.58f);
P.getauthor("BBB",M);
P.getPub(2004);
P.showBook();
P.showauthor();
P.showPub();
}
}