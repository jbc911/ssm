package com.jbc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jbc.model.BUser;
import com.jbc.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/user")
	public String tofindAll(HttpServletRequest req, HttpServletResponse res) {
		return "userList";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public List<BUser> findAll() {
		List<BUser> list = this.userService.findAll();
		return list;
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable("id") int id) {
		this.userService.deleteById(id);
	}
}
