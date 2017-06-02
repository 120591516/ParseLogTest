package com.wx.pojo;

public class UrlType {
    private Integer urlTypeId;

    private String urlTypeName;

    public Integer getUrlTypeId() {
        return urlTypeId;
    }

    public void setUrlTypeId(Integer urlTypeId) {
        this.urlTypeId = urlTypeId;
    }

    public String getUrlTypeName() {
        return urlTypeName;
    }

    public void setUrlTypeName(String urlTypeName) {
        this.urlTypeName = urlTypeName == null ? null : urlTypeName.trim();
    }
}