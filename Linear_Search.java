import java.util.Scanner;

public class Linear_Search {
    public static int linear(int a[],int num)
    {
        if(a.length==0)
        {
            return -1;
        }
        else {
            for (int i = 0; i < a.length; i++) {
                if (num == a[i]) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        int result=linear(a,search);
        if(result==-1)
        {
            System.out.println("The Element Not Found");
        }
        else
        {
            System.out.println("The Element is Found Index:"+result);
        }
    }
}
