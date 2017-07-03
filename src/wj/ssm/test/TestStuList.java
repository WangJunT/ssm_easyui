package wj.ssm.test;

import java.io.IOException;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wj.ssm.mapper.StudentListMapper;
import wj.ssm.po.StudentCT;
import wj.ssm.service.impl.CrudStuImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-dao.xml"}) 
public class TestStuList {
	@Autowired
	private CrudStuImpl crudStuImpl;
	@Autowired
	private StudentListMapper stuMapper;
	/**
	 * 对dao层的mapper进行测试
	 * @throws IOException
	 */
	@Test
	public void testStuList() throws IOException {
		/*String resource = "mybatis/sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sf.openSession();
		StudentListMapper studentListMapper = session.getMapper(StudentListMapper.class);*/
		List<StudentCT> list = stuMapper.studentList();
		System.out.println("dao"+list.size());
	}
	/**
	 * 对service 层进行单元测试
	 */
	@Test
	public void testServiceImpl(){
		List<StudentCT> list = crudStuImpl.findStuList();
		System.out.println("service"+list.size());
	}
}
