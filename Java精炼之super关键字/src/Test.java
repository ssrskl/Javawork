
public class Test {
	public static void main(String[] args) {
		Person<String> person = new Person<>();
		person.setName("xiaoming1");
		System.out.println("名称为:"+person.getName());
	}
}
class Person<S>{
	public S name;
	public Person() {
		// TODO 自动生成的构造函数存根
		System.out.println("Person类已经构造完成");
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
		super();//他就是Person方法
		// TODO 自动生成的构造函数存根
		super.name = "aaaa";//用super访问父类的成员变量
		this.name1 = "ada";//用this访问本类的成员变量
	}
}