import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();                    					     //��T,T��ÿ����һ������
        input.nextLine();
        for (int i = 0; i < n; i++)
        {
            String time = input.nextLine();        							 //�������ڱ������ַ���time������
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            if (n == 0)
                break;
            try
            {
                Date date1 = sdf.parse(time);								 //timeת��ΪDate����
                Date date2 = new Date();                                     //��ʼ��date2��������18�������
                Calendar cal1 = Calendar.getInstance();                      //��ʼ��cal1���������ʼ����
                Calendar cal2 = Calendar.getInstance();                      //��ʼ��cal2��������18�������
                cal1.setTime(date1);
                cal2.setTime(date1);
                cal2.add(Calendar.YEAR, 18);                                 //����18����cal2
                date2 = cal2.getTime();
                long day1 = (long) date1.getTime() / (1000 * 60 * 60 * 24);  //���ʼ���ڵ�������
                long day2 = (long) date2.getTime() / (1000 * 60 * 60 * 24);  //��18����������
                if (cal1.get(Calendar.MONTH) + 1 == 2                        //Calendar.MONTH �·��Ǵ�0��ʼ�ģ�����Ҫ��1
                        && cal1.get(Calendar.DATE) == 29)					 //Calendar.DATE ������
                {
                    System.out.println("-1");
                }
                else
                {
                    System.out.println(day2 - day1);						//������ǹ�ȥ��������
                }
            }

            catch (ParseException e)
            {
                e.printStackTrace();
            }
        }
    }
}