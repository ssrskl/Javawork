import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int all = 0;
        int a;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
            for (int i = 0; i < number; i++) {
                a = scanner.nextInt();
                all += a;
            }
            System.out.println(all);
            all = 0;
        }
    }
}
