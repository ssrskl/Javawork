import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        int k = 0;
        //BufferedReader bufferedReader;
        Scanner scanner = new Scanner(System.in);
        //使用新的Scanner来是缓冲流清空
        Scanner scanner1 = new Scanner(System.in);
        while (scanner.hasNextInt()){
        number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            String string = scanner1.nextLine();
            //汉字的ASCII码值为负值
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
            //汉字为两个字节，所以个数除以2
            System.out.println(k);
            k = 0;
        }
        }
    }
    //判断中文
    public static boolean isChinese(char c){
        if ((int)c>=19968&&(int)c<=40869){
            return true;
        }
        //判断中文
//        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(c);
//        if (unicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS){
//            return true;
//        }
        return false;
    }
}
