package com.myhome.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.myhome.dto.UproductDto;
import com.myhome.service.JonggeunService;

@Controller
public class JonggeunController {
	
	@Autowired
	JonggeunService jonggeunService;
	
	//클래스변수(전역)변수
	public static String path = "file///C:/eclipse-workspace7/myhome/src/main/webapp/data";
	
	
	@GetMapping("ordlList")
	public String selectOrdlList(UproductDto dto,ModelMap model) throws Exception {
		
		List<?> list = jonggeunService.selectOrdlList(dto);
		model.addAttribute("list",list); // (변수명,데이터값)
		return "jonggeun/ordlList";
	}
}
