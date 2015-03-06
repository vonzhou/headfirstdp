package composite.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map2 = new TreeMap<String, String>();
		map2.put("A", "Wuhan");
		map2.put("B", "Beijing");
		////////
		map.putAll(map2);
		
		
		List<String> list = new ArrayList<String>();
		Set<String> s = new HashSet<String>();
		list.addAll(s);
	}

}
