package tools.导出.test01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReportServiceImpl {

	public List<User> init(){
		User user1 = new User() ;
		user1.setId(1);
		user1.setName("user1");
		user1.setAge(11);
		user1.setBirthDay(new Date());
		
		User user2 = new User() ;
		user2.setId(2);
		user2.setName("user2");
		user2.setAge(22);
		user2.setBirthDay(new Date());
		
		User user3 = new User() ;
		user3.setId(3);
		user3.setName("user3");
		user3.setAge(33);
		user3.setBirthDay(new Date());
		
		List<User> list = new ArrayList<User>() ;
		list.add(user1) ;
		list.add(user2) ;
		list.add(user3) ;
		
		return list ;
	}
	
	public void report(){
		 // 第一步，创建一个webbook，对应一个Excel文件  
        HSSFWorkbook wb = new HSSFWorkbook();  
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet  
        HSSFSheet sheet = wb.createSheet("学生表一");  
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short  
        HSSFRow row = sheet.createRow((int) 0);  
        // 第四步，创建单元格，并设置值表头 设置表头居中  
        HSSFCellStyle style = wb.createCellStyle();  
        //style.setAlignment(HSSFCellStyle..ALIGN_CENTER); // 创建一个居中格式  
  
        HSSFCell cell = row.createCell((short) 0);  
        cell.setCellValue("学号");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 1);  
        cell.setCellValue("姓名");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 2);  
        cell.setCellValue("年龄");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 3);  
        cell.setCellValue("生日");  
        cell.setCellStyle(style);  
  
        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，  
        List<User> list = init() ;
  
        for (int i = 0; i < list.size(); i++)  
        {  
            row = sheet.createRow((int) i + 1);  
            User user = (User) list.get(i);  
            // 第四步，创建单元格，并设置值  
            row.createCell((short) 0).setCellValue((double) user.getId());  
            row.createCell((short) 1).setCellValue(user.getName());  
            row.createCell((short) 2).setCellValue((double) user.getAge());  
            cell = row.createCell((short) 3);  
            cell.setCellValue(new SimpleDateFormat("yyyy-mm-dd HH:MM:ss").format(user.getBirthDay()));  
        }  
	}
}
