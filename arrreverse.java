public class arrreverse
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50};
        int res[]=new int[a.length];
        int i=0;
        int k= a.length-1;
        while(i<=a.length && k>=0)
        {
            res[i]=a[k];
            i++;
            k--;
        }
        for(int j=0; j<res.length; j++)
        {
            System.out.println(res[j]);
        }
    }
}