
public class Test {
	public static void main(String[] args) {
		String string = "123";
		int n = 0;
		//第一种方法
		n = Integer.parseInt(string);
		System.out.println(n);
		//第二种方法
		n = 0;
		n = Integer.valueOf(string).intValue();
		System.out.println(n);
		System.out.println("-----int转换为String--------");
		//第一种方法
		int m = 100;
		String string2 = String.valueOf(m);
		System.out.println(string2);
		//第二种方法
		String string3 = Integer.toString(m);
		System.out.println(string3);
		//第三种和方法
		String string4 = m+"";
		System.out.println(m);
	}
}
