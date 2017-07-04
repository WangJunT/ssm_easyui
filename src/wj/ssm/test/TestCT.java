package wj.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wj.ssm.mapper.CourseMapper;
import wj.ssm.mapper.TeacherMapper;
import wj.ssm.po.Teacher;
import wj.ssm.po.TeacherExample;
import wj.ssm.service.impl.CTSelectImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-dao.xml"}) 
public class TestCT {
	@Autowired
	CTSelectImpl courseMapper;
	@Autowired
	TeacherMapper tacherMapper;
	@Test
	public void testCt(){
		TeacherExample te = new TeacherExample();
		List<Teacher> t = courseMapper.findAllTeacher(te);
		System.out.println(t);
	}
}
