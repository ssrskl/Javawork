import java.util.Scanner;

public class TwoTi {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
        while(cin.hasNextInt())
        { 
        		long s=cin.nextInt();
        		/*int sn=0;
        		for(int i=1;i<=s;i++){
        			sn+=i;
        			
        		}   //����Ҳ�ԡ���    */
        		long sn=s*(s+1)/2;
        		/*System.out.printf("%d%n%n",(s*(s+1))/2);	//�����������������  */ 
        		System.out.printf("%d%n%n",sn);
   
        }
	}
}
