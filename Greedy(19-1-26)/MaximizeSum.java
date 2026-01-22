
import java.util.*;
public class MaximizeSum {
    public static void main(String[] args) {
        int arr[]={3,5,6,1};
        System.err.println(""+maxSum(arr,arr.length));
    }
    static int maxSum(int arr[],int n){
        int res=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            res+=arr[i]*i;
        }
        return res;
    }
    
}
