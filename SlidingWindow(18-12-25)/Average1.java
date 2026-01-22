
import java.util.Scanner;


public class Average1 {
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
        for(int i=0;i<=n-k;i++)
        {
            int s=0;
            for(int j=i;j<i+k;j++)
            {
                s+=a[j];
            }
            res[i]=s/k;
        }
        return res;
    }
    
}
