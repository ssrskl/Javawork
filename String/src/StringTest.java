
public class StringTest {
	public static void main(String[] args) {
		String string = "abc";
		String string2 = new String("abc");
		String string3 = "18"+19;//��һ��String��ȫ������String
		System.out.println(string3);
		System.out.println("##########################");
		/**
		 * ������
		 */
		String string4 = "aaaa";
		String string5 ="aaaa";
		System.out.println(string4 == string5);//string4��5���ڳ�������
		//�ַ����Ƚ�ͨ����equals
		String string6 = new String("aaaa");
		System.out.println(string4 == string6);//string6��string4����ͬ��
	}
}
