
public class Niname {

	public static void name(AA aa) {
		System.out.println("��ͷ");
		aa.a();
	}
	public static void main(String[] args) {
		Niname.name(new AA() {

			@Override
			public void a() {
				// TODO �Զ����ɵķ������
				System.out.println("������");
			}});
	}
}
interface AA{
	void a();
}
