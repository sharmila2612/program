public class Home {
	
     public void name(String input){
     	 int sum=0;
     	 
     	 int l=0;
     	 String s[]=input.split(" ");
	     for(int i=0;i<s.length;i++)
	     {
	    	 l=s[i].length();
	    	sum=sum+l; 
	     }
	     int num=sum;
	     int a=0;
	     int r;	
        while(num!=0)
        {
         r=num%10;
         a=a+r;
         num/=10;
     }
      
        System.out.println(a);
     }
	public static void main(String[] args) {
	Home j=new Home();
	j.name("daily hunt");
	
	}

}
