package file;

import java.io.File;

/**
 * Java删除目录a下（不包括a）所有文件方法
 * @author cg
 *
 */
public class Test01 {

	public static void main(String[] args) {
		try {
			File file = new File("/Users/cg/Desktop/a") ;
			delFile(file) ;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delFile(File file) throws Exception {
		if(file.exists() && file.isDirectory()) {
			File[] files = file.listFiles() ;
			if(files.length == 0) {	//目录下没有其他文件，直接删除
				file.delete() ;
			}else {
				for(File f:files) {
					delFile(f) ;
					f.delete() ;
				}
			}
			//同时删除a
			//file.delete() ;
		}else if(file.exists() && !file.isDirectory()) {
			file.delete() ;
		}else {
			System.out.println("目录是否存在：" + file.exists() + "，是否是目录：" + file.isDirectory()); 
		}
	}
}
