package collection;
/**
 * 
 * @author zhangge
 *
 */
public class AdvancedMap {
	MyLinkedList[] arr =new MyLinkedList[1000]; //Map的底层结构：数组 + 链表
	int size;
	
	public void put(Object key, Object value) {
		System.out.println(key.hashCode());
		MyEntry e = new MyEntry(key, value);
		int hashcode = key.hashCode() % arr.length;
		if(arr[hashcode] == null) {
			MyLinkedList list = new MyLinkedList();
			arr[hashcode] = list;
			list.add(e);
		} else {
			arr[hashcode].add(e);
		}
	}
	public Object get(Object key) {
		int hashcode = key.hashCode() % arr.length;
		Node head = arr[hashcode].first;
		while (head != null) {
			MyEntry e = (MyEntry) head.obj;
			if(e.key.equals(key)){
				return e.value;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		MyMap map = new MyMap();
		map.put("assss",1);
		map.put("as","wer");
		map.put("as", 11111);
		map.put(1,123);
		map.put(1, 2345);
		map.put(1, "qwe");
		System.out.println(map.get("assss"));
		System.out.println(map.get("as"));
		 
		System.out.println(map.get(1));
	}
}
