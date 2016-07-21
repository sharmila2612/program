public class repeating {

	
	public static void main(String[] args) {
		int[] a={5,2,3,1,1};
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
			        System.out.println(a[i]);		
				}
			}
		}
        System.out.println(count);
	}

}
