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
            }//TreeSet�Զ�����
           // treeSet.forEach(obj-> System.out.println(obj+" "));
            //ʹ��Lambda����
            treeSet.remove(treeSet.first());
            treeSet.remove(treeSet.last());
            //foreach����
            for (Integer obj : treeSet) {
                all += obj;
            }
            System.out.printf("%.2f\n",(double)all/treeSet.size());
            all = 0;
            treeSet.clear();
        }
    }
}
