package com.jbc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jbc.entity.Page;
import com.jbc.entity.ScoreInfo;
import com.jbc.service.ScoreInfoService;

@Controller
@RequestMapping("/score")
public class ScoreInfoController {
	@Autowired
	private ScoreInfoService scoreInfoService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		return "scoreInfoList";
	}

	@RequestMapping(value = "/page", method = RequestMethod.POST)
	@ResponseBody
	public Page findPage(@ModelAttribute ScoreInfo scoreInfo, HttpServletRequest request) {
		Page page = scoreInfoService.findPage(scoreInfo, new Page(request));
		return page;
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {
		this.scoreInfoService.deleteById(id);
	}
}
