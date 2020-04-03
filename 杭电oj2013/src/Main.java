import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int all=1;
        int dayn;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            dayn = scanner.nextInt();
            for (int day = 1; day < dayn; day++) {
                all = ((all+1)*2);
            }
            System.out.println(all);
            all = 1;
        }
    }
}
