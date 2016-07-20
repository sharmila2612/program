public class fact {

	
	public static void main(String[] args) {
		int a;
		if(args.length>0) 
		{
		a=Integer.parseInt(args[0]);
		int fact=1;
		while(a!=0)
		{
			fact=fact*a;
			a--;
		}
		System.out.println("Factorial is "+fact);
	    }
	
	    else
	    {System.out.println("Enter a number");}

}
}
