import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        for (int i = 0; i < number1; i++) {
            number2 = scanner.nextInt();
            int[] a = new int[number2];
            for (int j = 0; j < number2; j++) {
                a[j] = scanner.nextInt();
            }
            Arrays.sort(a);
            System.out.printf("%d",a[0]);
            for (int j = 1; j < number2; j++) {
                System.out.printf(" %d",a[j]);
//                if (j != (number2-1)){
//                    System.out.printf(" ");
//                }
            }
            System.out.println();
//            for (int j : a){
//                System.out.printf("%d ",j);
//            }
        }
    }
}
