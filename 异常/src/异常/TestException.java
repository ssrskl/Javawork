package �쳣;

public class TestException {
	public static void main(String[] args) {
		int a = 0;
		try {
			a = 1/0;
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(a);
		/**
		 * ��ָ���쳣
		 */
		try {
			String string = null;
			System.out.println(string.charAt(0));
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		 
	}
}
