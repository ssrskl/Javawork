package Testdate;

import java.awt.datatransfer.DataFlavor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		Date date = new Date(9);
		System.out.println(date);
//把时间对象按照指定的格式转成字符串
		DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd天 hh:mm;ss");
		System.out.println(dateFormat);
		String string = dateFormat.format(new Date());
		System.out.println(string);
//把字符串对象转成时间
		DateFormat d2 = new SimpleDateFormat("yyyy年MM月");
		Date date2 = d2.parse("2019年10月");
		System.out.println(date2);
		
//测试今年是多少天
		DateFormat dateFormat2 = new SimpleDateFormat("D");
		String string2 = dateFormat2.format(new Date());
		System.out.println(string2+"哈哈");
	}
}
