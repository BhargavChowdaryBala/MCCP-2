import java.util.Arrays;
class Activity 
    {
        int st,ft;
        Activity(int st, int ft) {
            this.st = st;
            this.ft = ft;
        }
    }
class Main{

    public static void main(String[] args) {
        int st[] = {1, 3, 0, 5, 8, 5};
        int ft[] = {2, 4, 6, 7, 9, 9};
        int n = st.length;
        int count = maxActivities(st, ft, n);
        System.out.println("Maximum number of activities: " + count);
    }

    static int maxActivities(int st[], int ft[], int n) {
        Activity[] a = new Activity[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Activity(st[i], ft[i]);
        }

        Arrays.sort(a, (a1, a2) -> a1.ft - a2.ft);

        int ans = 1;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (a[i].st > a[j].ft) {
                ans++;
                j = i;
            }
        }
        return ans;
    }
    
}

