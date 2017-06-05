package test02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ParseLog {
	private static String wxUrlPrefix = "/ComeIn?m=setOneProductNew&";//微信服务号平台
	private static String wxNurse114UrlPrefix = "/wxNurse114/ComeIn?m=setOneProductNew&";//微信114生活助手
//	private static String APPLYSTRING = "写过的新闻";
//	private static String SEARCHSTRING = "正在搜索新闻：";
//	private static String USERTAG = "用户：";
	/**
	 * 用戶名，用戶行為，以key-value方式存储 用户行为 以json方式存储
	 * @throws Exception 
	 */
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	static String  logFileName = "access_";
	static String today = sdf.format(new Date());
	
	public static void readFileByLines(String fileName) throws Exception {
		File file = new File(fileName);
		BufferedReader reader = null;
		
		try {
			System.out.println("以行为单位读取文件内容，一次读一整行：");
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
			reader = new BufferedReader(isr);
			String tempString = null;
//			List<WebchatLog> list = new ArrayList<>();
//			WebchatLog lp =null;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				if (tempString.contains(wxUrlPrefix)) {
					int ipindex = tempString.indexOf("-");
					String ipaddress = tempString.substring(0, ipindex-1);
					System.out.println(ipaddress);
					int urlindex = tempString.indexOf(wxUrlPrefix);
					String urladdress = tempString.substring(urlindex,urlindex+wxUrlPrefix.length()+5);
					System.out.println(urladdress);
					int dateStartIndex =tempString.indexOf("[");
					int dateEndIndex =tempString.indexOf("]");
					String dateStr = tempString.substring(dateStartIndex+1, dateEndIndex);
					System.out.println(dateStr);
//					lp = new WebchatLog();
//					lp.setLogIp(ipaddress);
//					lp.setLogTime(NginxDateTest.parseNginxDate(dateStr));
//					lp.setLogUrl(urladdress);
//					list.add(lp);
				}
			}
			reader.close();
//			for (WebchatLog logPojo : list) {
//				System.out.println(logPojo.toString());
//			}
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
		System.out.println(System.getProperty("user.dir"));
		ParseLog.readFileByLines(System.getProperty("user.dir") + "\\src\\access_20170601.log");
		System.out.println(today);
		System.out.println(logFileName+today+".log");
	}
}
