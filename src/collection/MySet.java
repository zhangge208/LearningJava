package collection;

//import java.util.HashMap;

public class MySet {
	private  MyMap map; 
	private static final Object PRESENT = new Object();
	int size;
	public int size() {
		return map.size();
	}
	public MySet(){
		map = new MyMap();
	}
	public void add(Object obj) { 
		map.put(obj, PRESENT); //set�����ظ���������map�����ֵ�����ظ�
	}
	
	public void remove() {
		
	}
	public static void main(String[] args) {
		MySet set = new MySet();
		set.add("aaaa");
	}
}
