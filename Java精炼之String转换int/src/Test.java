
public class Test {
	public static void main(String[] args) {
		String string = "123";
		int n = 0;
		//��һ�ַ���
		n = Integer.parseInt(string);
		System.out.println(n);
		//�ڶ��ַ���
		n = 0;
		n = Integer.valueOf(string).intValue();
		System.out.println(n);
		System.out.println("-----intת��ΪString--------");
		//��һ�ַ���
		int m = 100;
		String string2 = String.valueOf(m);
		System.out.println(string2);
		//�ڶ��ַ���
		String string3 = Integer.toString(m);
		System.out.println(string3);
		//�����ֺͷ���
		String string4 = m+"";
		System.out.println(m);
	}
}
