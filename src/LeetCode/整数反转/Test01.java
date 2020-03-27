package LeetCode.整数反转;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}

	public static long reverse(int x) {
		if(x==0){
			return 0 ;
		}

		try {
			boolean isPosNum = true;
			if (x < 0) {
				isPosNum = false;
				x = (-1) * x;
			}

			String s = "";
			while (x != 0) {
				int a = x % 10;
				s += a;
				x = x / 10;
			}

			return isPosNum ? Integer.parseInt(s) : Integer.parseInt(s) * (-1);
		}catch(NumberFormatException e){
			return 0 ;
		}
	}
}
