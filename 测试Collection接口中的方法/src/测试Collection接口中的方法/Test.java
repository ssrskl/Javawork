package 测试Collection接口中的方法;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		test01();
		
	}
	public static void test01() {
		List<String> list01 = new ArrayList<>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		List<String> list02 = new ArrayList<>();
		list02.add("aa");
		list02.add("bb");
		list02.add("dd");
		System.out.println(list01);
		list01.addAll(list02);
		System.out.println(list01);
		list01.removeAll(list02);
		System.out.println(list01);
		list01.retainAll(list02);
		System.out.println(list01);
	}
}
