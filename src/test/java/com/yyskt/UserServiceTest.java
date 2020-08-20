package com.yyskt;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yyskt.entity.user.User;
import com.yyskt.service.IUserService;

//获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
@SpringBootTest
//让 JUnit 运行 Spring 的测试环境， 获得 Spring 环境的上下文的支持
@RunWith(SpringRunner.class)
class UserServiceTest {
	
	@Autowired
	private IUserService userService;

	@Test
	void testSelect() {
		List<User> select = userService.select(new User());
		System.out.println(select.get(0).getUserName());
	}
	
}
