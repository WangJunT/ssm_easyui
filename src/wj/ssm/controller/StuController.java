package wj.ssm.controller;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import wj.ssm.po.StudentVO;
import wj.ssm.service.impl.CrudStuImpl;

@Controller
public class StuController {
	@Autowired
	CrudStuImpl crudImpl;

	@RequestMapping("/addStu")
	public @ResponseBody Map addStu(StudentVO stu) {
		System.out.println(stu.getImage());
		int num = crudImpl.insertStu(stu);
		Map map = new LinkedHashMap<>();
		if (num == 1) {
			map.put("result", true);
			map.put("message", "创建成功");
		} else {
			map.put("result", false);
			map.put("message", "创建失败");
		}
		return map;
	}

	@RequestMapping("/updateStu")
	public @ResponseBody Map updateStu(StudentVO stu) throws Exception {
		int num = crudImpl.updateStu(stu);
		Map map = new LinkedHashMap<>();
		if (num == 1) {
			map.put("result", true);
			map.put("message", "更改成功");
		} else {
			map.put("result", false);
			map.put("message", "更改失败");
		}
		return map;
	}

	@RequestMapping("/delStu")
	public @ResponseBody Map delStu(Integer id) {
		int num = crudImpl.delStu(id);
		Map map = new LinkedHashMap<>();
		if (num == 1) {
			map.put("result", true);
			map.put("message", "删除成功");
		} else {
			map.put("result", false);
			map.put("message", "删除失败");
		}
		return map;
	}

	@RequestMapping("/upPic")
	public @ResponseBody Map<String,Object> upPic(MultipartFile picture) throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		// 原始名称
		String originalFilename = picture.getOriginalFilename();
		// 上传图片
		if (picture != null && originalFilename != null && originalFilename.length() > 0) {

			// 存储图片的物理路径
			String pic_path = "F:\\FFOutput\\";

			// 新的图片名称
			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
			// 新图片
			File newFile = new File(pic_path + newFileName);

			// 将内存中的数据写入磁盘
			picture.transferTo(newFile);
			map.put("message", "Y");
			map.put("filename", newFileName);
		}
		return map;
	}

}
