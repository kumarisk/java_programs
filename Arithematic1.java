class  Arithematic1
{
	public static void main(String args[])
{	
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	
	switch(c)
{
	case 1:System.out.println("Addition="+(a+b));
		break;
	case 2:System.out.println("Substraction="+(a-b));
		break;
	case 3:System.out.println("Multiplication="+(a*b));
		break;
	case 4:System.out.println("Division="+(a/b));
		break;
	case 5:System.out.println("Mod="+(a%b));

		break;
	
	default:System.out.println("choice Invalid");
		break;
		}
		}	
		}