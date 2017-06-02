package test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class NginxDateTest {
	/*public static void main(String[] args) throws Exception {
		String timeLocal = "[28/Nov/2014:11:56:09 +0800]";
		timeLocal = timeLocal.replace("[", "");
		timeLocal = timeLocal.replace("]", "");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy:hh:mm:ss Z", Locale.ENGLISH);
		Date date = formatter.parse(timeLocal);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("转换后的日期格式："+format.format(date));
	}*/
	
	public static Date parseNginxDate(String timeLocal){
//		timeLocal = timeLocal.replace("[", "");
//		timeLocal = timeLocal.replace("]", "");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy:hh:mm:ss Z", Locale.ENGLISH);
		Date date =null;
		try {
			date = formatter.parse(timeLocal);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("转换后的日期格式："+format.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
}
