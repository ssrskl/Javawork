import java.util.Scanner;

/**
 * µÚ¼¸Ìì
 * @author HASEE
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c,sum;
		int aa[]={31,28,31,30,31,30,31,31,30,31,30,31};
		while(in.hasNext()){
	    String s=in.next();
	    String array[]=s.split("/");
	     a=Integer.parseInt(array[0]);
	     b=Integer.parseInt(array[1]);
	     c=Integer.parseInt(array[2]);
	     sum=0;
	    if(b>2&&(a%4==0&&a%100!=0)||a%400==0)
	    	sum+=1;
	   
		if(b==1) 
			 System.out.println(c);
		else{ 
	       for(int i=b-2;i>=0;i--)
	    	  sum+=aa[i];
	      System.out.println(c+sum);
		   }
		}
in.close();
	}
}
