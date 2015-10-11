package zhangge208.learningJava;

public class HttpServerlet {
	public void sevice() {
		System.out.println("HttpServlet.service()");
		doGet();
	}
	
	public void doGet() {
		System.out.println("HttpServlet.doGet()");
	}
	
	
}
