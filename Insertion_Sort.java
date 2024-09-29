import java.util.*;
public class Insertion_Sort {
    public static void fun(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j-1]>a[j])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println("sorted Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The UnSorted Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        fun(a);
    }
}
