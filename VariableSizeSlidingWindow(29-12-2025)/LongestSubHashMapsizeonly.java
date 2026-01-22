import java.util.*;
public class LongestSubHashMapsizeonly {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int arr[]={10,5,2,7,1,-10,7,6,4,2};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int psum=0;
        int n=10,target=15,res=0;
        for(int i=0;i<n;i++)
        {
            psum=psum+arr[i];
            if(psum==target)
            {
                int len=i+1;
                if(len>res)
                {
                    res=len;
                }
            }
            else if(hm.containsKey(psum-target))
            {
                
                int len=i-hm.get(psum-target);
                if(len>res)
                {
                    res=len;
                }
            }
            if(!hm.containsKey(psum))
            {
                hm.put(psum,i);
            }

        }
        System.out.println(res);
    }
    
}
