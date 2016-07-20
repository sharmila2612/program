public class alpha {

	
	public static void main(String[] args) {
		char a ;
		a=args[0].charAt(0);
		if(args.length>0)
		{
			if(a>='a' && a<='z' || a>='A' && a<='Z')
			{
				System.out.println(a+" is an alphabet");
			}
			else
			{
				System.out.println(a+" is not an alphabet");
			}
		}
		else
		{
			System.out.println("Enter an alphabet");
		}

	}

}
