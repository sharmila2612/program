public class positive {

	
	public static void main(String[] args) {
		int a;
		if(args.length>0)
		{
			a=Integer.parseInt(args[0]);
			if(a==0)
			{
				System.out.println("The number is zero");
			}
			else if(a>0)
			{
				System.out.println(a+" is positive");
			}
			else
			{
				System.out.println(a+" is negative");
			}
		}
		else
		{
			System.out.println("Enter a number");
		}
	}

}
