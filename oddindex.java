public class oddindex
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40,50,60};
        int res[]=new int[a.length/2];
        int j=1;
        for(int i=0; i<res.length; i++)
        {
            res[i]=a[j];
            j=j+2;
        }
        for(int i=0; i<res.length; i++)
        {
            System.out.println("oddIndexedValue:" + res[i]);
        }
    }
}