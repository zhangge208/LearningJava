package String;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijk");
		StringBuilder sb2 = new StringBuilder(32);
		StringBuilder sb3 = new StringBuilder("abcd");
		sb3.append("edf");
		sb3.append(true);
		sb.delete(3, 5); //��ͷ����β
		sb2.append(true).append("123").append("wer"); //ͨ��return thisʵ�ַ�����
		System.out.println(sb3);
		System.out.println(sb2);
		StringBuilder gh = new StringBuilder("a");
		for (int i = 0; i < 1000; i++) {
			gh.append(i);
		}
		System.out.println(gh);
		
		
	}
}
