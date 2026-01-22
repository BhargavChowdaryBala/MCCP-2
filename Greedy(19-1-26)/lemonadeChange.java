

public class lemonadeChange {
    public static void main(String[] args) {
        int arr[]={5,5,5,10,20};
        System.out.println(canChange(arr));
    }
    static boolean canChange(int arr[]){
       if (arr[0] != 5) return false;
        int[] change = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                change[0]++;
            } else if (arr[i] == 10) {
                if (change[0] == 0) return false;
                change[0]--;
                change[1]++;
            } else { 
                if (change[1] >= 1 && change[0] >= 1) {
                    change[1]--;
                    change[0]--;
                    change[2]++;
                } else if (change[0] >= 3) {
                    change[0] -= 3;
                    change[2]++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
}
