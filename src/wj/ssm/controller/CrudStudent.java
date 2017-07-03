package wj.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wj.ssm.po.Page;
import wj.ssm.po.StudentCT;
import wj.ssm.service.impl.CrudStuImpl;

@Controller

public class CrudStudent {
	@Autowired
	private CrudStuImpl crudStuImpl;
	
	@RequestMapping("/stuList")
	public @ResponseBody  Map stuList(HttpServletRequest request){
		int rows = Integer.parseInt(request.getParameter("rows"));
		int page = Integer.parseInt(request.getParameter("page"));
		Page page1 = new Page();
		page1.setStart((page-1)*rows);
		page1.setSize(rows);
		int total = crudStuImpl.findStuCount();
		List<StudentCT> list = crudStuImpl.findStuLimit(page1);
		Map jmap=new  HashMap();
		//Jmap.put("total", list.size());
		jmap.put("total", total);
		jmap.put("rows",list );
		return jmap;
	}
}
