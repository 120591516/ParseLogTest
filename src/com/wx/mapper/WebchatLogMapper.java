package com.wx.mapper;

import com.wx.pojo.WebchatLog;
import com.wx.pojo.WebchatLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebchatLogMapper {
    int countByExample(WebchatLogExample example);

    int deleteByExample(WebchatLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(WebchatLog record);

    int insertSelective(WebchatLog record);

    List<WebchatLog> selectByExample(WebchatLogExample example);

    WebchatLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") WebchatLog record, @Param("example") WebchatLogExample example);

    int updateByExample(@Param("record") WebchatLog record, @Param("example") WebchatLogExample example);

    int updateByPrimaryKeySelective(WebchatLog record);

    int updateByPrimaryKey(WebchatLog record);
}