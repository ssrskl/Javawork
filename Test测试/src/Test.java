public class Test {

	public static void jump(){
		System.out.println("jump����");
	}
	public static void run(){
		jump();
	}
	public static void main(String[] args) {
		run();
	}
	}