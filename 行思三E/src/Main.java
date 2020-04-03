import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();                    					     //数T,T行每行有一个日期
        input.nextLine();
        for (int i = 0; i < n; i++)
        {
            String time = input.nextLine();        							 //读入日期保存在字符串time变量里
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            if (n == 0)
                break;
            try
            {
                Date date1 = sdf.parse(time);								 //time转换为Date类型
                Date date2 = new Date();                                     //初始化date2用来保存18年后日期
                Calendar cal1 = Calendar.getInstance();                      //初始化cal1用来保存初始日期
                Calendar cal2 = Calendar.getInstance();                      //初始化cal2用来保存18年后日期
                cal1.setTime(date1);
                cal2.setTime(date1);
                cal2.add(Calendar.YEAR, 18);                                 //加上18年后的cal2
                date2 = cal2.getTime();
                long day1 = (long) date1.getTime() / (1000 * 60 * 60 * 24);  //算初始日期的总天数
                long day2 = (long) date2.getTime() / (1000 * 60 * 60 * 24);  //算18年后的总天数
                if (cal1.get(Calendar.MONTH) + 1 == 2                        //Calendar.MONTH 月份是从0开始的，所以要加1
                        && cal1.get(Calendar.DATE) == 29)					 //Calendar.DATE 即是日
                {
                    System.out.println("-1");
                }
                else
                {
                    System.out.println(day2 - day1);						//相减便是过去的天数！
                }
            }

            catch (ParseException e)
            {
                e.printStackTrace();
            }
        }
    }
}