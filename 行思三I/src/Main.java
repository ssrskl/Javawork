import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            if(str.equals("#")){//�ж����ǣ����Ƿ���
                return;
            }
            String d=str.replaceAll(" +", ",");//����ؼ�������ո��ö��š�����ȥ�滻��
            String  k[]=d.split(",");//Ȼ����,����ȥ�ָ�
            int n=0;
            int sum=k.length;//�ܵĸ�����

            //��ʼ�Ƚ����Ǵ�����ͬ�ľ�ͳ��һ��
            for(int i=0;i<k.length;i++){
                for (int j = i+1; j < k.length; j++) {
                    if(k[i].equals(k[j])){
                        n++;
                        break;
                    }
                }
            }System.out.println(sum-n);//���������ȥ��ͬ�ģ�������Ҫ�Ĵ𰸣���ͬ�ĵ�����
        }
    }
}