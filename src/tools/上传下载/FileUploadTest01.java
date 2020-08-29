package tools.上传下载;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileUploadTest01 {

	public static void main(String[] args){
		//uploadFile("") ;
	
		downloadFile("https://qyapi.weixin.qq.com/cgi-bin/media/get?access_token=5611RwTiSrrZRelWni1atA4_EBllWFwfEEaeNXYjpllMIVUTnGOqHfZW10HHl7gP&media_id=10N47uABjnHXAM-Bs3oHyzgnvtJ6NoUL3xsMUfnpjqr5jiv_xZzLFZkKnQmvGqytdOzbC95mHQB5IavGcYRNP4w") ;
	}
	
	/**
	 * 上传文件到内存
	 * @param url
	 */
	public static void uploadFile(String file){
		try{
			File f=new File(file);  
	        BufferedReader br=new BufferedReader(new FileReader(f));  
	        String line=null;  
	        while ((line = br.readLine()) != null) {  
	            System.out.println(line);  
	        }  
	        br.close();
		}catch(Exception e){
        	e.printStackTrace();
        }
	}
	
	/**
	 * 下载文件
	 * @param fileUrl
	 */
	@SuppressWarnings("resource")
	public static void downloadFile(String fileUrl){
		try{
			// 下载网络文件
	        int bytesum = 0;
	        int byteread = 0;
			
			URL url = new URL(fileUrl);
			URLConnection conn = url.openConnection();
	        InputStream inStream = conn.getInputStream();
	        FileOutputStream fs = new FileOutputStream("C:\\Users\\ge.chen\\Desktop\\哈哈.jpg");
	
	        byte[] buffer = new byte[1204];
	        while ((byteread = inStream.read(buffer)) != -1) {
	            bytesum += byteread;
	            System.out.println(bytesum);
	            fs.write(buffer, 0, byteread);
	        }
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
