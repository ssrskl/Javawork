
public class Private {
	public static void main(String[] args) {
		Human human = new Human();
		//human.age=99;  ��private���Σ����ɼ�
	}
}
class Human{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void sayAge() {
		System.out.println(age);
		
	}
}
class Boy extends Human{
	void sayHello() {
//		System.out.println(age); Boy�̳���Human��Boy����age���������޷�����
		//�����޷�ʹ�ø����˽�����Ժͷ���
	}
}
