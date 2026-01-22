import java.util.*;
class MinPlatformusingMinheap
{
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println(min1(arr, dep, n));
    }
    static int min1(int arr[], int dep[], int n) {
        Arrays.sort(arr);
       int res=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
       
        for (int i = 0; i < n; i++) 
        {
            while(!pq.isEmpty() &&  pq.peek()<=arr[i])
            {
                pq.poll();
            }
            pq.add(dep[i]);
            res=Math.max(res,pq.size());
        }
        return res;
    }
}