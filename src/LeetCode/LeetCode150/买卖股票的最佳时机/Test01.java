package LeetCode150.买卖股票的最佳时机;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
	}

	public static int maxProfit(int[] prices) {
		if(prices==null || prices.length<2){
			return 0 ;
		}

		int minPrice = Integer.MAX_VALUE ;
		int maxProfit = 0 ;
		for(int i=0;i<prices.length;i++){
			if(prices[i]<minPrice){
				minPrice = prices[i] ;
			}else if(prices[i]-minPrice>maxProfit){
				maxProfit = prices[i] - minPrice ;
			}
		}
		return maxProfit ;
	}
}
