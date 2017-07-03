package wj.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wj.ssm.mapper.StudentListMapper;
import wj.ssm.po.Page;
import wj.ssm.po.StudentCT;
import wj.ssm.service.CrudStu;

@Service("crudStuImpl")
public class CrudStuImpl implements CrudStu {
	@Autowired
	private StudentListMapper stulistMapper;
	@Override
	public List<StudentCT> findStuList() {
		return stulistMapper.studentList();
	}
	@Override
	public int findStuCount() {
		// TODO Auto-generated method stub
		return stulistMapper.studentCount();
	}
	@Override
	public List<StudentCT> findStuLimit(Page page) {
		// TODO Auto-generated method stub
		return stulistMapper.studentLimit(page);
	}

}
