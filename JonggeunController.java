package com.myhome.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.myhome.dto.UorderDto;
import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;
import com.myhome.dto.DetailDto;
import com.myhome.service.JonggeunService;

@Controller
public class JonggeunController {
	
	@Autowired
	JonggeunService jonggeunService;
	
	//클래스변수(전역)변수 (이미지파일 저장경로)
	public static String path = "file///C:/eclipse-workspace7/myhome/src/main/webapp/data";
	
	// 주문/배송 조회 기본화면
	@GetMapping("ordlList")
	public String selectOrdlList(UproductDto upr,ModelMap model) throws Exception {
		
		// 화면에 출력되는 항목개수
		int pageUnit = upr.getPageUnit();
		
		// 총 데이터 개수
		int total = jonggeunService.selectDataTotal(upr);
		// 연산처리를 위해 dto에 값을 보냄
		upr.setTotal(total);
		
		// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
		// 총페이지 개수를 계산 시키는 장면
		upr.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = upr.getTotalpage();
		
		// 출력페이지번호
		int pageIndex  = upr.getPageIndex();
		
		// 출력페이지의 시작 행번호
		upr.setPageRownum();
		int pageRownum = upr.getPageRownum();
		
		// SQL에 적용할 시작번호
		upr.setFirstIndex();
		int firstIndex = upr.getFirstIndex();
		
		// SQL에 적용할 종료번호
		upr.setLastIndex();
		int lastIndex  = upr.getLastIndex();
		
		List<?> list1 = jonggeunService.selectOrdlList(upr);
		
		model.addAttribute("list",list1); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageRownum",pageRownum);
		
		return "jonggeun/ordlList";
	}
	
	// 취소/교환/반품 기본화면
		@GetMapping("cerList")
		public String selectCerList(UproductDto upr,ModelMap model) throws Exception {
			
			// 화면에 출력되는 항목개수
			int pageUnit = upr.getPageUnit();
			
			// 총 데이터 개수
			int total = jonggeunService.selectDataTotal(upr);
			// 연산처리를 위해 dto에 값을 보냄
			upr.setTotal(total);
			
			// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
			// 총페이지 개수를 계산 시키는 장면
			upr.setTotalpage();
			// 계산 후 결과를 얻어옴
			int totalPage  = upr.getTotalpage();
			
			// 출력페이지번호
			int pageIndex  = upr.getPageIndex();
			
			// 출력페이지의 시작 행번호
			upr.setPageRownum();
			int pageRownum = upr.getPageRownum();
			
			// SQL에 적용할 시작번호
			upr.setFirstIndex();
			int firstIndex = upr.getFirstIndex();
			
			// SQL에 적용할 종료번호
			upr.setLastIndex();
			int lastIndex  = upr.getLastIndex();
			
			List<?> list1 = jonggeunService.selectOrdlList(upr);
			
			model.addAttribute("list",list1); // (변수명,데이터값)
			model.addAttribute("total", total);
			model.addAttribute("totalPage", totalPage);
			model.addAttribute("pageRownum",pageRownum);
			
			return "jonggeun/cerList";
		}
	
	// 주문/배송 조회 결제완료순 화면
	@GetMapping("ordlListPay")
	public String selectOrdlListPay(UproductDto upr,ModelMap model) throws Exception {
		
		// 화면에 출력되는 항목개수
		int pageUnit  = upr.getPageUnit();
		
		// 총 데이터 개수 (결제완료된 데이터개수만 출력)
		int total = jonggeunService.selectDataTotalPay(upr);
		// 연산처리를 위해 dto에 값을 보냄
		upr.setTotal(total);
		
		// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
		// 총페이지 개수를 계산 시키는 장면
		upr.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = upr.getTotalpage();
		
		// 출력페이지번호
		int pageIndex  = upr.getPageIndex();
		
		// 출력페이지의 시작 행번호
		upr.setPageRownum();
		int pageRownum = upr.getPageRownum();
		
		// SQL에 적용할 시작번호
		upr.setFirstIndex();
		int firstIndex = upr.getFirstIndex();
		
		// SQL에 적용할 종료번호
		upr.setLastIndex();
		int lastIndex  = upr.getLastIndex();
		
		List<?> list  = jonggeunService.selectOrdlListPay2(upr);
		
		model.addAttribute("list",list); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageRownum",pageRownum);
		
		return "jonggeun/ordlListPay";
	}
	
	// 주문/배송 조회 배송완료순 화면
	@GetMapping("ordlListDvr")
	public String selectOrdlListDvr(UproductDto upr,ModelMap model) throws Exception {
		
		// 화면에 출력되는 항목개수
		int pageUnit  = upr.getPageUnit();
		
		// 총 데이터 개수 (배송(주문)완료된 데이터개수만 출력)
		int total = jonggeunService.selectDataTotalDvr(upr);
		// 연산처리를 위해 dto에 값을 보냄
		upr.setTotal(total);
		
		// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
		// 총페이지 개수를 계산 시키는 장면
		upr.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = upr.getTotalpage();
		
		// 출력페이지번호
		int pageIndex  = upr.getPageIndex();
		
		// 출력페이지의 시작 행번호
		upr.setPageRownum();
		int pageRownum = upr.getPageRownum();
		
		// SQL에 적용할 시작번호
		upr.setFirstIndex();
		int firstIndex = upr.getFirstIndex();
		
		// SQL에 적용할 종료번호
		upr.setLastIndex();
		int lastIndex  = upr.getLastIndex();
		
		List<?> list  = jonggeunService.selectOrdlListDvr2(upr);
		
		model.addAttribute("list",list); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageRownum",pageRownum);
		
		return "jonggeun/ordlListDvr";
	}
	
	// 주문/배송상품 상세정보 화면
	@GetMapping("ordlDetail/{product_no}")
	public String selectOrdlDetail(@PathVariable int product_no,ModelMap model) throws Exception {
		
		DetailDto dto = jonggeunService.selectordlDetail(product_no);
		
		model.addAttribute("dto",dto);
		
		return "jonggeun/ordlDetail";
	}
}