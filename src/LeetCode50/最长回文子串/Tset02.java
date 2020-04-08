package LeetCode50.最长回文子串;

public class Tset02 {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("anugnxshgonmqydttcvmtsoaprxnhpmpovdolbidqiyqubirkvhwppcdyeouvgedccipsvnobrccbndzjdbgxkzdbcjsjjovnhpnbkurxqfupiprpbiwqdnwaqvjbqoaqzkqgdxkfczdkznqxvupdmnyiidqpnbvgjraszbvvztpapxmomnghfaywkzlrupvjpcvascgvstqmvuveiiixjmdofdwyvhgkydrnfuojhzulhobyhtsxmcovwmamjwljioevhafdlpjpmqstguqhrhvsdvinphejfbdvrvabthpyyphyqharjvzriosrdnwmaxtgriivdqlmugtagvsoylqfwhjpmjxcysfujdvcqovxabjdbvyvembfpahvyoybdhweikcgnzrdqlzusgoobysfmlzifwjzlazuepimhbgkrfimmemhayxeqxynewcnynmgyjcwrpqnayvxoebgyjusppfpsfeonfwnbsdonucaipoafavmlrrlplnnbsaghbawooabsjndqnvruuwvllpvvhuepmqtprgktnwxmflmmbifbbsfthbeafseqrgwnwjxkkcqgbucwusjdipxuekanzwimuizqynaxrvicyzjhulqjshtsqswehnozehmbsdmacciflcgsrlyhjukpvosptmsjfteoimtewkrivdllqiotvtrubgkfcacvgqzxjmhmmqlikrtfrurltgtcreafcgisjpvasiwmhcofqkcteudgjoqqmtucnwcocsoiqtfuoazxdayricnmwcg"));
	}

	public static String longestPalindrome(String s) {
		if(s==null){
			return null ;
		}
		if("".equals(s)){
			return "" ;
		}

		int length = s.length() ;
		for(int i=length;i>0;i--){
			for(int j=0;(j<length && j+i<=length);j++){
				String s1 = s.substring(j,j+i) ;
				if(s1.length()==i){
					if(isPS(s1)){
						return s1 ;
					}
				}else{
					break ;
				}
			}
		}

		return "" ;
	}

	public static boolean isPS(String s){
		if(s==null){
			return false ;
		}
		if("".equals(s)){
			return true ;
		}

		char[] arrayA = s.toCharArray();
		int top = 0;
		int end = arrayA.length-1;
		while(top < end){
			if(arrayA[top++] != arrayA[end--]) {
				return false;
			}
		}
		return true;
	}
}
