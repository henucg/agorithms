package list.取出两个List不同的集合;

import java.util.Objects;

public class BeanDemo {
	private String appPackage ;
	private Long allopentime ;

	public String getAppPackage() {
		return appPackage;
	}

	public void setAppPackage(String appPackage) {
		this.appPackage = appPackage;
	}

	public Long getAllopentime() {
		return allopentime;
	}

	public void setAllopentime(Long allopentime) {
		this.allopentime = allopentime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		BeanDemo beanDemo = (BeanDemo) o;
		return appPackage.equals(beanDemo.appPackage) &&
				allopentime.equals(beanDemo.allopentime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(appPackage, allopentime);
	}
}
