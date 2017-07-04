package wj.ssm.mapper;

import java.util.List;

import wj.ssm.po.Page;
import wj.ssm.po.StudentCT;
import wj.ssm.po.StudentVO;

public interface StudentListMapper {
	//查询所有
	public List<StudentCT> studentList();
	//查询数目
	public int studentCount();
	//查询分页
	public List<StudentCT> studentLimit(Page page);
	//有选择性的插入
	public int insertStu(StudentVO stu);
	//更改信息
	public int updateByPrimaryKeySel(StudentVO stu);
}
