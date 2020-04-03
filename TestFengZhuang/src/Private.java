
public class Private {
	public static void main(String[] args) {
		Human human = new Human();
		//human.age=99;  被private修饰，不可见
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
//		System.out.println(age); Boy继承于Human，Boy中有age，但是他无法调用
		//子类无法使用父类的私有属性和方法
	}
}
