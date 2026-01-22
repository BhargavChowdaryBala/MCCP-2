import java.util.*;
class NegativeDequeue {
    public static void main(String[] args) {
        int[] a ={-3,-2,-5,-8,-6,6,4,9,-3};
        int n=9;
        Deque<Integer> dq = new LinkedList<>();
        int k=3;
        for(int i=0;i<k;i++){
            if(a[i]<0) dq.addLast(i);
        }
        int res[] = new int[n-k+1];
        if( dq.isEmpty()) res[0]=0;
        else res[0]=a[dq.peekFirst()];
        for(int i=k;i<n;i++)
        {
            while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
                dq.removeFirst();
            if(a[i]<0) dq.addLast(i);
            if(dq.isEmpty()) res[i-k+1]=0;
        else res[i-k+1]=a[dq.peekFirst()];
        }
        for(int x:res)
            System.out.print(x+" ");
    }
}