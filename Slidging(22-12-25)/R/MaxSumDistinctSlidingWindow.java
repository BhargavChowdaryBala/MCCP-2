import java.util.*;
public class MaxSumDistinctSlidingWindow 
{
    public static long maxSumDistinctSliding(int[] a, int n, int k) 
	{
        long currentSum = 0;
        long maxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < k; i++) 
		{
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            currentSum += a[i];
        }
        if(map.size() == k) 
		{
            maxSum = currentSum;
        }
        for (int i = k; i < n; i++) 
		{
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            currentSum += a[i];
            int prev = a[i - k];
            if (map.get(prev) == 1) 
			{
                map.remove(prev);
            }
			else 
			{
                map.put(prev, map.get(prev) - 1);
            }
            currentSum -= prev;
            if (map.size() == k) 
			{
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
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
            long result = maxSumDistinctSliding(arr, n, k);
            System.out.println(result);
        }
        sc.close();
    }
}