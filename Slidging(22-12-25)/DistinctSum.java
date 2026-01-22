
import java.util.HashMap;


public class DistinctSum {
    public static void main(String[] args) {
        int arr[]={1,1,1,7,8,9};
        int n=7,k=3;
        int res=distinctSum(arr,n,k);
        System.out.println(res);    
    }
    public static int distinctSum(int[] arr,int n,int k)
    {
        int max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();   
        for(int i=0;i<k;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
            else break;
        }
        if(hm.size()==k)
        {
            for(int i:hm.keySet())
            {
                max+=i;
            }
        }
       for(int i=1; i<=n-k; i++) {
            int outgoing = arr[i-1];
            hm.put(outgoing, hm.get(outgoing)-1);
            if(hm.get(outgoing) == 0) hm.remove(outgoing);

            int incoming = arr[i+k-1];
            hm.put(incoming, hm.getOrDefault(incoming,0)+1);

            if(hm.size() == k) {
                int sum = 0;
                for(int val : hm.keySet()) sum += val;
                max = Math.max(max, sum);
            }
        }
        return max;

    }
    
}
