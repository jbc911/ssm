package com.jbc.service;

import com.jbc.entity.Page;
import com.jbc.entity.ScoreInfo;

public interface ScoreInfoService {
	public Page findPage(ScoreInfo scoreInfo, Page page);

	public void deleteById(int id);
}
