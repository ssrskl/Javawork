import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int all = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            number = scanner.nextInt();
        int[] a = new int[number];
        //���鸳ֵ
            for (int i = 0; i < number; i++) {
                a[i] = scanner.nextInt();
            }
            maopao(a,a.length);
            for (int i = 1; i < number-1; i++) {//ȥ����ͺ���ߵ�
                all += a[i];
            }
            System.out.printf("%.2f\n",(double)all/(number-2));
            all = 0;
        }
    }
    //ð������
    public static void maopao(int[] a,int len){
        //��������
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-1; j++) {
                if (a[j]>a[j+1]){
                    a[j] = a[j]^a[j+1];
                    a[j+1] = a[j]^a[j+1];
                    a[j] = a[j]^a[j+1];
                }
            }
        }
    }
}
