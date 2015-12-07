package iterator;

import java.util.Iterator;

public class DeepList {
	private String[] elem = {"a", "b","c"};
	private int size = elem.length;
	//inner class
	private class MyIter implements Iterator {
		private int cursor = -1;
		public boolean hasNext(){
			return cursor + 1 < size;
		}
		public String next() {
			cursor++;
			return  elem[cursor];
		}
		public void remove(){
			System.arraycopy(elem, cursor + 1, elem, cursor, DeepList.this.size - (cursor + 1));
			DeepList.this.size --;
			cursor--;
			
		}

	}
	public Iterator iterator() {
		return new MyIter();
	}
	public static void main(String[] args) {
		DeepList list = new DeepList();
		Iterator it = list.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
			it.remove();
		}	
	}

}
