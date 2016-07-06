package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jbc.mapper.BUserMapper;
import com.jbc.model.BUser;
import com.jbc.service.IUserService;

public class TestSSM {
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml", "classpath:spring-mybatis.xml" });
		IUserService userService = (IUserService)ac.getBean("userService");
//		BUserMapper dao = ac.getBean(BUserMapper.class);
//		BUser record = new BUser();
//		record.setUserId(1);
//		record.setUserName("季秉昌");
//		dao.insert(record );
		try {
			userService.saveTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
