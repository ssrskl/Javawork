import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int number2;
        int all = 0;
        int a;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
            for (int i = 0; i < number; i++) {
                number2 = scanner.nextInt();
                for (int j = 0; j < number2; j++) {
                    a = scanner.nextInt();
                    all += a;
                }
                System.out.println(all);
                if (i != number - 1) {
                    System.out.println();
                }
                all = 0;
            }
        }
    }
}
