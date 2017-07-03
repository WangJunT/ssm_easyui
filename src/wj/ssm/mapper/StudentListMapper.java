package wj.ssm.mapper;

import java.util.List;

import wj.ssm.po.Page;
import wj.ssm.po.StudentCT;

public interface StudentListMapper {
	public List<StudentCT> studentList();
	public int studentCount();
	public List<StudentCT> studentLimit(Page page);
}
