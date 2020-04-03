import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int ah,am,as,bh,bm,bs;
        int allh,allm,alls;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
            for (int i = 0; i < number; i++) {
                ah = scanner.nextInt();
                am = scanner.nextInt();
                as = scanner.nextInt();
                bh = scanner.nextInt();
                bm = scanner.nextInt();
                bs = scanner.nextInt();
                allh = ah+bh;
                allm = am+bm;
                alls = as+bs;

                allm += alls/60;
                alls = (alls%60);
                allh += allm/60;
                allm = (allm%60);
                //System.out.printf("%d %d %d\n",allh,allm,alls);
                System.out.println(allh+" "+allm+" "+alls);
            }
        }
    }
}
