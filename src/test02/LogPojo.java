package test02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogPojo {
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private String urlName;
	private String ipAddress;
	private Date accesstime;
	private String ipAdd;
	public String getUrlName() {
		return urlName;
	}
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Date getAccesstime() {
		return accesstime;
	}
	public void setAccesstime(Date accesstime) {
		this.accesstime = accesstime;
	}
	public String getIpAdd() {
		return ipAdd;
	}
	public void setIpAdd(String ipAdd) {
		this.ipAdd = ipAdd;
	}
	@Override
	public String toString() {
		return "访问ip是"+this.ipAddress+"\t访问ip区域是"+this.ipAdd+"\t在"+format.format(this.accesstime)+"时间访问"+this.urlName;
	}	
}
