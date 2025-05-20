package com.myhome.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;
import com.myhome.service.JonggeunService;

@Controller
public class JonggeunController {
	
	@Autowired
	JonggeunService jonggeunService;
	
	//클래스변수(전역)변수
	public static String path = "file///C:/eclipse-workspace7/myhome/src/main/webapp/data";
	
	// 주문/배송 조회 기본화면
	@GetMapping("ordlList")
	public String selectOrdlList(UproductDto dto,ModelMap model) throws Exception {
		
		
		List<?> list = jonggeunService.selectOrdlList(dto);
		int    total = jonggeunService.selectDataTotal(dto);
		
		// 연산처리를 위해 dto에 값을 세팅(보냄)
		dto.setTotal(total);

		// 총 페이지 개수를 계산 시키는 장면
		dto.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = dto.getTotalpage();

		// SQL에 적용할 시작번호
		// 시작 번호의 계산 후 관련 변수에 값을 넣어 줌
		dto.setFirstIndex();
		
		// SQL에 적용할 종료번호
		// 끝 번호의 계산 후 관련 변수에 값을 넣어 줌
		dto.setLastIndex();
		
		model.addAttribute("list",list); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		
		return "jonggeun/ordlList";
	}
	
	// 주문/배송 조회 결제완료순 화면
	@GetMapping("ordlListPay")
	public String selectOrdlListPay(UproductDto upr,UpaymentDto upy,ModelMap model) throws Exception {
		
		int 	 cnt  = jonggeunService.selectOrdlListPay1(upy);
		List<?> list  = jonggeunService.selectOrdlListPay2(upr);
		int     total = jonggeunService.selectDataTotal(upr);
		
		// 연산처리를 위해 dto에 값을 세팅(보냄)
		upr.setTotal(total);

		// 총 페이지 개수를 계산 시키는 장면
		upr.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = upr.getTotalpage();

		// SQL에 적용할 시작번호
		// 시작 번호의 계산 후 관련 변수에 값을 넣어 줌
		upr.setFirstIndex();
		
		// SQL에 적용할 종료번호
		// 끝 번호의 계산 후 관련 변수에 값을 넣어 줌
		upr.setLastIndex();
		
		model.addAttribute("list",list); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		
		if (cnt == 1) return "jonggeun/ordlListPay";
		else		  return null;
	}
}