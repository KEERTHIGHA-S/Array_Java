public class Seconglargest {

	public static void main(String[] args) {
		int[] no={3,7,2,5,8,9};
	    int max1=Integer.MAX_VALUE;
	    int max2=Integer.MAX_VALUE;
	    
		System.out.println(max1);
		System.out.println(max2);
		int i=0;
		while(i<no.length)
		{
			if(no[i]<max1)
			{
				max2=max1;
				max1=no[i];
				}
			else if(no[i]<max2)
			{
				max2=no[i];
				
			}
			i++;
			
		}
System.out.println(max2);
System.out.println(max1);
	}

}