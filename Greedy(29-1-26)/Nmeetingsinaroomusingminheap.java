import java.util.Arrays;
public class Nmeetingsinaroomusingminheap {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        int count = maxMeetings(start, finish, n);
        System.out.println("Maximum number of meetings: " + count);
    }

    static int maxMeetings(int start[], int finish[], int n) {
        int a[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = start[i];
            a[i][1] = finish[i];
        }
        Arrays.sort(a, (x, y) -> x[1] - y[1]);
        int ans = 1, j = 0;
        for (int i = 1; i < n; i++) {
            if (a[i][0] > a[j][1]) {
                ans++;
                j = i;
            }
        }
        return ans;
    }
    
}
