package com.ejiaren_c1.mapper;

import com.ejiaren_c1.pojo.BaseUserInfo;
import com.ejiaren_c1.pojo.BaseUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseUserInfoMapper {
    int countByExample(BaseUserInfoExample example);

    int deleteByExample(BaseUserInfoExample example);

    int deleteByPrimaryKey(String loginId);

    int insert(BaseUserInfo record);

    int insertSelective(BaseUserInfo record);

    List<BaseUserInfo> selectByExample(BaseUserInfoExample example);

    BaseUserInfo selectByPrimaryKey(String loginId);

    int updateByExampleSelective(@Param("record") BaseUserInfo record, @Param("example") BaseUserInfoExample example);

    int updateByExample(@Param("record") BaseUserInfo record, @Param("example") BaseUserInfoExample example);

    int updateByPrimaryKeySelective(BaseUserInfo record);

    int updateByPrimaryKey(BaseUserInfo record);
}