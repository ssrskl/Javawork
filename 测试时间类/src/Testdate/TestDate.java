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
//��ʱ�������ָ���ĸ�ʽת���ַ���
		DateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd�� hh:mm;ss");
		System.out.println(dateFormat);
		String string = dateFormat.format(new Date());
		System.out.println(string);
//���ַ�������ת��ʱ��
		DateFormat d2 = new SimpleDateFormat("yyyy��MM��");
		Date date2 = d2.parse("2019��10��");
		System.out.println(date2);
		
//���Խ����Ƕ�����
		DateFormat dateFormat2 = new SimpleDateFormat("D");
		String string2 = dateFormat2.format(new Date());
		System.out.println(string2+"����");
	}
}
