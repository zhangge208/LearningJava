package generic;

public class MystuApp {
	public static void main(String[] args) {
		MyStudent<Integer> stu = new MyStudent<Integer>();
		stu.setJavase(80);
		Integer score = stu .getJavase();
		System.out.println(score);
	}
}