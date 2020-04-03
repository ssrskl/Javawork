import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String []args)throws Exception{
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            String values = cin.next();
            while(true){
                if(values.startsWith("5"))
                    values=values.substring(1);
                else
                    break;
            }
            String s[] = values.split("5+");
            int a[]=new int[s.length];
            for(int i=0;i<s.length;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(a);
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]);
                if(i!=a.length-1)
                    System.out.print(" ");
                else
                    System.out.println();
            }

        }
        cin.close();
    }
}