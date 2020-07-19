class EqualTo
{
  public static void main(String args[])
   {
          String s1="abc";
          String s2="abc";
          String s3=new String("abc");
          String s4=new String("abc");
           if(s1==s2)
             System.out.println("\nBoth are at same location");
          else
            System.out.println("\nBoth are at different location");

          if(s3==s4)
             System.out.println("\nBoth are at same location");
          else
            System.out.println("\nBoth are at different location");
    }
}