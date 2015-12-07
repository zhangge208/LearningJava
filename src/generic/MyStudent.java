package generic;
/**
 * 自定义泛型
 * T Type
 * K V Key Value
 * E Element
 * 
 * NOTE: 泛型不可使用在静态属性上
 *       
 * @author zhangge
 *
 */
public class MyStudent<T> {
	private T javase;
	public MyStudent() {
		
	}
	public MyStudent(T javase) {
		this.javase = javase;
	}
	public T getJavase() {
		return javase;
	}
	public void setJavase(T javase) {
		this.javase = javase;
	}
}
