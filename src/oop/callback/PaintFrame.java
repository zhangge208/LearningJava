package oop.callback;

public class PaintFrame {
	public static void drawFrame(MyFrame f) {
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		
		//������
		f.paint();
		
		System.out.println("��������");
	}
	
	public static void drawFrame(IMyFrame f) {
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		
		//������
		f.paint();
		
		System.out.println("��������");
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
 

