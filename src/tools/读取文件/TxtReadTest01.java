package tools.读取文件;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TxtReadTest01 {

	public static void main(String[] args) throws Exception {
		readTxt("C:\\Users\\chenge\\Desktop\\XT003_GC_201808_20180903105915.txt","\t",10) ;
		//writeTxt("C:\\Users\\chenge\\Desktop\\test.txt","\r\n","哈喽") ;
		
		/*StringBuffer sb = new StringBuffer() ;
		for(int i=0;i<10;i++) {
			sb.append("哈哈哈哈"+i+"\r\n") ;
		}
		
		txtFileWrite("C:\\Users\\chenge\\Desktop","XT001",sb.toString()) ;*/
	}
	
	/**
	 * 读取TXT文件内容
	 * @param filePath：文件路径
	 * @param separator：字段分隔符
	 * @param fieldNum：每行字段个数
	 */
	public static void readTxt(String filePath,String separator,int fieldNum) {
		try {
			File file = new File(filePath) ;
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file)) ;		//建立一个输入流对象
			BufferedReader br = new BufferedReader(reader) ;		//建立一个文件对象
			
			int errorCount = 0 ;
			int i = 1 ;			//错误记录行数
			String line = null ;
			double tou = 0L ;
			while((line=br.readLine())!=null) {
				String[] str = line.split(separator,-1) ;
				if(str.length == fieldNum && "1".equals(str[9])) {
					i++ ;
					tou += Double.parseDouble(str[7]) ;
				}else {
					errorCount ++ ;
					System.out.println((i++) + "    " + line);
				}
				
				//根据条件筛选
				//if("xx".equals(str[15])) {
					//writeTxt("C:\\Users\\chenge\\Desktop\\book.txt","\r\n",line) ;
				//}
			}
			
			br.close();
			reader.close();
			
			System.out.println("总条数：" + (--i) + "，错误数据条数：" + errorCount);
			System.out.println(tou);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 写入TXT文件
	 * @param filePath：文件路径
	 * @param separator：字段分隔符
	 * @param content：写入内容
	 */
	public static void writeTxt(String filePath,String separator,String content) {
		try {	
			File file = new File(filePath) ;
			file.createNewFile() ;			//创建文件
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true)) ;
			writer.write(content+separator);
			writer.flush();
			writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 写入日志文件
	 * @param filePath
	 * @param itfCode
	 * @param content
	 */
	public static void txtFileWrite(String filePath,String itfCode,String content) throws Exception {
		if(filePath==null || "".equals(filePath)) {
			throw new RuntimeException("获取日志文件存储路径失败") ;
		}else if(itfCode==null || "".equals(itfCode)) {
			throw new RuntimeException("接口代码不能为空") ;
		}else {
			BufferedWriter writer = null ;
			try {
				DateFormat df = new SimpleDateFormat("yyyyMMdd") ;
				String fileName = itfCode + "_" + df.format(new Date()) + ".txt" ;
				
				String filePathName = filePath + File.separator + itfCode + File.separator + fileName ;
				File file = new File(filePathName) ;
				File fileParent = file.getParentFile();
				
				if(!fileParent.exists()){ 
				 fileParent.mkdirs(); 
				} 
				if(!file.exists()) {
					file.createNewFile();
				}
				
				writer = new BufferedWriter(new FileWriter(file,true)) ;
				writer.write(content);
				writer.flush();
			}catch(Exception e) {
				throw new RuntimeException("写入日志文件错误") ;
			}finally {
				try {
					if(writer != null) {
						writer.close();
					}
				}catch(Exception e) {
					throw new RuntimeException("写入日志文件错误") ;
				}
			}
		}
	}
}
