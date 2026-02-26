import java.util.*;
public class Addmicetoholes {
    public static void main(String[] args) {
        int m[] = {4, -4, 2};
        int h[] = {0, -2, -6};
        int n = m.length;
        int time = minTime(m,h, n);
        System.out.println("Minimum time to put all mice in h: " + time);
    }

    static int minTime(int m[], int h[], int n) {
        Arrays.sort(m);
        Arrays.sort(h);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, Math.abs(m[i] - h[i]));
        }
        return ans;
    }
    
}
