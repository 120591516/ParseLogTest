package com.wx.mapper;

import com.wx.pojo.UrlType;
import com.wx.pojo.UrlTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UrlTypeMapper {
    int countByExample(UrlTypeExample example);

    int deleteByExample(UrlTypeExample example);

    int deleteByPrimaryKey(Integer urlTypeId);

    int insert(UrlType record);

    int insertSelective(UrlType record);

    List<UrlType> selectByExample(UrlTypeExample example);

    UrlType selectByPrimaryKey(Integer urlTypeId);

    int updateByExampleSelective(@Param("record") UrlType record, @Param("example") UrlTypeExample example);

    int updateByExample(@Param("record") UrlType record, @Param("example") UrlTypeExample example);

    int updateByPrimaryKeySelective(UrlType record);

    int updateByPrimaryKey(UrlType record);
}