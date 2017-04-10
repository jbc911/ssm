package com.jbc.service;

import com.jbc.entity.BUser;
import com.jbc.entity.Page;

public interface IUserService {
	public Page findAll(Page page);

	public void deleteById(int id);

	public void save(BUser user);

	public void saveTest() throws Exception;
}
