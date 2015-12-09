package collections_sort;

public class Person {
	//private final String name;
	//private final int score;
	private String name;
	private int score;
	public Person() {
		// TODO Auto-generated constructor stub
		name = null;
		score = 0;
	}
	public Person(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Person: name:" + name + "score:" + score + "\n" ;
		
	}
	
	
}
