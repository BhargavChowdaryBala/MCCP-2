
import java.util.Scanner;

public class Count_Stairs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=countStairs(n);
        System.out.println(ans);
    }
    public static int countStairs(int n){
        if (n == 1) return 1;   
        if (n == 2) return 2;   
        return countStairs(n - 1) + countStairs(n - 2);

    }
    
}
