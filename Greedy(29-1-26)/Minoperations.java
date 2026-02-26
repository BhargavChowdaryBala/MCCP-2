public class Minoperations {
    public static void main(String[] args) {
        int n=5;
        int ans=minOperations(n);
        System.out.println("Minimum operations: "+ans);
    }
    
    static int minOperations(int n) {
        int count = 0;
        while (n > 0) 
        {
            if (n % 2 == 0)    n=n/2;
            else n=n-1;
            count++;
        }
        return count;
    }
    
}