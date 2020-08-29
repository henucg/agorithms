package map;

import java.util.HashMap;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>() ;
		map.put("k1", "v1") ;
		map.put("k2", "v2") ;
		
		System.out.println(map.put("k2", "v3"));
		System.out.println(map.size());
		
		map.remove("k1") ;
		
		System.out.println(map.get("k1"));
	}

}
