package wj.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wj.ssm.po.StudentCT;
import wj.ssm.service.impl.CrudStuImpl;

@Controller

public class CrudStudent {
	@Autowired
	private CrudStuImpl crudStuImpl;
	
	@RequestMapping("/stuList")
	public @ResponseBody List<StudentCT> stuList(){
		return crudStuImpl.findStuList();
	}
}
