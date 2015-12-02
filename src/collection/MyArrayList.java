package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement of ArrayList
 * @author zhangge
 *
 */
public class MyArrayList {
	private Object[] elementData;
	private int size;
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	public MyArrayList(){
		this(10);
	}
	
	public MyArrayList(int initialCapacity){
		if (initialCapacity < 0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.elementData = new Object[initialCapacity] ;
	}
	
    public void add(Object obj) {
    	if (size == elementData.length){
    		Object[] newArray = new Object[size * 2 + 1];
    		System.arraycopy(elementData, 0, newArray, 0, size);
    	}
    	elementData[size] = obj;
    	size++;
    }
    
    public void add(int index, Object obj) {
    	rangeCheck(index);
    	System.arraycopy(elementData, index, elementData, index + 1, size - index);
    	elementData[index] = obj;
    	size++;
    }
    public Object get(int index) {
    	rangeCheck(index);
		return elementData[index];
    }
    public Object set(int index, Object obj) {
		rangeCheck(index);
    	Object oldValue = elementData[index];
		elementData[index] = obj;
    	return oldValue ;
    }
    public void remove(int index) {
    	rangeCheck(index);
    	int numMoved = size - index - 1;
    	if (numMoved > 0) {
    		System.arraycopy(elementData, index + 1, elementData, index, numMoved);
    	}
    	elementData[--size] = null;
    }
    public void remove(Object obj) {
    	for (int i = 0; i < size; i++) {
    		if (get(i).equals(obj)) {
    			remove(i);
    		}
    	}
    }
    private void rangeCheck(int index) {
    	if (index >= size) {
    		try {
    			throw new Exception();
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("aaa");
		list.add(1, "cccc");
		
		
	}

}
