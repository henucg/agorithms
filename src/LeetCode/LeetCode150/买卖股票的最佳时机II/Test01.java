package LeetCode150.买卖股票的最佳时机II;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{7,6,4,3,1}));
	}

	public static int maxProfit(int[] prices) {
		if (prices==null || prices.length==1){
			return 0 ;
		}

		int maxProit = 0 ;
		for(int i=1;i<prices.length;i++){
			if(prices[i]-prices[i-1]>0){
				maxProit += prices[i]-prices[i-1] ;
			}
		}

		return maxProit ;
	}
}
