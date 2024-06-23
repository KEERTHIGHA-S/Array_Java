import java.util.*;
public class Arraydeclaration {

	public static void main(String[] args) {

		Scanner ec = new Scanner(System.in);
		System.out.println("Enter the length");
		int a = ec.nextInt();
		int[] mark = new int[a];
		int b = 0;
		int i = 0;
		while (i < a) {
			System.out.println("Enter the marks");
			mark[i] = ec.nextInt();
			b = b + mark[i];
			i++;
			}
		System.out.println(b);
		ec.close();
	}
}