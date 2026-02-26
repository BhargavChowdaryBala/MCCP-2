import java.util.*;
public class RemainingGoldCoinusingpriorityqueue {
    public static void main(String[] args) {
        int arr[] = {9,2,1,7,8};
        int n = arr.length;
        int ans = remainingGold(arr, n);
        System.out.println("Remaining gold coin: " + ans);
        
    }
    static int remainingGold(int bag[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(bag[i]);
        }
        while (pq.size() > 1) {
            int v1 = pq.poll();
            int v2 = pq.poll();
            if (v1 != v2) {
                pq.add(v1 - v2);
            }
        }
        if(pq.isEmpty())    return 0;
        return pq.poll();
    }
    
}
