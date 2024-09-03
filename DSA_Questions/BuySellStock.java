public class BuySellStock {

    public static int buySellStock(int price[]){
        int maxProfit = 0;          
        int buyPrice = Integer.MAX_VALUE;       //initialising buyPrice as infinity 
        int n = price.length;
        for(int i=0;i<n;i++){
            if(buyPrice<price[i]){                  // If buyPrice<current price
                int profit = price[i] - buyPrice;       //Calculate profit = currentPrice - BuyPrice   
                maxProfit =  Math.max(maxProfit, profit);   //maxProfit = max(current profit, maxProfit) 
            } else {
                buyPrice = price[i];        //Else update buying price by buying at lower price
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buySellStock(prices));
    }
}
