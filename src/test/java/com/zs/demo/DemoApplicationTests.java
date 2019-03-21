package com.zs.demo;

import com.zs.demo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test1() {
		System.out.println("hello test");
	}

	@Test
	public void test2() {
		Assert.assertEquals(3, userMapper.getAll().size());
		Assert.assertTrue("TRUE, STATUS equals to 200", userMapper.getAll().size() == 200);
	}

}
