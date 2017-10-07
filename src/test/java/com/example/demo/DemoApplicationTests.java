package com.example.demo;

import com.example.demo.controller.DemoRestController;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public abstract class DemoApplicationTests {

	@Autowired
	private DemoRestController demoRestController;

	@Before
	public void contextLoads() {
		RestAssuredMockMvc.standaloneSetup(demoRestController);
	}

}
