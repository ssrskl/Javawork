
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
	public void eatFish() {
		System.out.println("����!");
	}
}
public class ZhuanXing {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Anlimal cat = new Cat();//�Զ�����ת��,�༭���϶�catΪAnlimal
//		cat.eatFish(); �༭����Ϊcat��Anlimal���ͣ���Anlimal����û��eatFish����
		Cat cat2 = (Cat)cat;//����ǿ��ת��
		cat2.eatFish();
		Anlimal c3 = new Cat();
		//Dog d3 = (Cat)c3; �ϰ汾�༭������ͨ�����������б����°汾�༭��ֱ�ӱ���
	}

}
