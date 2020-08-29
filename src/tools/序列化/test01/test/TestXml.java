package tools.序列化.test01.test;

import tools.序列化.test01.model.User;
import tools.序列化.test01.serialize.SerializeInterface;
import tools.序列化.test01.xml.XmlSerialize;

public class TestXml {

	static SerializeInterface serXml = new XmlSerialize() ;
	
	public static void main(String[] args) {
		User user = new User() ;
		user.setUsername("张三");
		user.setAge(23);
		
		String xmlUser = serXml.serialize(user) ;
		User u = serXml.deserialize(xmlUser, User.class) ;
		
		System.out.println("对象序列化为XML：\n"+xmlUser);
		System.out.println("XML反序列化为对象："+u.getUsername()+"，"+u.getAge());
	}
}
