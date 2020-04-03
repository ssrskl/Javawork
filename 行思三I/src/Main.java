import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            if(str.equals("#")){//判断若是，则是返回
                return;
            }
            String d=str.replaceAll(" +", ",");//解题关键，多个空格用逗号《，》去替换；
            String  k[]=d.split(",");//然后用,逗号去分割
            int n=0;
            int sum=k.length;//总的个数，

            //开始比较若是存在相同的就统计一个
            for(int i=0;i<k.length;i++){
                for (int j = i+1; j < k.length; j++) {
                    if(k[i].equals(k[j])){
                        n++;
                        break;
                    }
                }
            }System.out.println(sum-n);//输出总数减去相同的，就是需要的答案，不同的单词数
        }
    }
}