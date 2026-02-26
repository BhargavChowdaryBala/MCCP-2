import java.util.Scanner;
public class Count_Stairs3_memorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=countStairs3_1(n);
        System.out.println(ans);
    }
    public static int countStairs3_1(int n){
        int f[]=new int[n+1];
        f[1]=1;f[2]=2;f[3]=4;
        for(int i=4;i<=n;i++){

                f[i]=f[i-1]+f[i-2]+f[i-3];
            }
        return f[n];
        

    }
}