
public class even {

	
	public static void main(String[] args) {
		int a;
		if(args.length>0)
		{
			a=Integer.parseInt(args[0]);
			if(a%2==0)
			{
				System.out.println(a+" is a even number");
			}
			else
			{
				System.out.println(a+" is a odd number");
			}
		}
		else
		{
			System.out.println("Enter a number");
		}
	}

}
