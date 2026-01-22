
import java.util.Scanner;


public class MinAndMax1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }
        int r = maxSum(arr,n,k);
        System.out.print("max value is "+r);
       
    }
    public static int maxSum(int[] a,int n,int k)
    {
        int res[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++)
        {
            int s=0;
            for(int j=i;j<i+k;j++)
            {
                s+=a[j];
            }
            res[i]=s;
        }
        int max=res[0];
        for(int i=1;i<res.length;i++)
        {
            if(res[i]>max) max=res[i];
        }
        int min=res[0];
        for(int i=1;i<res.length;i++)
        {
            if(res[i]<min) min=res[i];
        }
        System.err.println("min value is "+min);
        return max;
    }
    
}
