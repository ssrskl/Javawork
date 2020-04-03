import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        int n;
        int all;
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x == 0 && y == 0){
                break;
            }
            for (n=x; n <= y; n++) {
                all = (int) Math.pow((double)n,2.0)+n+41;
                //System.out.println(all);
                Main main2 = new Main();
                if (main2.sushu(all)){
                    flag++;
                }
            }
           // System.out.println("f "+flag);
            if (flag == (y-x+1)){
                System.out.println("OK");
            }else {
                System.out.println("Sorry");
            }
            flag = 0;
            //初始化，可以写在for循环中
        }
    }
    public boolean sushu(int n){
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            //从2开始
            if ((n%i) == 0 && i != n){
                flag = false;
            }
        }
        return flag;
    }
}
