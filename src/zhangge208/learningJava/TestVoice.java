package zhangge208.learningJava;

public class TestVoice {
	public static void testAnimalVoice(Animal an){
		an.voice();
	}
	
	public static void main(String[] args) {
		 Animal a = new Cat();
		 testAnimalVoice(a);
		 
	}
}
