package com.jbc.mapper;

import com.jbc.entity.ScoreInfo;
import com.jbc.entity.ScoreInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreInfoMapper {
    int countByExample(ScoreInfoExample example);

    int deleteByExample(ScoreInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScoreInfo record);

    int insertSelective(ScoreInfo record);

    List<ScoreInfo> selectByExample(ScoreInfoExample example);

    ScoreInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScoreInfo record, @Param("example") ScoreInfoExample example);

    int updateByExample(@Param("record") ScoreInfo record, @Param("example") ScoreInfoExample example);

    int updateByPrimaryKeySelective(ScoreInfo record);

    int updateByPrimaryKey(ScoreInfo record);
}