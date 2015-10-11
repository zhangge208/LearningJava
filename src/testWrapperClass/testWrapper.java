package testWrapperClass;

/**
 * test the based function of WrapperClass
 * @author zhangge
 *
 */
public class testWrapper {
	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("234");
		System.out.println(i2);
		System.out.println(i2 + 10);
	}
}
 