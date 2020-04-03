
class Anlimal{
	public void shout() {
		System.out.println("½ĞÁËÒ»Éù!");
	}
}
class Dog extends Anlimal{
	public void shout() {
		System.out.println("ÍôÍôÍô");
	}
}
class Cat extends Anlimal{
	public void shout() {
		System.out.println("ß÷ß÷ß÷");
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
