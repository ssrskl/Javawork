import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int number;
        int a;
        int all =0;
        TreeSet<Integer> treeSet = new TreeSet();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
            for (int i = 0; i < number; i++) {
                a = scanner.nextInt();
                treeSet.add(a);
            }//TreeSet自动排序
           // treeSet.forEach(obj-> System.out.println(obj+" "));
            //使用Lambda遍历
            treeSet.remove(treeSet.first());
            treeSet.remove(treeSet.last());
            //foreach遍历
            for (Integer obj : treeSet) {
                all += obj;
            }
            System.out.printf("%.2f\n",(double)all/treeSet.size());
            all = 0;
            treeSet.clear();
        }
    }
}
