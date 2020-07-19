class StringTest
{
     public static void main(String args[])
    {
      String s="solapur";
       if(s.isEmpty())
       System.out.println("\nString is Empty");
       else
          System.out.println("\nString is not Empty");
       char ch=s.charAt(1);
       System.out.println("\nCh="+ch);
       char c[]=s.toCharArray();
       System.out.println("\nCharacter Array:");
       for(char x:c)
        System.out.print(" "+x);
       byte b[]=s.getBytes();
       System.out.println("\nByte Array:");
       for(byte y:b)
        System.out.print(" "+y);
    }
}
      