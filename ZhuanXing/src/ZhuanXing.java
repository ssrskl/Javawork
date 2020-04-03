
class Anlimal{
	public void shout() {
		System.out.println("叫了一声!");
		
	}
	
}
class Dog extends Anlimal{
	public void shout() {
		System.out.println("汪汪汪");
	}
	
}
class Cat extends Anlimal{
	public void shout() {
		System.out.println("喵喵喵");
	}
	public void eatFish() {
		System.out.println("吃鱼!");
	}
}
public class ZhuanXing {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Anlimal cat = new Cat();//自动向上转型,编辑器认定cat为Anlimal
//		cat.eatFish(); 编辑器认为cat是Anlimal类型，而Anlimal类中没有eatFish方法
		Cat cat2 = (Cat)cat;//向下强制转型
		cat2.eatFish();
		Anlimal c3 = new Cat();
		//Dog d3 = (Cat)c3; 老版本编辑器可以通过，但是运行报错，新版本编辑器直接报错
	}

}
