package LeetCode150.买卖股票的最佳时机III;

/**
 * 程序有BUG，未能解决[1,2,4,2,5,7,2,4,9]
 * 	收入最大的情况
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[]{3,3,5,0,0,3,1,4}));
	}

	public static int maxProfit(int[] prices) {
		if(prices==null || prices.length==1){
			return 0 ;
		}

		int maxP1 = 0 ;
		int maxP2 = 0 ;

		int profit = 0 ;
		for(int i=0;i<prices.length-1;i++){
			if(prices[i+1]-prices[i]>0){
				profit += prices[i+1] - prices[i] ;
				if(i==prices.length-2){
					int minP = Math.min(maxP1,maxP2) ;
					if(maxP1==minP){
						maxP1 = profit ;
					}else{
						maxP2 = profit ;
					}
				}
			}else if(prices[i+1]-prices[i]<0){
				int minP = Math.min(maxP1,maxP2) ;
				if(maxP1==minP){
					maxP1 = profit ;
				}else{
					maxP2 = profit ;
				}
				profit = 0 ;
			}
		}
		return maxP1 + maxP2 ;
	}
}
