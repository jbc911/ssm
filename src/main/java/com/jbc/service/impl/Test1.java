package com.jbc.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.jbc.entity.BUser;
import com.jbc.entity.Page;
import com.jbc.service.IUserService;

public class Test1 implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		System.out.println(dateFormat.format(new Date()) + "--执行");
		XmlWebApplicationContext context2 = null;
		try {
			//applicationContextKey从配置文件获取
			context2 = (XmlWebApplicationContext) context.getScheduler().getContext().get("applicationContextKey");
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		IUserService userService = context2.getBean("userService", IUserService.class);
		Page page = new Page();
		page.setStart(0);
		page.setLength(10);
		page = userService.findAll(page);
		List<?> data = page.getData();
		for (Object object : data) {
			object = (BUser) object;
			System.out.println(object.toString());
		}
	}

}
