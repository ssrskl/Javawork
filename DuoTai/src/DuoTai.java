
class Anlimal{
	public void shout() {
		System.out.println("����һ��!");
	}
}
class Dog extends Anlimal{
	public void shout() {
		System.out.println("������");
	}
}
class Cat extends Anlimal{
	public void shout() {
		System.out.println("������");
	}
}
public class DuoTai {
	public static void main(String[] args) {
	anlimalCry(new Anlimal());
	anlimalCry(new Dog());
	anlimalCry(new Cat());
}
	static void anlimalCry(Anlimal anlimal) {
		anlimal.shout();
	}
}
