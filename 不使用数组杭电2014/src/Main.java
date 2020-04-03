import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sorce;
        int sum=0,max=0,min=101;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
            for (int i = 0; i < number; i++) {
                sorce = scanner.nextInt();
                sum += sorce;
                max = (sorce>max) ? sorce : max;
                min = (sorce<min) ? sorce : min;
            }
            System.out.printf("%.2f\n",(double)(sum-max-min)/(number-2));
            sum = 0;
        }
    }
}
