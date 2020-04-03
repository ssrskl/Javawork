package 异常;

public class TestException {
	public static void main(String[] args) {
		int a = 0;
		try {
			a = 1/0;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(a);
		/**
		 * 空指针异常
		 */
		try {
			String string = null;
			System.out.println(string.charAt(0));
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		 
	}
}
