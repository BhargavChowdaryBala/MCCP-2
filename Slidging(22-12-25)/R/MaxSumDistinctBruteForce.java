import java.util.*;
public class MaxSumDistinctBruteForce 
{
    public static long maxSumDistinctBrute(int[] a, int n, int k) 
	{
        long maxSum = 0;
        for (int i = 0; i <= n - k; i++) 
		{
            long currentSum = 0;
            HashSet<Integer> set = new HashSet<>();
            boolean isDistinct = true;
            for(int j = i; j < i + k; j++) 
			{
                if(set.contains(a[j])) 
				{
                    isDistinct = false;
                    break;
                }
                set.add(a[j]);
                currentSum += a[j];
            }
            if(isDistinct) 
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
            long result = maxSumDistinctBrute(arr, n, k);
            System.out.println(result);
        }
        sc.close();
    }
}