package iterator;

public class SimpleList {
	private String[] elem = {"a", "b","c"};
	private int size = elem.length;
	private int cursor = -1;
	public boolean hasNext(){
		return cursor + 1 < size;
	}
	public String next() {
		cursor++;
		return  elem[cursor];
	}
	public void remove(){
		System.arraycopy(elem, cursor + 1, elem, cursor, this.size - (cursor + 1));
		this.size --;
		cursor--;
		
	}
	public static void main(String[] args) {
		SimpleList list = new SimpleList();
		while (list.hasNext()) {
			System.out.println(list.next());
			list.remove();
		}	
	}

}
