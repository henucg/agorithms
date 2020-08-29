package tools.序列化.test01.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class User {

	@XStreamAlias("username")
	private String username ;
	@XStreamAlias("age")
	private int age ;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
