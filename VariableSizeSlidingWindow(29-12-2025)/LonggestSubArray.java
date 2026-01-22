
import java.util.Scanner;
public class LonggestSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,5,2,7,1,-10,7,6,4,2};
        int n=10,target=15,sidx=0,eidx=0,res=0;
        
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=i;j<n;j++)
            {
                s=s+arr[j];
                if(s==target)
                {
                    int len=j-i+1;
                    if(len>res)
                    {
                        res=len;
                        sidx=i;
                        eidx=j;
                    }
                }
            }
        }
        for(int i=sidx;i<=eidx;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
