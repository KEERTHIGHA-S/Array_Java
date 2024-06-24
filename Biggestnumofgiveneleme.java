public class Biggestnumofgivenelement {

	public static void main(String[] args) {
		int[] no = { 3, 6, 7, 2, 5, 8};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(min);
		int i = 0;
		while (i < no.length) {
			if (max < no[i]) {
				max = no[i];
			}
		
		if (min > no[i]) 
		{
				min = no[i];
				}
		i++;
		}
		System.out.println(max);
		System.out.println(min);
	}

}