package wj.ssm.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import wj.ssm.controller.CrudStudent;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // 调用Spring单元测试类
@WebAppConfiguration // 调用Java Web组件，如自动注入ServletContext Bean等
@ContextConfiguration(locations = { "classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-dao.xml","classpath:spring/springmvc.xml" }) // 加载Spring配置文件
//@ContextConfiguration(locations = { "classpath*:spring/applicationContext-*.xml","classpath:spring/springmvc.xml" })
public class TestController {
	@Autowired
	private CrudStudent crudStudent;

	// @Mock
	// private MembersService service;
	//
	// @InjectMocks
	// private MembersController controller; // 需要测试的Controller

	private MockMvc mockMvc; // SpringMVC提供的Controller测试类

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(crudStudent).build();
	}

	@Test
	public void Ctest() throws Exception {
		ResultActions resultActions = this.mockMvc.perform(MockMvcRequestBuilders.get("/stuList"));
		MvcResult mvcResult = resultActions.andReturn();
		String result = mvcResult.getResponse().getContentAsString();
		System.out.println("=====客户端获得反馈数据:" + result);
		// 也可以从response里面取状态码，header,cookies...
		// System.out.println(mvcResult.getResponse().getStatus());
	}

}
