package com.wx.pojo;

public class BaseUrl {
    private Integer urlId;

    private String urlDesc;

    private String urlName;

    private Integer urlTypeId;

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public String getUrlDesc() {
        return urlDesc;
    }

    public void setUrlDesc(String urlDesc) {
        this.urlDesc = urlDesc == null ? null : urlDesc.trim();
    }

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName == null ? null : urlName.trim();
    }

    public Integer getUrlTypeId() {
        return urlTypeId;
    }

    public void setUrlTypeId(Integer urlTypeId) {
        this.urlTypeId = urlTypeId;
    }
}