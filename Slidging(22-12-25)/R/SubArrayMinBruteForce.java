import java.util.*;
public class SubArrayMinBruteForce
{
    public static int[] minBrute(int[] a, int n, int k) 
	{
        int[] res = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) 
		{
            int min = a[i];
            for (int j = 1; j < k; j++) 
			{
                if (a[i + j] < min) 
				{
                    min = a[i + j];
                }
            }
            res[i] = min;
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
            int[] result = minBrute(arr, n, k);
            System.out.println(Arrays.toString(result));
        }
        sc.close();
    }
}