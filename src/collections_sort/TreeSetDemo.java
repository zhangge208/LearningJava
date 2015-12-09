package collections_sort;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Person p1 = new Person("zg", 100);
		Person p2 = new Person("zgzg", 1010);
		Person p3 = new Person("azqg", 2100);
		Person p4 = new Person("gg", 10);
		TreeSet<Person> persons = new TreeSet<Person>(
					new java.util.Comparator<Person>(){

						@Override
						public int compare(Person o1, Person o2) {
							return -(o1.getScore() - o2.getScore());
						}
						
					}
				);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		//TreeSet 在添加数据时排序，数据更改不会影响原来的顺序
		System.out.println(persons);
		p3.setScore(-100);
		System.out.println(persons);
	}
}
