package generic;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * �Ƿ������ж��巺�ͷ���
 * ���壺�ڷ�������ǰ��
 * @author zhangge
 *
 */
public class Method {
	public static<T> void test(T t){
		System.out.println(t);
	}
	public static <T extends List> void test(T t) {
		System.out.println(t);
		t.add("aaa");
	}
	public static <T extends Closeable> void test(T... a) {
		for (T temp :a) {
			try {
				if(null != temp) {
					temp.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException{
		test("hahahhahahah");
		test(2345);
		test(new FileInputStream("a.txt"));
	}
}
