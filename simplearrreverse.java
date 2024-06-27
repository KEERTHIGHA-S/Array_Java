import java.util.*;
public class simplearrreverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a=sc.nextInt();
        int k[]=new int[a];
        for(int i=0; i<a; i++)
        {
            System.out.println("Enter the" + a + "value:");
           k[i]=sc.nextInt(); 
        }
        System.out.println("Before reverse");
        for(int j=0; j<k.length; j++)
        {
            System.out.println(k[j]);
        }
        //reverse process
        int r= k.length-1;
        System.out.println("reverse");
        while(r>=0)
        {
            System.out.println(k[r]);
            r--;
        }
    }
}