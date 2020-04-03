
public class Test {
	public static void main(String[] args) {
		Son son = new Son();
		System.out.println("儿子的强壮程度:"+son.getStrong());
		System.out.println("儿子的善良程度:"+son.getKind());
	}
}
class Son{
	class Father_1 extends Father{
		public int strong() {
			return super.strong()+2;
		}
	}
	class Mother_1 extends Mother{
		public int kind() {
			return super.kind()+3;
		}
	}
	public int getStrong() {
		return new Father_1().strong();
	}
	public int getKind() {
		return new Mother_1().kind();
	}
}
class Father{
	public int strong() {
		return 9;
	}
}
class Mother{
	public int kind() {
		return 10;
	}
}
