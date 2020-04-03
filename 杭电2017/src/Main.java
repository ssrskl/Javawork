import java.util.Scanner;

/**
 * ×Ö·û´®Í³¼Æ
 *
 */
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++) {
            int k=0;
            String s=in.next();
            for(int j=0;j<s.length();j++) {
                if(s.charAt(j)-'0'>=0 && s.charAt(j)-'0'<=9) k++;
            }
            System.out.println(k);
        }
    }
}