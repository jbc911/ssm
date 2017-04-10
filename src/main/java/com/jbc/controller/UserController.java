package com.jbc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jbc.entity.BUser;
import com.jbc.entity.Page;
import com.jbc.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String tofindAll(HttpServletRequest req, HttpServletResponse res) {
		return "userList";
	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public Page findAll(@ModelAttribute Page page) {
		return this.userService.findAll(page);
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@PathVariable("id") int id) {
		this.userService.deleteById(id);
	}

	@RequestMapping(value = "/add/{name}", method = RequestMethod.GET)
	@ResponseBody
	public void add(@PathVariable("name") String name) {
		BUser user = new BUser();
		user.setUserName(name);
		this.userService.save(user);
	}

}
