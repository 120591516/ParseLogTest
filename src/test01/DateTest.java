package test01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		//System.out.println(Calendar.DATE);//5
		cal.add(Calendar.DATE,-1);
		Date time=cal.getTime();
		System.out.println(new SimpleDateFormat("yyyyMMdd").format(time));
	}
}
