
import java.util.Scanner;


public class DistributeCandy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= {8,4,3,9,2,7};
        int n=arr.length;
        System.out.println(minCandy(arr,n));
    }
    static int minCandy(int arr[],int n){
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=1;r[n-1]=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                l[i]=l[i-1]+1;
            }
            else{
                l[i]=1;
            }
        }
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1]){
                r[i]=r[i+1]+1;
            }
            else{
                r[i]=1;
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.max(l[i],r[i]);
        }
        return res;
    }
    
}
