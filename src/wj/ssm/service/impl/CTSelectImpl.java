package wj.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wj.ssm.mapper.CourseMapper;
import wj.ssm.mapper.TeacherMapper;
import wj.ssm.po.Course;
import wj.ssm.po.CourseExample;
import wj.ssm.po.Teacher;
import wj.ssm.po.TeacherExample;

@Service("cTSelectImpl")
public class CTSelectImpl implements wj.ssm.service.CTSelect {
	@Autowired
	CourseMapper courseMapper;
	@Autowired
	TeacherMapper tacherMapper;

	@Override
	public List<Course> findAllCourse(CourseExample cExample) {
		CourseExample.Criteria c = cExample.createCriteria();
		return courseMapper.selectByExample(cExample);
	}

	@Override
	public List<Teacher> findAllTeacher(TeacherExample tExample) {
		TeacherExample.Criteria c = tExample.createCriteria();
		return tacherMapper.selectByExample(tExample);
	}

}
