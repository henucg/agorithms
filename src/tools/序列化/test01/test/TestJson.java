package tools.序列化.test01.test;

import tools.序列化.test01.json.JsonSerialize;
import tools.序列化.test01.model.User;
import tools.序列化.test01.serialize.SerializeInterface;

public class TestJson {

	static SerializeInterface serJson = new JsonSerialize() ;
	
	public static void main(String[] args) {
		User user = new User() ;
		
		user.setUsername("张三");
		user.setAge(18);
		
		String jsonUser = serJson.serialize(user) ;
		User u = serJson.deserialize(jsonUser, User.class) ;
		
		System.out.println("对象序列化："+jsonUser);
		System.out.println("反序列化为对象："+u.getUsername()+"，"+u.getAge());
	}
}
