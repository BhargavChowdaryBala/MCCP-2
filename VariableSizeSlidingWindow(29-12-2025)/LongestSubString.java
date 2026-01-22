
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="abcabcbb";
        int n=str.length();
        int res=0;
        for(int i=0;i<n;i++)
        {
            boolean f[]=new boolean[26];
            for(int j=i;j<n;j++)
            {
                if(f[str.charAt(j)-'a']==true)
                {
                    break;
                }
                else{
                    int len=j-i+1;
                    res=Math.max(res,len);
                    f[str.charAt(j)-'a']=true;
                }
            }
            
        }
        System.out.println(res);
    }
    
}
