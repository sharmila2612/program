public class firstrep {

	
	public static void main(String[] args) {
		
		int[] a={5,3,4,5,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]==a[j])
				{
	      	        break;
				}
				System.out.println(a[i]);
				break;
			}
			break;
		}
   	}

}
