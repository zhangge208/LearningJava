public class Student {
	String name;
	int id;
	
	public Student(String name, int id) {
		this(); //use other constructor by this,Constructor call must be the first statement in a constructor
		//ccccthis(name);
		this.name = name ;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name) {
		this.name = name;
	}
	public Student() {
		System.out.println("构造一个对象");
	}
	
}
