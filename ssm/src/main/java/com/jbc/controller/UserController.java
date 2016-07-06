package com.jbc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbc.model.BUser;
import com.jbc.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping("/findAll")
	public String findAll(HttpServletRequest req,HttpServletResponse res){
		List<BUser> list = this.userService.findAll();
		req.setAttribute("userList", list);
		System.out.println(list);
		return "userList";
	}
}
