package wj.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wj.ssm.po.CourseExample;
import wj.ssm.po.Page;
import wj.ssm.po.StudentCT;
import wj.ssm.po.Teacher;
import wj.ssm.po.TeacherExample;
import wj.ssm.service.impl.CTSelectImpl;
import wj.ssm.service.impl.CrudStuImpl;

@Controller

public class CrudStudent {
	@Autowired
	private CrudStuImpl crudStuImpl;
	@Autowired
	private CTSelectImpl cTSelectImpl;
	@RequestMapping("/stuList")
	public @ResponseBody Map stuList(HttpServletRequest request) {
		// 获取前端界面的页数和行数
		int rows = Integer.parseInt(request.getParameter("rows"));
		int page = Integer.parseInt(request.getParameter("page"));
		Page page1 = new Page();
		page1.setStart((page - 1) * rows);
		page1.setSize(rows);
		// 获取总的记录数
		int total = crudStuImpl.findStuCount();
		List<StudentCT> list = crudStuImpl.findStuLimit(page1);
		// 将查到的数据数还有总数返回
		Map jmap = new HashMap();
		jmap.put("total", total);
		jmap.put("rows", list);
		return jmap;
	}
	@RequestMapping("/teaList")
	public @ResponseBody List<Map<String, String>> teaList(){
		TeacherExample tExample = new TeacherExample();
		List list = cTSelectImpl.findAllTeacher(tExample);
		Map map = new HashMap();
		map.put("id",-1);
		map.put("tName","请选择老师");
		list.add(0,map);
		return list;
	}
	@RequestMapping("/corList")
	public @ResponseBody List corList(){
		CourseExample  cExample = new CourseExample();
		List list = cTSelectImpl.findAllCourse(cExample);
		Map map = new HashMap();
		map.put("id",-1);
		map.put("course","请选择课程");
		list.add(0,map);
		return list;
	}
}
