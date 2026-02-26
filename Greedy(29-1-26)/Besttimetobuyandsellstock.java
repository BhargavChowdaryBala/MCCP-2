public class Besttimetobuyandsellstock {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int ans = maxProfit(prices, prices.length);
        System.out.println("Maximum Profit: " + ans);
    }
    
    static int maxProfit(int[] prices,int n) {
        int maxsofar =0;
        int maxProfit = 0;
        for(int i=n-1;i>=0;i--)
        {
            if(prices[i]>maxsofar)
            {
                maxsofar=prices[i];
            }
             if(maxsofar-prices[i]>maxProfit)
            {
                maxProfit=maxsofar-prices[i];
            }
        }
        return maxProfit;
    }
    
}