import java.util.*;
public class NegativeIntegerSlidingWindowDequeue
{
    public static int[] negativeFirst(int[] a, int n, int k) 
    {
        int res[] = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int resIndex = 0;

        for (int i = 0; i < n; i++) 
        {
            if (!dq.isEmpty() && dq.peek() <= i - k) 
            {
                dq.poll();
            }

            if (a[i] < 0) 
            {
                dq.offer(i);
            }

            if (i >= k - 1) 
            {
                if (!dq.isEmpty()) 
                {
                    res[resIndex++] = a[dq.peek()];
                } 
                else 
                {
                    res[resIndex++] = 0;
                }
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
            int[] result = negativeFirst(arr, n, k);
            System.out.println(Arrays.toString(result));
        }
        
        sc.close();
    }
}