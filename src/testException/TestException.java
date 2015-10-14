package testException;

/**
 * 
 * @author zhangge
 *
 */

public class TestException {
	public static void main(String[] args) {
		Computer c = null;
		if (c != null) {
			c.start();
		}
		
	}
}

class Computer {
	void start() {
		System.out.println("compter is staring now");
	}
}
