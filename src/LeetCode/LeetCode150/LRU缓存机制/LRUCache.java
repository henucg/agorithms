package LeetCode.LeetCode150.LRU缓存机制;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer,Integer> {

	private int capacity ;

	public LRUCache(int capacity) {
		super(capacity,0.75F,true) ;
		this.capacity = capacity ;
	}

	public int get(int key) {
		return super.getOrDefault(key,-1) ;
	}

	public void put(int key, int value) {
		super.put(key,value) ;
	}

	protected boolean emoveEldestEntry(Map.Entry<Integer, Integer> eldest) {
		return size() > capacity;
	}
}
