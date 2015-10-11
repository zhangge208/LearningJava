package oop.callback;

public class PaintFrame {
	public static void drawFrame(MyFrame f) {
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		//画窗口
		f.paint();
		
		System.out.println("启动缓存");
	}
	
	public static void drawFrame(IMyFrame f) {
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		//画窗口
		f.paint();
		
		System.out.println("启动缓存");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame01());
	}
}

class GameFrame01 extends MyFrame {
	public void paint() {
		System.out.println("GameFrame01");
		System.out.println("draw windows");
		
		
	}
}

class GameFrame02 extends MyFrame {
	public void paint() {
		System.out.println("GameFrame02");
		System.out.println("draw windows");
		
		
	}
}

class GameFrame03 implements IMyFrame {
	public void paint() {
		System.out.println("GameFrame03");
		System.out.println("draw windows");
		
		
	}
}
 

