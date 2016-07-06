package com.jbc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.jbc.model.BUser;

public interface BUserMapper {
	int deleteByPrimaryKey(Integer userId);

	int insert(BUser record);

	int insertSelective(BUser record);

	BUser selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(BUser record);

	int updateByPrimaryKey(BUser record);

	List<BUser> findAll();
}