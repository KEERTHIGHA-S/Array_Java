public class arrshiftingleft
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40};
        int[] res= new int[a.length];
        int j=1;
        int i=0;
        while(i<a.length)
        {
            res[i]=a[a.length-j];
            System.out.println(res[i]);
            i++;
            j++;
            
        }
    }
}