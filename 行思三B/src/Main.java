import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        int k = 0;
        //BufferedReader bufferedReader;
        Scanner scanner = new Scanner(System.in);
        //ʹ���µ�Scanner���ǻ��������
        Scanner scanner1 = new Scanner(System.in);
        while (scanner.hasNextInt()){
        number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            String string = scanner1.nextLine();
            //���ֵ�ASCII��ֵΪ��ֵ
            int length = string.length();
            //System.out.println(length);
            for (int j = 0; j < length; j++) {
//                if ((int)string.charAt(j)<0){
//                    k++;
//                }
                if (isChinese(string.charAt(j))) {
                    k++;
                }
                //System.out.println((int)string.charAt(j));
            }
            //����Ϊ�����ֽڣ����Ը�������2
            System.out.println(k);
            k = 0;
        }
        }
    }
    //�ж�����
    public static boolean isChinese(char c){
        if ((int)c>=19968&&(int)c<=40869){
            return true;
        }
        //�ж�����
//        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(c);
//        if (unicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS){
//            return true;
//        }
        return false;
    }
}
