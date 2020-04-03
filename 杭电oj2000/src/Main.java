import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            a = (int)scanner.next().charAt(0);
            b = (int)scanner.next().charAt(0);
            c = (int)scanner.next().charAt(0);
            System.out.println(a);
            if(a>b)
            {
                a = a^b;
                b = a^b;
                a = a^b;
            }
            if(a>c)
            {
                a = b^c;
                c = b^c;
                a = b^c;
            }
            if(b>c)
            {
                b = b^c;
                c = b^c;
                b = b^c;
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.printf("%c %c %c\n",a,b,c);
        }
    }
}
