public class arrmerging{
    public static void main(String[] args)
    {
        int a[]={10,20,30};
        int b[]={40,50,40,50};
        int res[]=new int[a.length+b.length];
        int j=0;
        for(int i=0; i<res.length; i++)
        {
            if(i<a.length)
            {
                res[i]=a[i];
            }
            else
            {
                res[i]=b[j];
                j++;
            }
        }
        for(int k=0; k<res.length; k++)
        {
            System.out.println(res[k]);
        }
    }
}