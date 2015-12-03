package collection;

public class MyMap {
	MyEntry[] arr =new MyEntry[1000];
	int size;
	public void put(Object key, Object value) {
		MyEntry e = new MyEntry(key,value);
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				arr[i].value = value;
				return;
			}
		}
		arr[size++] = e;
	}
	public Object get(Object key) {
		for (int i = 0; i < size; i++) {
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	
	public void remove(Object key){
		
	}
	
	public boolean containsKey(Object key) {
		for (int i = 0; i < size; i++) {
			
		}
		return false;
	}
	public static void main(String[] args) {
		MyMap map = new MyMap();
		map.put("assss",1);
		System.out.println(map.get("assss"));
	}
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}

class MyEntry {
	Object key;
	Object value;
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
}
