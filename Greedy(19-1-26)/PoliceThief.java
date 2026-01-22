import java.util.ArrayList;

public class PoliceThief {
    public static void main(String[] args) {
        char arr[]={'p','t','t','t','t','t','p','p'};
        int n=arr.length;
        int k=2;
        System.out.println(maxCatch(arr,n,k));
    }
    static int maxCatch(char arr[],int n,int k){
        int res=0;
        int i=0,j=0;
       ArrayList<Integer> pidx=new ArrayList<>();
         ArrayList<Integer> tidx=new ArrayList<>();
         for(int b=0;b<n;b++)
         {
            if(arr[b]=='p')  pidx.add(b);
            else     tidx.add(b);
         }
         while(i < pidx.size() && j < tidx.size())
         {
            if(Math.abs(pidx.get(i)-tidx.get(j))<=k){
                res++;
                i++;
                j++;
            }
            else if(pidx.get(i)<tidx.get(j))   i++;
            else    j++;
         }
        return res;
    }
}
