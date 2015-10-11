package testWrapperClass;

/**
 * test auto boxing & unboxing
 * @author zhangge
 *
 */
public class autoBox {
	public static void main(String[] args) {
		Integer a = 100;
		int c =new Integer(1500);
		int c1 = a;
		Integer e = 1234;
		Integer e2 = 1234;
		System.out.println(e == e2);
		System.out.println(e.equals(e2));
		Integer e3 = 123; //[-128,127]之间的数，仍然当做基本数据类型来处理
		Integer e4 = 123;
		System.out.println(e3 == e4);
		System.out.println(e3.equals(e4));
		
		
	}
}
