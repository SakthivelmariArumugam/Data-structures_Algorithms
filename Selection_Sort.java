public class Selection_Sort {
    public void sort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int k=i;
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            if(min!=k)
            {
                int temp=a[k];
                a[k]=a[min];
                a[min]=temp;
            }
        }
    }
    public static void main(String args[])
    {
        int a[]={10,12,11,9,5};
        Selection_Sort s1=new Selection_Sort();
        s1.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
