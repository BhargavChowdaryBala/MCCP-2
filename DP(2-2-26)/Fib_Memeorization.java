
import java.util.Scanner;

public class Fib_Memeorization {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans=fib(n);
            System.out.println(ans);
          
      }
      public static int fib(int n){
            if (n == 1) return 0;  
             if (n == 2) return 1;
            int f[]=new int[n+1];
            f[1]=0;f[2]=1;
            for(int i=3;i<=n;i++){
                  f[i]=f[i-1]+f[i-2];
            }
            return f[n];

      }

}
    

