package ·ºÐÍ;

public class FanXin {
	public static void main(String[] args) {
		
		Book<String,Integer> book1 = new Book<>("java·è¿ñ½²Òå", 1, 102);
		Book book2 = new Book("Android·è¿ñ½²Òå", 2, 89);
		//####################################
		FanTest<String> fanTest = new FanTest<>();
		fanTest.set("hahah", 0);
		String bString = fanTest.get(0);
		System.out.println(bString);
	}
}
class FanTest<E>{
	Object[] object = new Object[5];
	public void set(E e,int index) {
		object[index] = e;
	}
	public E get(int index) {
		return (E)object[index];
	}
}