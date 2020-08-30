package tools.XML数据转Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * XML数据转Map
 * @author cg
 *
 */

public class Test01 {
	
	public static void main(String[] args) {
		String xmlStr = 
				"<xml>"
					+"<user>"
						+"A"
						+"<name>Tom</name>"
						+"<age>10</age>"
					+"</user>"
			  +"</xml>" ;
		
		System.out.println(getDate(xmlStr));
	}

	public static Map<String,Object> getDate(String requestXML){
		Document document = null;
		Map<String,Object> map=null;

		try {
			document = DocumentHelper.parseText(requestXML);
		} catch (DocumentException e) {
			System.out.println("解析数据错误，请检查文本" + e.getMessage());
		}

		Element root = document.getRootElement();
		//子节点
		@SuppressWarnings("unchecked")
		List<Element> childElements = root.elements();

		map = new HashMap<String,Object>() ;
		//遍历子节点
		map = getAllElements(childElements,map);

		return map;
	}
	
	@SuppressWarnings("unchecked")
	private  static Map<String, Object> getAllElements(List<Element> childElements,Map<String,Object> mapEle) {
		for (Element ele : childElements) {
			mapEle.put(ele.getName(), ele.getText());
			if (ele.elements().size()>0) {
				mapEle = getAllElements(ele.elements(), mapEle);
			}
		}
		return mapEle;
	}
}
