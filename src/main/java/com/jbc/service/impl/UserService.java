package com.jbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jbc.mapper.BUserMapper;
import com.jbc.model.BUser;
import com.jbc.service.IUserService;

@Service("userService")
public class UserService implements IUserService {
	@Autowired
	private BUserMapper userMapper;

	@Override
	public List<BUser> findAll() {
		List<BUser> list = this.userMapper.findAll();
		return list;
	}

	@Override
	public void deleteById(int id) {
		this.userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void save(BUser user) {
		this.userMapper.insert(user);
	}

	@Override
	public void saveTest() throws Exception{
		try {
			// TODO 测试事务
			deleteById(1);
			BUser user = new BUser();
			user.setUserId(2);
			user.setUserName("测试事务");
			save(user);
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
