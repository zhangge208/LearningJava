package generic;
/**
 * ���ͽӿڲ���ʹ����ȫ�ֳ�����
 * @author zhangge
 *
 * @param <T>
 */
public interface Comparator<T> {
	//�ӿڰ���ȫ�ֳ����͹������󷽷�
	public static final int MAXVALUE = 1024;
	void compare(T t);
}

interface InterC<T> extends Comparator<T>{}

class InterC1 implements Comparator{

	@Override
	public void compare(Object t) {
		// TODO Auto-generated method stub
		
	}
}
class InterC2 implements Comparator<Integer>{

	@Override
	public void compare(Integer t) {
		// TODO Auto-generated method stub
		
	}}
