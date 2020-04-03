/**
 * 1.抽象组件:需要装饰的抽象对象(接口或抽象父类)
 * 2.具体组件:需要装饰的对象
 * 3.抽象装饰类:包含了对抽象组件的引用以及装饰者共有的方法
 * 4.具体装饰类:被装饰的对象
 * @author HASEE
 *
 */

public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		person.say();
		//装饰
		Amplifier amplifier = new Amplifier(person);
		amplifier.say();
	}
}
class Person implements Say{

	private int voice = 10;
	public int getVoice() {
		return voice;
	}
	public void setVoice(int voice) {
		this.voice = voice;
	}
	@Override
	public void say() {
		// TODO 自动生成的方法存根
		System.out.println("人的声音为:"+this.getVoice());
	}
	
}
class Amplifier implements Say{

	private Person person;
	public Amplifier(Person person) {
		// TODO 自动生成的构造函数存根
		this.person = person;
	}
	@Override
	public void say() {
		// TODO 自动生成的方法存根
		System.out.println("使用放大器后，人的声音为:"+person.getVoice()*10);
	}
	
}
