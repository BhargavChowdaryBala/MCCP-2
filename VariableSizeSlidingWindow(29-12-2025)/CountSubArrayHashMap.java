import java.util.*;
public class CountSubArrayHashMap {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int arr[]={10,5,2,7,1,-10,7,6,4,2};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int psum=0;
        int n=10,target=15,c=0;
        for(int i=0;i<n;i++)
        {
            psum=psum+arr[i];
            if(psum==target)
            {
                c++;
            }
            else if(hm.containsKey(psum-target))
            {
                
                c=c+hm.get(psum-target);
            }
            hm.put(psum,hm.getOrDefault(psum,0 )+1);

        }
        System.err.println(c);
    }
    
}
