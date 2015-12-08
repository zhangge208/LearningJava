package collection;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.lang.Iterable;

/**
 * Implement of ArrayList
 * Using inner class to implement iterator
 * Implement of Iterable 
 * @author zhangge
 *
 */

public class MyArrayList<E> implements Iterable<E> {
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
	
    public void add(E obj) {
    	if (size == elementData.length){
    		Object[] newArray = new Object[size * 2 + 1];
    		System.arraycopy(elementData, 0, newArray, 0, size);
    	}
    	elementData[size] = obj;
    	size++;
    }
    
    public void add(int index, E obj) {
    	rangeCheck(index);
    	System.arraycopy(elementData, index, elementData, index + 1, size - index);
    	elementData[index] = obj;
    	size++;
    }
    public E get(int index) {
    	rangeCheck(index);
		return (E) elementData[index];
    }
    public E set(int index, Object obj) {
		rangeCheck(index);
    	Object oldValue = elementData[index];
		elementData[index] = obj;
    	return (E) oldValue ;
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
    public Iterator<E> iterator() {
		return new MyIter();
	}	
    private class MyIter implements Iterator<E> {
		private int cursor = 0;
		private int lastRet = -1;
		public boolean hasNext() {
            return cursor != size;
        }
		
		public E next() {
			if (cursor >= size)
	        	throw new NoSuchElementException();
	        Object[] elementData = MyArrayList.this.elementData;
	        if (cursor >= elementData.length)
	        	throw new ConcurrentModificationException();
			lastRet = cursor;
			return  (E) elementData[ cursor++];
		}
		
		public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();

            try {
                MyArrayList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

	} 
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("aaa");
		list.add(123);
		list.add(23456);
		list.add("bbb");
		MyArrayList<String> lst = new MyArrayList<String>();
		lst.add("123");
		Iterator iter = list.iterator();
		for (Object a : list) {
			System.out.println(a);
		}
		while(iter.hasNext()) {
			Object i =iter.next();
			System.out.println(i);
		}
		/**
			System.out.println(i);
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		**/
		
		
	}

}
