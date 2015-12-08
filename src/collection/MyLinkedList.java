package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
	public Node first;
	private Node last;
	private int size;
	public MyLinkedList() {
		
	}
	public void add(Object obj) {
		if (first == null) {
			Node n = new Node();
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}
		else {
			Node n = new Node();
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			last.setNext(n);
			last = n;
		}
		size++;
	}
	public void add(int index, Object obj) {
		Node head = first;
		for (int i = 0; i < index; i++) {
			head = head.next;
		}
		Node temp = new Node();
		temp.obj = obj;
		if (head != null) {
			head.previous.next = temp;
			temp.previous = head.previous;
			temp.next = head;
			head.previous = temp;
		}
		size++;
	}
	public Object get(int index) {
		rangeCheck(index);
		Node head = null;
		if (first != null){
			head = first;
			for (int i = 0; i < index; i++) {
				head = head.next;
			}
		}
		return head.obj;
	}
	
	public void remove(int index) {
		rangeCheck(index);
		Node head = null;
		if (first != null){
			head = first;
			for (int i = 0; i < index; i++) {
				head = head.next;
			}
		}
		if (head != null) {
			head.previous.next = head.next;
			head.next.previous = head.previous;
		}
		size--;
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
	public int size(){
		return size;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("aaa");
		list.add(123);
		list.add(23456);
		list.add("bbb");
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			Object i =iter.next();
			System.out.println(i);
		}
		System.out.println(list.size());
		//System.out.println(list.get(0));
		//System.out.println(list.get(1));
		list.remove(1);
		/**
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		**/
		
	}
}
