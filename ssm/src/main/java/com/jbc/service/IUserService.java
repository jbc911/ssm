package com.jbc.service;

import java.util.List;

import com.jbc.model.BUser;

public interface IUserService {
	public List<BUser> findAll();

	public void deleteById(int id);

	public void save(BUser user);

	public void saveTest() throws Exception;
}
