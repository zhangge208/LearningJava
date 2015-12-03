package Store;

import java.util.ArrayList;
import java.util.List;

import collection.MyMap;

public class StorebyCollection {
	public static void main(String[] args) {
		MyMap map = new MyMap();
		map.put("id",0301);
		map.put("name", "zg");
		map.put("salary", 3050);
		map.put("hireDate", "2007-10");
		MyMap map1 = new MyMap();
		map1.put("id",0302);
		map1.put("name", "azg");
		map1.put("salary", 30230);
		map1.put("hireDate", "2017-10");
		MyMap map2 = new MyMap();
		map2.put("id",0303);
		map2.put("name", "zgzg");
		map2.put("salary", 30850);
		map2.put("hireDate", "2012-11");
		
		List<MyMap> list = new ArrayList<MyMap>();
		list.add(map);
		list.add(map1);
		list.add(map2);
		
		for (Object obj: list){
			System.out.println(((MyMap) obj).get("name"));
		}
	}
	
	
}
