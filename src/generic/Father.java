package generic;
/**
 * 泛型父类
 * 1. 保留父类泛型  -> 子类为泛型
 * 2. 不保留父类泛型 -> 子类按需实现
 * 
 * 子类重写方法的类型 -> 随父类而定
 * 子类新增方法的类型 -> 子类自定
 * 子类中使用父类的属性 -> 随父类而定
 * 子类中新增属性 -> 子类自定
 *  * @author zhangge
 *
 * @param <T1>
 * @param <T2>
 */
public abstract class Father<T1, T2> {
	T1 age;
	public abstract void test(T2 name);
}

//保留 -> 泛型子类
//1) 全部保留
class C1<T1, T2> extends Father<T1, T2> {

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}}
//2) 部分保留
class C2<T1> extends Father<T1,Integer>{

	@Override
	public void test(Integer name) {
		// TODO Auto-generated method stub
		
	}}
//不保留 -> 按需实现
//1）具体类型
class C3 extends Father<Integer, String> {

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}}
//2）没有类型，擦除，相当于Object
class C4 extends Father{

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}}
