import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //创建一个集合
//        var books = new LinkedHashSet();
//        books.add("one");
//        books.add("two");
//        books.add("three");
//        books.forEach(o -> System.out.println(o));
        int number,a;
        TreeSet treeSet = new TreeSet();
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for (int i = 0; i < number ; i++) {
            a = scanner.nextInt();
            treeSet.add(a);
        }
        treeSet.forEach(o -> System.out.printf("%d ",o));
    }
}
