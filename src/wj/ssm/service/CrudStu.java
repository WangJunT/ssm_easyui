package wj.ssm.service;

import java.util.List;

import wj.ssm.po.Page;
import wj.ssm.po.StudentCT;
import wj.ssm.po.StudentVO;

public interface CrudStu {
	//所有学生
	public List<StudentCT> findStuList();
	//学生总数
	public int findStuCount();
	//分页查询
	public List<StudentCT> findStuLimit(Page page);
	//插入
	public int insertStu(StudentVO stu);
	//更改
	public int updateStu(StudentVO stu);
	//删除
	public int delStu(Integer id);
}
