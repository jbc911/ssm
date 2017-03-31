package test;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StringUtils;

import com.jbc.entity.BUser;
import com.jbc.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestSSM {
	@Autowired
	private IUserService userService;

	@Test
	public void testAdd() {
		BUser user = new BUser();
		for (int i = 0; i < 100; i++) {
			user.setUserName(UUID.randomUUID().toString());
			user.setUserPassword(UUID.randomUUID().toString());
			userService.save(user);
		}
	}

	public static void main(String[] args) {
		System.out.println(StringUtils.delete("adca", "a"))
		
		;
	}
}
