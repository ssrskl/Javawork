package UMand;

public class Test {
	 public static void main(String[] args) {
	        /**ʹ��String�����ַ�����ƴ��*/
	        String str8 = "";
	        //������ʹ��StringBuilderƴ��, ����ÿ��ѭ����������һ��StringBuilder����
	        long num1 = Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
	        long time1 = System.currentTimeMillis();//��ȡϵͳ�ĵ�ǰʱ��
	        for (int i = 0; i < 5000; i++) {
	            str8 = str8 + i;//�൱�ڲ�����10000������
	        }
	        long num2 = Runtime.getRuntime().freeMemory();
	        long time2 = System.currentTimeMillis();
	        System.out.println("Stringռ���ڴ� : " + (num1 - num2));
	        System.out.println("Stringռ��ʱ�� : " + (time2 - time1));
	        /**ʹ��StringBuilder�����ַ�����ƴ��*/
	        StringBuilder sb1 = new StringBuilder("");
	        long num3 = Runtime.getRuntime().freeMemory();
	        long time3 = System.currentTimeMillis();
	        for (int i = 0; i < 5000; i++) {
	            sb1.append(i);
	        }
	        long num4 = Runtime.getRuntime().freeMemory();
	        long time4 = System.currentTimeMillis();
	        System.out.println("StringBuilderռ���ڴ� : " + (num3 - num4));
	        System.out.println("StringBuilderռ��ʱ�� : " + (time4 - time3));
	    }
}
