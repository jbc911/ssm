package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jbc.entity.BUser;
import com.jbc.service.IUserService;
import com.jbc.service.impl.Test1;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestSSM {
	@Autowired
	private IUserService userService;
	@Autowired
	private Scheduler scheduler;

	@Test
	public void testAdd() {
		BUser user = new BUser();
		for (int i = 0; i < 100; i++) {
			user.setUserName(UUID.randomUUID().toString());
			user.setUserPassword(UUID.randomUUID().toString());
			userService.save(user);
		}
	}

	@Test
	public void testQuartz() {
		JobDetail jobDetail = JobBuilder.newJob(Test1.class).withIdentity("test", "group").build();
		CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("test", "group").withSchedule(scheduleBuilder)
				.build();
		try {
			scheduler.scheduleJob(jobDetail, trigger);
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDelQuartz() {
		try {
			scheduler.deleteJob(new JobKey("test", "group"));
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Random r = new Random();
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.134.129:3306/jbcdb?useUnicode=true&characterEncoding=UTF-8", "root", "admin");
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement(
					"insert into score_info(no,math,english,chinese,name,grade,clazz) values(?,?,?,?,?,?,?)");
			for (int i = 1; i <= 10000000; i++) {
				ps.setString(1, "No." + i);
				ps.setDouble(2, r.nextInt(100) + (r.nextBoolean() ? 0.5d : 1.0d));
				ps.setDouble(3, r.nextInt(100) + (r.nextBoolean() ? 0.5d : 1.0d));
				ps.setDouble(4, r.nextInt(100) + (r.nextBoolean() ? 0.5d : 1.0d));
				ps.setString(5, ChineseName.next(r));
				ps.setInt(6, r.nextInt(6) + 1);
				ps.setInt(7, r.nextInt(10) + 1);
				ps.addBatch();
				if (i % 50000 == 0) {
					System.out.println("提交50000");
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
