package 可变参数;

public class Test {

	public static void main(String[] args) {
		change(3,1,6,98,49,3,414,4,94,949664,9,496,496,4,6);
	}
	public static void change(int... b) {
		//可变参数可以相当于一个数组
		for (int i : b) {
			System.out.println(i);
		}
	}
}
