package tools.序列化.test01.json;

import com.alibaba.fastjson.JSONObject;
import tools.序列化.test01.serialize.SerializeInterface;

public class JsonSerialize implements SerializeInterface {

	public <T> String serialize(T t) {
		return JSONObject.toJSONString(t);
	}

	public <T> T deserialize(String data, Class<T> clazz) {
		return JSONObject.parseObject(data, clazz);
	}

}
