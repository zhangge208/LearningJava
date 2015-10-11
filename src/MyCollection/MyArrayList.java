package MyCollection;

/**
 * 模拟实现JDK中提供的ArrayList类
 * @author zhangge
 *
 */
public class MyArrayList {
	/**
     * The value is used for Object storage.
     */
    private Object[] value;

    /**
     * The size is the number of Object used.
     */
    private int size;
    
    public int size() {
    	return size;
    }
    
    public boolean isEmpty(Object o) {
    	return false;
    }
    public int indexOf(Object obj) {
    	return -1;
    }
    public int lastIndexOf(Object obj) {
    	return -1;
    }
    public MyArrayList() {
    	//value = new Object[16];
    	this(10);
    }
    
    public MyArrayList(int size) {
    	value = new Object[size];
    }
    
    public void add(Object obj) {
    	value[size] = obj;
    	size++;
    	if (size >= value.length ) {
    		int newCapacity = value.length * 2;
    		Object[] newList = new Object[newCapacity];
    		for (int i = 0; i < value.length; i++) {
    			newList[i] = value[i]; 
    		}
    		value = newList;
    	}
    }
    
    public Object get(int index) {
    	if (index < 0 || index > size - 1) {
    		try {
    			throw new Exception();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	return value[index];
    }
    
    public static void main(String[] args) {
    	MyArrayList list = new MyArrayList();
    	list.add("aaa");
    	list.add(new Human("gege"));
    	list.add("bbbb");
    	System.out.println(list);
    	Human h = (Human) list.get(1);
    	System.out.println(h.getName());
    	System.out.println(list.get(-1));
    	
    	
    }
    

}
