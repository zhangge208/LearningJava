package generic;
/**
 * �Զ��巺��
 * T Type
 * K V Key Value
 * E Element
 * 
 * NOTE: ���Ͳ���ʹ���ھ�̬������
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
