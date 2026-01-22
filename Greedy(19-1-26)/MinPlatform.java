import java.util.Scanner;
public class MinPlatform {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int arr[]={900, 940, 950, 1100, 1500, 1800};
        int dep[]={910, 1200, 1120, 1130, 1900, 2000};
        System.err.println(min(arr,dep,n));
          
    }
    static  int min(int arr[],int dep[],int n){
        int ans=1,res=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                ans++;
                i++;
                
            }
            else{
                ans--;
                j++;
            }
            res=Math.max(res,ans);
        }
        return res;
    }
    
}
