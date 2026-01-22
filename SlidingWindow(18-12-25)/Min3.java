
import java.util.Scanner;


public class Min3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }
        int res = maxSum(arr,n,k);
        System.out.print("min value is : "+res);
       
    }
    public static int maxSum(int[] a,int n,int k)
    {
        int res[]=new int[n-k+1];
        int s=0;
        for(int i=0;i<k;i++)
        {
            s=s+a[i];
        }
        res[0]=s;
        for(int i=k;i<n;i++)
        {
            s=s+a[i];
            s=s-a[i-k];
            res[i-k+1]=s;
        }
        int min=res[0];
        for(int i=1;i<res.length;i++)
        {   
            if(res[i]<min) min=res[i];
        }
        return min;
    }
    
}
