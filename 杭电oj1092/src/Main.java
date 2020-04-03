import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long number;
        int all = 0;
        int a;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
            if (number == 0){
                break;
            }
            for (int i = 1; i <= number; i++) {
                a = scanner.nextInt();
               all += a;
            }
            System.out.println(all);
            all = 0;
        }
    }
}
