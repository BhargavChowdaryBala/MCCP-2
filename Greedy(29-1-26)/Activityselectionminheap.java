import java.util.*;
class Activityselectionminheap

{
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;
       int count=maxActivities(start, finish, n);
        System.out.println("Maximum number of activities: " + count);   
    }
    static int maxActivities(int start[], int finish[], int n)
    {
       PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->x[1]-y[1]);
         for(int i=0;i<n;i++){
            pq.add(new int[]{start[i],finish[i]});
         }
        int ans=0,ftime=-1;
        while(!pq.isEmpty()){
            int[] z=pq.poll();
            if(z[0]>=ftime){
                ans++;
                ftime=z[1];
            }
        }
        return ans;
    }
}