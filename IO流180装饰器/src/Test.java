/**
 * 1.�������:��Ҫװ�εĳ������(�ӿڻ������)
 * 2.�������:��Ҫװ�εĶ���
 * 3.����װ����:�����˶Գ�������������Լ�װ���߹��еķ���
 * 4.����װ����:��װ�εĶ���
 * @author HASEE
 *
 */

public class Test {

	public static void main(String[] args) {
		Person person = new Person();
		person.say();
		//װ��
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
		// TODO �Զ����ɵķ������
		System.out.println("�˵�����Ϊ:"+this.getVoice());
	}
	
}
class Amplifier implements Say{

	private Person person;
	public Amplifier(Person person) {
		// TODO �Զ����ɵĹ��캯�����
		this.person = person;
	}
	@Override
	public void say() {
		// TODO �Զ����ɵķ������
		System.out.println("ʹ�÷Ŵ������˵�����Ϊ:"+person.getVoice()*10);
	}
	
}
