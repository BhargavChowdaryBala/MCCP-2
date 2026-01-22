import java.util.*;
public class MinSlidingTreeMap 
{
    public static int[] minTreeMap(int[] a, int n, int k) 
	{
        int[] res = new int[n - k + 1];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < k; i++) 
		{
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        res[0] = map.firstKey();
        for (int i = 1; i <= n - k; i++) 
		{
            int prev = a[i - 1];
            if (map.get(prev) == 1) 
			{
                map.remove(prev);
            } 
			else 
			{
                map.put(prev, map.get(prev) - 1);
            }
            int next = a[i + k - 1];
            map.put(next, map.getOrDefault(next, 0) + 1);
            res[i] = map.firstKey();
        }
        return res;
    }

    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the window size (k): ");
        int k = sc.nextInt();
        if(k > n || k <= 0) 
		{
            System.out.println("Invalid window size. k must be between 1 and n.");
        } 
		else 
		{
            int[] result = minTreeMap(arr, n, k);
            System.out.println(Arrays.toString(result));
        }
        sc.close();
    }
}