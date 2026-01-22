public class NegativeInteger {
    public static void main(String[] args) {
        int arr[]={-3,-2,-5,-8,-6,6,4,9,-3};
        int n=arr.length;
        int k=3;
        int res[]=negativeFirst(arr,n,k);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");  
        }
    }
    public static int[] negativeFirst(int[] a,int n,int k)
    {
        int res[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++)
        {
            res[i]=0;
            for(int j=i;j<i+k;j++)
            {
                if(a[j]<0)
                {
                    res[i]=a[j];
                    break;
                }
            }          
        }
        return res;
    }
    
}
