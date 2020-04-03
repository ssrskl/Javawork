import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            string = scanner.next();
            char[] cs = string.toCharArray();
            captureName(string);//先把第一个变成大写
            for (int i = 0; i < string.length(); i++) {
                if (cs[i]==' '&&cs[i+1]!=' '){
                    cs[i+1] = (char)(cs[i+1] - 32);
                }
            }
            System.out.print(string);
            System.out.println();
        }
    }
    public static String captureName(String s){
        char[] cs = s.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }
}
