import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lines;//行数
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
                lines = scanner.nextInt();
            /**
             * 1 要理解下面的实现，首先要明白int数组中元素默认值为 0
             * 2 然后每一次迭代打印新的一行的元素的时候：
             * 新的特定位置的元素 = 该位置原来的元素 + 该位置的前一个位置的值
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
                                //最后不能有空格
                            }
                    }
                    System.out.println();
                    }
                    System.out.println();
        }
        }
    }
