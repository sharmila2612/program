public class direverse {

	
	public static void main(String[] args) {
		int a;
		if(args.length>0)
		{
		a=Integer.parseInt(args[0]);
		int r,sum=0;
		while(a!=0)
		{
			r=a%10;
			sum=sum*10+r;
			a=a/10;
		}
		System.out.println("Reverse number is: "+sum);
		}
		else
		{System.out.println("Enter a number");}
	}

}
