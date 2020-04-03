import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1,number2;
        long sum;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            sum = number1*number2;
            for (int i = 1; i <= sum; i++) {
                if ((i%number1 == 0)&&(i%number2 == 0)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
