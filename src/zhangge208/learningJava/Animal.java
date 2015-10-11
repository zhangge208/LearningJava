package zhangge208.learningJava;

public class Animal {
	public void voice() {
		System.out.println("normal");
	}
}

class Cat extends Animal {
	public void voice() {
		System.out.println("miaomiao");
	}
	public void see() {
		System.out.println("see");
	}
}

class Dog extends Animal {
	public void voice() {
		System.out.println("wangwang");
	}
}

 class Pig extends Animal {
	 public void voice() {
		 System.out.println("hengheng");
	 }
 }
