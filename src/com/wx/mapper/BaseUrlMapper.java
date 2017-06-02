package com.wx.mapper;

import com.wx.pojo.BaseUrl;
import com.wx.pojo.BaseUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseUrlMapper {
    int countByExample(BaseUrlExample example);

    int deleteByExample(BaseUrlExample example);

    int deleteByPrimaryKey(Integer urlId);

    int insert(BaseUrl record);

    int insertSelective(BaseUrl record);

    List<BaseUrl> selectByExample(BaseUrlExample example);

    BaseUrl selectByPrimaryKey(Integer urlId);

    int updateByExampleSelective(@Param("record") BaseUrl record, @Param("example") BaseUrlExample example);

    int updateByExample(@Param("record") BaseUrl record, @Param("example") BaseUrlExample example);

    int updateByPrimaryKeySelective(BaseUrl record);

    int updateByPrimaryKey(BaseUrl record);
}