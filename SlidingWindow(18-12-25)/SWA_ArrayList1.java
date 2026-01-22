
import java.util.ArrayList;
import java.util.Scanner;


public class SWA_ArrayList1 {
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
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<=n-k;i++)
        {
            int s=0;
            for(int j=i;j<i+k;j++)
            {
                s=s+a[j];
            }
            res.add(s);
        }
        return res;
    }
    
}
