 package oop.testInterface;

public interface fly {
	int MAX_SPEED = 11000;
	int MIN_HEIGHT = 1;
	void flying();
}

class Plane implements fly {
	@Override
	public void flying() {
		System.out.println("flying");
	}
}

class Man implements fly {

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		System.out.println("flying gugu");
	}
	
}

abstract class stone{
	public abstract void play(); 
}