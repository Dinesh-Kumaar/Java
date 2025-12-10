public class StockBuySell {
    static int maxProfit(int[] prices) {
        int right_max=prices[prices.length-1];
        int res=0;
        for(int i=prices.length-2;i>=0;i--)
        {
            if(prices[i]>right_max){
                right_max=prices[i];
            }
            if(res<right_max-prices[i]){
                res=right_max-prices[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = {61, 44, 70, 78, 73, 95, 27, 1};
        System.out.println(maxProfit(prices));
    }
}
