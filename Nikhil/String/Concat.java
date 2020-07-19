class Concat
{
  public static void main(String args[])
    {
	  String F_name="Ajay";
	  String M_name="Vijay";
	  String L_name="Gaddam";
	  int age=56;
	  String s1=F_name.substring(0,1);
	  String s2=M_name.substring(0,1);
	  String s3=L_name.substring(0,1);
	 
	  String s4=s1+s2+s3;
	  String s5=s4.toLowerCase();
	  String password=s5+age;
	  System.out.print("password="+password);
	}
	 
}