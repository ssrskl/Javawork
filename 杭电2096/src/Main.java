import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int a,b;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
            for (int i = 0; i<number; i++) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                a = numberr(a);
                b = numberr(b);
                System.out.println(numberr(a+b));
            }
        }
    }
    public static int numberr(int n){
        n = n%100;
        return n;
    }
}
