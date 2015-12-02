package String;

public class TestString {
	public static void main(String[] args) {
		//String str = "abcd";
		String s = "dog cat dog cat";
		String[] new_str = s.split(" ");
		for (String str : new_str) {
			System.out.println(str);
			System.out.println(new_str);
		}
		
	}
	
	
}
