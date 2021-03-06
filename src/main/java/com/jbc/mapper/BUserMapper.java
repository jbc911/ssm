package com.jbc.mapper;

import com.jbc.entity.BUser;
import com.jbc.entity.BUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BUserMapper {
    int countByExample(BUserExample example);

    int deleteByExample(BUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(BUser record);

    int insertSelective(BUser record);

    List<BUser> selectByExample(BUserExample example);

    BUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") BUser record, @Param("example") BUserExample example);

    int updateByExample(@Param("record") BUser record, @Param("example") BUserExample example);

    int updateByPrimaryKeySelective(BUser record);

    int updateByPrimaryKey(BUser record);
}