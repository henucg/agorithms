package LeetCode.LeetCode50.整数反转;

public class Test02 {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}

	public static long reverse(int x) {
		int ans = 0;
		while (x != 0) {
			if ((ans * 10) / 10 != ans) {
				ans = 0;
				break;
			}
			ans = ans * 10 + x % 10;
			x = x / 10;
		}
		return ans;
	}
}
