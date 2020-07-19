class StringDemo
{
    public static void main(String args[])
    {
       String s1="Hello";
       String s2=new String();
       String s3=new String("Solapur");
       char ch[]={'a','b','c','d','e','f','g'};
       String s4=new String(ch);
       String s5=new String(ch,2,3);
       int n[]={65,66,67,68,69,70,71,72};
       byte b[]={97,98,99,100,101,102,103,104,105};
       String s6=new String(n,3,4);
       String s7=new String(b);
       String s8=new String(b,0);
       String s9=new String(b,4,2);
       System.out.println("\nS1="+s1);
       System.out.println("\nS2="+s2);
       System.out.println("\nS3="+s3);
       System.out.println("\nS4="+s4);
       System.out.println("\nS5="+s5);
       System.out.println("\nS6="+s6);
       System.out.println("\nS7="+s7);
       System.out.println("\nS8="+s8);
       System.out.println("\nS9="+s9);
   
}
}