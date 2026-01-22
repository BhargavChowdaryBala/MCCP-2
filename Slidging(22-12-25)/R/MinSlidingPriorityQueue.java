import java.util.*;
public class MinSlidingPriorityQueue 
{
    public static int[] minPQ(int[] a, int n, int k) 
	{
        int[] res = new int[n - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) 
		{
            pq.add(a[i]);
        }
        res[0] = pq.peek();
        for (int i = 1; i <= n - k; i++) 
		{
            pq.remove(a[i - 1]);
            pq.add(a[i + k - 1]);
            res[i] = pq.peek();
        }
        return res;
    }

    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the window size (k): ");
        int k = sc.nextInt();
        if (k > n || k <= 0) 
		{
            System.out.println("Invalid window size. k must be between 1 and n.");
        } 
		else 
		{
            int[] result = minPQ(arr, n, k);
            System.out.println(Arrays.toString(result));
        }
        sc.close();
    }
}