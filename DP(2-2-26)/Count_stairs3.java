import java.util.Scanner;
public class Count_stairs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=countStairs3_1(n);
        System.out.println(ans);
    }
    public static int countStairs3_1(int n){
        if (n == 1) return 1;   
        else if (n == 2) return 2;   
        else if (n == 3) return 4;   
        else return countStairs3_1(n - 1) + countStairs3_1(n - 2)+countStairs3_1(n-3);
        

    }
}
