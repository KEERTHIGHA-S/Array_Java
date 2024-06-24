import java.util.*;
public class linearsearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int k=sc.nextInt();
        int a[]={10,20,30,40,50};
        int flag=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==k)
            {
                System.out.println("Element found" + a[i]);
                flag=1;
                break;
                
            }
        }
            if(flag==0)
            {
                System.out.println("Not found");
            }
        
    }
}