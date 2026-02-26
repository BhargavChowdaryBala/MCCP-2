import java.util.Scanner;
public class Count_stairs2_memoriazation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=countStairs1(n);
        System.out.println(ans);
    }
    public static int countStairs1(int n){
        if (n == 1) return 1;   
        if (n == 2) return 2;   
        int f[]=new int[n+1];
        f[1]=1;f[2]=2;
        for(int i=3;i<=n;i++){
              f[i]=f[i-1]+f[i-2];
        }
        return f[n];

    }
}
