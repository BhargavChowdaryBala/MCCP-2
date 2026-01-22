
import java.util.Scanner;
public class CountSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,5,2,7,1,-10,7,6,4,2};
        int n=10,target=15,c=0;
        
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=i;j<n;j++)
            {
                s=s+arr[j];
                if(s==target)
                {
                    c++;
                }
            }
        }
       System.out.println(c);
    }
    
}
