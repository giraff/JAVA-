package Practice1;
import java.util.HashMap;
import java.util.Set;
import java.util.*;
public class Hashtable<K,V> {

	HashMap<K,V> map=new HashMap<K,V>();
	Set<K> Ids=map.keySet();
	public void put(K key,V val) {
		map.put(key,val);
		
	}
	public V search(K key) {
		V value=map.get(key);
		return value;
	}
}


