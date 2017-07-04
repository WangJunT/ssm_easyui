package wj.ssm.service;

import java.util.List;

import wj.ssm.po.Course;
import wj.ssm.po.CourseExample;
import wj.ssm.po.Teacher;
import wj.ssm.po.TeacherExample;

public interface CTSelect {
	public List<Course> findAllCourse(CourseExample cExample);
	public List<Teacher> findAllTeacher(TeacherExample tExample);
}
