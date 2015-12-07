package generic;
/**
 * ���͸���
 * 1. �������෺��  -> ����Ϊ����
 * 2. ���������෺�� -> ���ఴ��ʵ��
 * 
 * ������д���������� -> �游�����
 * ������������������ -> �����Զ�
 * ������ʹ�ø�������� -> �游�����
 * �������������� -> �����Զ�
 *  * @author zhangge
 *
 * @param <T1>
 * @param <T2>
 */
public abstract class Father<T1, T2> {
	T1 age;
	public abstract void test(T2 name);
}

//���� -> ��������
//1) ȫ������
class C1<T1, T2> extends Father<T1, T2> {

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}}
//2) ���ֱ���
class C2<T1> extends Father<T1,Integer>{

	@Override
	public void test(Integer name) {
		// TODO Auto-generated method stub
		
	}}
//������ -> ����ʵ��
//1����������
class C3 extends Father<Integer, String> {

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}}
//2��û�����ͣ��������൱��Object
class C4 extends Father{

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}}
