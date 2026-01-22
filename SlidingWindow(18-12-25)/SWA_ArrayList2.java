
import java.util.ArrayList;
import java.util.Scanner;


public class SWA_ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }
        ArrayList<Integer> res = maxSum(arr,n,k);
        for(int i:res) System.out.print(i+" ");
       
    }
    public static ArrayList<Integer> maxSum(int[] a,int n,int k)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int s=0;
        for(int i=0;i<k;i++)
        {
            s=s+a[i];
        }
        res.add(s);
        for(int i=1;i<=n-k;i++)
        {
            s=s+a[i+k-1];
            s=s-a[i-1];
            res.add(s);
        }
        return res;
    }
    
}
