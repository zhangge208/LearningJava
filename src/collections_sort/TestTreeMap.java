package collections_sort;

import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Person p1 = new Person("zg", 100);
		Person p2 = new Person("zgzg", 1010);
		Person p3 = new Person("azqg", 2100);
		Person p4 = new Person("gg", 10);
		TreeMap<Person, String> map = new TreeMap<Person, String>(
				new java.util.Comparator<Person>(){

						@Override
						public int compare(Person o1, Person o2) {
							return -(o1.getScore() - o2.getScore());
						}
						
					}
				);
		map.put(p1,"1");
		map.put(p2,"2");
		map.put(p3,"3");
		map.put(p4,"4");
		//TreeSet 在添加数据时排序，数据更改不会影响原来的顺序
		System.out.println(map);
		p3.setScore(-100);
		System.out.println(map);
	}
}
