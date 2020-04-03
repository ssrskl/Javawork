import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            for (int i = 0; i < number; i++) {
                String string = scanner.next();
                //System.out.println(string.length());
                int k = 0;
                for (int j = 0; j < string.length()/2; j++) {
//                    System.out.println(string.charAt(j));
//                    System.out.println(string.charAt(string.length()-1-j));
                    if (string.charAt(j) == string.charAt(string.length()-1-j) && j!=(string.length()-1-j)){
                        k++;
                    }
                }
                if (k == string.length()/2){
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }
    }
}
