public class vowel {

	public static void main(String[] args) {
		char a;
		if(args.length>0)
		{
			a=args[0].charAt(0);
			switch(a)
			{
			    case 'a':case 'e':case 'i':case 'o':case 'u':
			    case 'A':case 'E':case 'I':case 'O':case 'U':	
				    System.out.println(a+" character is a vowel");
				    break;
				default :
					System.out.println(a+" character is a consonant");
					break;
			}
		}
		else
		{
			System.out.println("Enter an alphabet");
		}
	}

}
