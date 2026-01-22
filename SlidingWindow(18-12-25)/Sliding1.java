
import java.util.Scanner;


public class Sliding1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }
        int res[] = maxSum(arr,n,k);
        for(int i:res) System.out.print(i+" ");
       
    }
    public static int[] maxSum(int[] a,int n,int k)
    {
        int res[]=new int[n-k+1];
        int s=0;
        for(int i=0;i<k;i++)
        {
            s=s+a[i];
        }
        res[0]=s;
        for(int i=1;i<=n-k;i++)
        {
            s=s+a[i+k-1];
            s=s-a[i-1];
            res[i]=s;
        }
        return res;
    }
    
}
