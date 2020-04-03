import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
            System.out.println();
        }
    }
}
