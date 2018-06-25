package date;

/**
 *  一个人a年b月c日出生，a*b*c = 428575，计算a,b,c
 * @author cg
 *
 */

public class DateTest01 {

	public static void main(String[] args) {
		boolean isLeapYear = false ;
		for(int i=1;i<=428575;i++) {
			//判断是否是闰年
			if(i%4 == 0 && i%100 != 0 || i%400 == 0) {
				isLeapYear = true ;
			}
			
			for(int j=1;j<=12;j++) {
				int d = 0 ;
				if(j == 1 || j ==  3 || j ==  5 || j ==  7 || j ==  8 || j ==  10 || j ==  12) {
					d = 31 ;
				}else if(j == 4 || j == 6 || j == 9 || j == 11) {
					d = 30 ;
				}else if(j == 2 && isLeapYear == true) {
					d = 29 ;
				}else {
					d = 28 ;
				}
				
				for(int k=1;k<=d;k++) {
					if(i*j*k == 428575) {
						System.out.println(i + "-" + j + "-" + k);
					}
				}
			}
		}
	}
}
