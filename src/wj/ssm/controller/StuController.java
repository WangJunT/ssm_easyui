package wj.ssm.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wj.ssm.po.StudentVO;
import wj.ssm.service.impl.CrudStuImpl;

@Controller
public class StuController {
	@Autowired
	CrudStuImpl crudImpl;
	@RequestMapping("/addStu")
	public @ResponseBody Map addStu(StudentVO stu){
		int num = crudImpl.insertStu(stu);
		Map map = new LinkedHashMap<>();
		if (num == 1){
			map.put("result", true);
			map.put("message", "创建成功");
		}
		else{
			map.put("result", false);
			map.put("message", "创建失败");
		}
		return map;
	}
	@RequestMapping("/updateStu")
	public @ResponseBody Map updateStu(StudentVO stu){
		int num = crudImpl.updateStu(stu);
		Map map = new LinkedHashMap<>();
		if (num == 1){
			map.put("result", true);
			map.put("message", "更改成功");
		}
		else{
			map.put("result", false);
			map.put("message", "更改失败");
		}
		return map;
	}
	@RequestMapping("/delStu")
	public @ResponseBody Map delStu(Integer id){
		int num = crudImpl.delStu(id);
		Map map = new LinkedHashMap<>();
		if (num == 1){
			map.put("result", true);
			map.put("message", "删除成功");
		}
		else{
			map.put("result", false);
			map.put("message", "删除失败");
		}
		return map;
	}
}
