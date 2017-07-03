package wj.ssm.service;

import java.util.List;

import wj.ssm.po.Page;
import wj.ssm.po.StudentCT;

public interface CrudStu {
	public List<StudentCT> findStuList();
	public int findStuCount();
	public List<StudentCT> findStuLimit(Page page);
}
