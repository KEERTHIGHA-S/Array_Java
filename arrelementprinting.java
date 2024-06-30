public class main
{
    public static void main(String[] args)
    {
        int a[]={1,5,7,10,15};
        int s=0;
        while(s<a.length-1)
        {
            int n1=a[s];
            int n2=a[s+1];
            int small=n1<n2?n1:n2;
            int big=n1>n2?n1:n2;
            for(int i=small+1;i<big;i++)
            {
                System.out.println(i);
            }
            s++;
     }   

    }
    }