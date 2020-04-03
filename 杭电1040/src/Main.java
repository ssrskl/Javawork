import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        int a;
        TreeSet<Integer> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        for (int i = 0; i < number1; i++) {
            number2 = scanner.nextInt();
            for (int j = 0; j < number2; j++) {
                a = scanner.nextInt();
                treeSet.add(a);
            }
            //Ê¹ÓÃlambda Êä³ö
            treeSet.forEach(obj -> System.out.printf("%d ",obj));
            treeSet.clear();
        }
    }
}
