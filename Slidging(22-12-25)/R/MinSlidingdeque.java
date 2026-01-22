import java.util.*;
public class MinSlidingdeque 
{
    public static int[] minSlidingWindow(int[] a, int n, int k) 
	{
        int[] res = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) 
		{
            if (!q.isEmpty() && q.peek() == i - k) 
			{
                q.poll();
            }
            while (!q.isEmpty() && a[q.peekLast()] >= a[i]) 
			{
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) 
			{
                res[ri++] = a[q.peek()];
            }
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
            int[] result = minSlidingWindow(arr, n, k);
            System.out.println(Arrays.toString(result));
        }
        sc.close();
    }
}