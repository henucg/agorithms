package tools.序列化.test01.serialize;

public interface SerializeInterface {

	/**
	 * 序列化
	 * @param t
	 * @return
	 */
	public <T> String serialize(T t) ;
	
	/**
	 * 反序列化
	 * @param data
	 * @param clazz
	 * @return
	 */
	public <T> T deserialize(String data,Class<T> clazz) ;
}
