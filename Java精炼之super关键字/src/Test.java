
public class Test {
	public static void main(String[] args) {
		Person<String> person = new Person<>();
		person.setName("xiaoming1");
		System.out.println("����Ϊ:"+person.getName());
	}
}
class Person<S>{
	public S name;
	public Person() {
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("Person���Ѿ��������");
	}
	public S getName() {
		return name;
	}
	public void setName(S name) {
		this.name = name;
	}
	public void People(S name) {
		this.name = name;
	}
	
}
class Student extends Person{
	public String name1;
	public Student() {
		super();//������Person����
		// TODO �Զ����ɵĹ��캯�����
		super.name = "aaaa";//��super���ʸ���ĳ�Ա����
		this.name1 = "ada";//��this���ʱ���ĳ�Ա����
	}
}