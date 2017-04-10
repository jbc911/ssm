package com.jbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jbc.entity.BUser;
import com.jbc.entity.BUserExample;
import com.jbc.entity.Page;
import com.jbc.mapper.BUserMapper;
import com.jbc.service.IUserService;

@Service("userService")
public class UserService implements IUserService {
	@Autowired
	private BUserMapper userMapper;

	@Override
	public Page findAll(Page page) {
		BUserExample example = new BUserExample();
		com.github.pagehelper.Page<Object> startPage = PageHelper.startPage(page.getStart() / page.getLength() + 1,
				page.getLength());
		List<BUser> list = this.userMapper.selectByExample(example);
		return new Page((int) startPage.getTotal(), list);
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
	public void saveTest() throws Exception {
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
