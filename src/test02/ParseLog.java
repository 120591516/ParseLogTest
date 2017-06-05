package test02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import com.wx.pojo.Accesslog;

import util.MyPredicate;

public class ParseLog {
	private static String wxUrlPrefix = "/ComeIn?m=setOneProductNew&";// 微信服务号平台
	private static String wxNurse114UrlPrefix = "/wxNurse114/ComeIn?m=setOneProductNew&";// 微信114生活助手
	// private static String APPLYSTRING = "写过的新闻";
	// private static String SEARCHSTRING = "正在搜索新闻：";
	// private static String USERTAG = "用户：";
	/**
	 * 用戶名，用戶行為，以key-value方式存储 用户行为 以json方式存储
	 * 
	 * @throws Exception
	 */
	private static SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd");
	private static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

	/**
	 * 读取文件信息
	 * 
	 * @param fileName
	 *            文件路径D:\Program
	 *            Files\eclipse\workspace\ParseLogTest\src\access_20170604.log
	 * @throws Exception
	 */
	public static void readFileByLines(String fileName) throws Exception {
		File file = new File(fileName);
		BufferedReader reader = null;

		try {
			System.out.println("以行为单位读取文件内容，一次读一整行：");
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
			reader = new BufferedReader(isr);
			String tempString = null;
			List<Accesslog> list = new ArrayList<Accesslog>();
			Accesslog accesslog = null;
			String dayTime = fileName.substring(fileName.length() - 12, fileName.length() - 4);
			System.out.println("当前时间：" + dayTime);
			System.out.println(dayFormat.parse(dayTime));
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				// 获取访问时间的小时数
				// 获取当前访问时间的时分秒
				if (tempString.contains(wxUrlPrefix)) {
					accesslog = new Accesslog();
					int timeIndex = tempString.indexOf(":");
					String hourse = tempString.substring(timeIndex + 1, timeIndex + 3);
					System.out.println("开始的小时" + hourse);
					String startTime = hourse + ":00:00";
					String endTime = hourse + ":59:59";
					System.out.println("开始时间" + startTime);
					System.out.println(timeFormat.parse(startTime));
					System.out.println("结束时间" + endTime);
					System.out.println(timeFormat.parse(endTime));
					// 获取ip地址
					int ipindex = tempString.indexOf("-");
					String ipaddress = tempString.substring(0, ipindex - 1);
					System.out.println(ipaddress);
					// 获取产品地址
					int urlindex = tempString.indexOf(wxUrlPrefix);
					String urladdress = tempString.substring(urlindex, urlindex + wxUrlPrefix.length() + 5);
					System.out.println(urladdress);
					// 获取访问时间
					int dateStartIndex = tempString.indexOf("[");
					int dateEndIndex = tempString.indexOf("]");
					String dateStr = tempString.substring(dateStartIndex + 1, dateEndIndex);
					System.out.println(dateStr);
					accesslog.setAccesstime(dayFormat.parse(dayTime));
					accesslog.setIp(ipaddress);
					accesslog.setStarttime(timeFormat.parse(startTime));
					accesslog.setEndtime(timeFormat.parse(endTime));
					accesslog.setProductName(urladdress);
					list.add(accesslog);
				}
			}
			reader.close();
			for (Accesslog accesslog2 : list) {

				System.out.println(accesslog2);
			}
			Predicate predicate = new MyPredicate("ip", "223.85.220.208");
			List<Accesslog> select = (List<Accesslog>) CollectionUtils.select(list, predicate);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		// System.out.println(Calendar.DATE);//5
		cal.add(Calendar.DATE, -1);
		Date time = cal.getTime();
		String yesterday = dayFormat.format(time);
		System.out.println(System.getProperty("user.dir"));
		System.out.println("\\src\\access_" + yesterday + ".log");
		ParseLog.readFileByLines(System.getProperty("user.dir") + "\\src\\access_" + yesterday + ".log");
	}

	/**
	 * 判断某一时间是否在一个区间内
	 * 
	 * @param sourceTime
	 *            时间区间,半闭合,如[10:00:00-20:00:00)
	 * @param curTime
	 *            需要判断的时间 如10:00:00
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static boolean isInTime(String sourceTime, String curTime) {
		if (sourceTime == null || !sourceTime.contains("-") || !sourceTime.contains(":")) {
			throw new IllegalArgumentException("Illegal Argument arg:" + sourceTime);
		}
		if (curTime == null || !curTime.contains(":")) {
			throw new IllegalArgumentException("Illegal Argument arg:" + curTime);
		}
		String[] args = sourceTime.split("-");
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		try {
			long now = sdf.parse(curTime).getTime();
			long start = sdf.parse(args[0]).getTime();
			long end = sdf.parse(args[1]).getTime();
			if (args[1].equals("00:00:00")) {
				args[1] = "24:00:00";
			}
			if (end < start) {
				if (now >= end && now < start) {
					return false;
				} else {
					return true;
				}
			} else {
				if (now >= start && now < end) {
					return true;
				} else {
					return false;
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Illegal Argument arg:" + sourceTime);
		}

	}
}
