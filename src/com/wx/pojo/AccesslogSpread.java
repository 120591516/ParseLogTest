package com.wx.pojo;

import java.text.SimpleDateFormat;

public class AccesslogSpread extends Accesslog {
	private static SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	private String productPath;

	public String getProductPath() {
		return productPath;
	}

	public void setProductPath(String productPath) {
		this.productPath = productPath;
	}

	@Override
	public String toString() {
		return this.productPath + "\t" + this.getIp() + "\t" + dayFormat.format(this.getAccesstime()) + "\t"
				+ timeFormat.format(this.getStarttime()) + "\t" + timeFormat.format(this.getEndtime());
	}
}
