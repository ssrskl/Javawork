
public class Niname {

	public static void name(AA aa) {
		System.out.println("开头");
		aa.a();
	}
	public static void main(String[] args) {
		Niname.name(new AA() {

			@Override
			public void a() {
				// TODO 自动生成的方法存根
				System.out.println("匿名类");
			}});
	}
}
interface AA{
	void a();
}
