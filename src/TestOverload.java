public class TestOverload {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		MyMath n = new MyMath(23);
		
		int result = m.add(4,  5, 8);
		System.out.print(n.a + "result" + result );
	}
}

class MyMath {
	int a;
	public MyMath(){
		
	}
	
	public MyMath(int a){
		this.a = a; 
	}
	public int add(double a, int b) {
		return (int)(a + b);
	}
	public int add(int a, int b) {
		return a + b;
	}
	public int add(int a, int b, int c){
		return a + b + c;
	}
}