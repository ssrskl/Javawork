import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lines;//����
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
                lines = scanner.nextInt();
            /**
             * 1 Ҫ��������ʵ�֣�����Ҫ����int������Ԫ��Ĭ��ֵΪ 0
             * 2 Ȼ��ÿһ�ε�����ӡ�µ�һ�е�Ԫ�ص�ʱ��
             * �µ��ض�λ�õ�Ԫ�� = ��λ��ԭ����Ԫ�� + ��λ�õ�ǰһ��λ�õ�ֵ
             */
                int[] a = new int[lines + 1];
                int previous = 1;
                for (int i = 1; i <= lines; i ++){
                    for (int j = 1; j <= i; j++){
                        int current = a[j];
                        a[j] = previous + current;
                        previous = current;
                            System.out.print(a[j]);
                            if (j == i){}else {
                                System.out.print(" ");
                                //������пո�
                            }
                    }
                    System.out.println();
                    }
                    System.out.println();
        }
        }
    }
