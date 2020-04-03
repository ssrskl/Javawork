import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            // double sum = 0;double sum1 = 0;double sum2 = 0;
            for(int i = 1;i<=m;i++){
                double sum = 0;double sum1 = 0;double sum2 = 0;
                int n = sc.nextInt();
                for(int x=1;x<=n;x++){
                    //sum = sum + (1/x+1%x)*(-1)^(x-1);
                    if(x%2==0){
                        sum1 = sum1 -1.0/x;  //(1/x+1%x);
                    }
                    else{
                        sum2 = sum2 +1.0/x;   //   1.0/X  表示分数   1/x  表示整除 取整
                    }
                }
                sum = sum1 + sum2;
                System.out.println(String.format("%.2f", sum));
            }
        }
    }
}