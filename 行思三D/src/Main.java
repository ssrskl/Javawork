import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i <= number; i++) {
                String string = scanner.nextLine();
                char[] chars = string.toCharArray();
                //System.out.println(string);
                printff('a',count('a',chars));
                printff('e',count('e',chars));
                printff('i',count('i',chars));
                printff('o',count('o',chars));
                printff('u',count('u',chars));
                if (i!=number){
                    System.out.println();
                }
            }
        }
    }
    static void printff(char str,int a){
        System.out.println(str+":"+a);
    }
    static int count(char str, char[] chars){
        int n = 0;
        for (int i = 0; i < chars.length; i++) {
            if (str == chars[i]){
                n++;
            }
        }
        return n;
    }
}
