package com.jbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jbc.entity.Page;
import com.jbc.entity.ScoreInfo;
import com.jbc.entity.ScoreInfoExample;
import com.jbc.entity.ScoreInfoExample.Criteria;
import com.jbc.mapper.ScoreInfoMapper;
import com.jbc.service.ScoreInfoService;

@Service("scoreInfoService")
public class ScoreInfoServiceImpl implements ScoreInfoService {
	@Autowired
	private ScoreInfoMapper scoreInfoMapper;

	@Override
	public Page findPage(ScoreInfo scoreInfo, Page page) {
		ScoreInfoExample example = new ScoreInfoExample();
		if (scoreInfo != null) {
			Criteria criteria = example.createCriteria();
			if (scoreInfo.getName() != null && !scoreInfo.getName().equals("")) {
				criteria.andNameLike(scoreInfo.getName() + "%");
			}
			if (scoreInfo.getMath() != null && scoreInfo.getMath() != 0) {
				criteria.andMathEqualTo(scoreInfo.getMath());
			}
		}
		com.github.pagehelper.Page<Object> startPage = PageHelper.startPage(page.getStart() / page.getLength() + 1,
				page.getLength());
		List<ScoreInfo> list = scoreInfoMapper.selectByExample(example);
		return new Page((int) startPage.getTotal(), list);
	}

	@Override
	public void deleteById(int id) {
		this.scoreInfoMapper.deleteByPrimaryKey(id);
	}

}
