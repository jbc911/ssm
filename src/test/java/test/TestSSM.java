package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StringUtils;

import com.jbc.model.BUser;
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
		Random r = new Random();
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jbcdb?useUnicode=true&characterEncoding=UTF-8", "root", "admin");
			conn.setAutoCommit(false);
			PreparedStatement ps = conn
					.prepareStatement("insert into score_info(no,math,english,chinese,name) values(?,?,?,?,?)");
			for (int i = 1; i <= 10000000; i++) {
				ps.setString(1, "No." + i);
				ps.setDouble(2, r.nextInt(100) + (r.nextBoolean() ? 0.5d : 1.0d));
				ps.setDouble(3, r.nextInt(100) + (r.nextBoolean() ? 0.5d : 1.0d));
				ps.setDouble(4, r.nextInt(100) + (r.nextBoolean() ? 0.5d : 1.0d));
				ps.setString(5, UUID.randomUUID().toString());
				ps.addBatch();
				if (i % 10000 == 0) {
					System.out.println("提交10000");
					ps.executeBatch();
					conn.commit();
					ps.clearBatch();
				}
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
