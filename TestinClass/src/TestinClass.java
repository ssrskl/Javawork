
public class TestinClass {
	public static void main(String[] args) {
		//�����ڲ������
		One.Two two = new One().new Two();//�ȴ����ⲿ������ٴ����ڲ������
		two.name2();
		Three.Four fouu = new Three.Four();
		fouu.four();
	}
}
//�Ǿ�̬�ڲ���
class One{
	//�ⲿ�಻�ܷ����ڲ��������
	int number=100;
	public void name() {}
		class Two{
			//�Ǿ�̬�ڲ��಻���о�̬���Ժͷ���
		//	static int b=999;
			int age=98;
			public void name2() {
				int age=99;
				System.out.println("�ⲿ��ĳ�Ա����number��"+One.this.number);
				System.out.println("�ڲ���ģ�"+this.age);
				System.out.println("�����ģ�"+age);
			}
		}
}
//��̬�ڲ���
class Three{
	static class Four{
		public void four() {
			System.out.println("��̬�ڲ���");
		}
	}
}