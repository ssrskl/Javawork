package 测试Stringbuilder;

/**
 * 可变字符序列
 * @author HASEE
 *
 */
public class TestStringBulider {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("aaabbb");
		System.out.println(Integer.toHexString(stringBuilder.hashCode()));
		System.out.println(stringBuilder);
		stringBuilder.setCharAt(2, 'M');
		System.out.println(stringBuilder);
		StringBuilder stringBuilder2 = new StringBuilder();
		for(int i = 0;i<26;i++) {
			char temp = (char)('a'+i);
			stringBuilder2.append(temp);
		}
		System.out.println(stringBuilder2);
		System.out.println(stringBuilder2.reverse());
		stringBuilder2.insert(0, "我").insert(1, "叫");//链式调用，因为return this
		//返回了自己
		System.out.println(stringBuilder2);
		stringBuilder2.delete(0, 2);//同样可以链式调用
		System.out.println(stringBuilder2);
	}
}
