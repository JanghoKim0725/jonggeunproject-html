package com.myhome.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.myhome.dto.UorderDto;
import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;
import com.myhome.dto.DetailDto;
import com.myhome.dto.UcancelDto;
import com.myhome.service.JonggeunService;

@Controller
public class JonggeunController {
	
	@Autowired
	JonggeunService jonggeunService;
	
	//클래스변수(전역)변수 (이미지파일 저장경로)
	public static String path = "file///C:/eclipse-workspace7/myhome/src/main/webapp/data";
	
	// 주문/배송 조회 기본화면
	@GetMapping("ordlList")
	public String selectOrdlList(UorderDto ord,ModelMap model) throws Exception {
		
		// 화면에 출력되는 항목개수
		int pageUnit = ord.getPageUnit();
		
		// 총 데이터 개수
		int total = jonggeunService.selectDataTotal1(ord);
		// 연산처리를 위해 dto에 값을 보냄
		ord.setTotal(total);
		
		// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
		// 총페이지 개수를 계산 시키는 장면
		ord.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = ord.getTotalpage();
		
		// 출력페이지번호
		int pageIndex  = ord.getPageIndex();
		
		// 출력페이지의 시작 행번호
		ord.setPageRownum();
		int pageRownum = ord.getPageRownum();
		
		// SQL에 적용할 시작번호
		ord.setFirstIndex();
		int firstIndex = ord.getFirstIndex();
		
		// SQL에 적용할 종료번호
		ord.setLastIndex();
		int lastIndex  = ord.getLastIndex();
		
		List<?> list1 = jonggeunService.selectOrdlList(ord);
		
		model.addAttribute("list",list1); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageRownum",pageRownum);
		
		return "jonggeun/ordlList";
	}
	
	// 취소/교환/반품 기본화면
	@GetMapping("cerList")
	public String selectCerList(UcancelDto ucl,ModelMap model) throws Exception {
		
		// 화면에 출력되는 항목개수
		int pageUnit = ucl.getPageUnit();
		
		// 총 데이터 개수
		int total = jonggeunService.selectDataTotal2(ucl);
		// 연산처리를 위해 dto에 값을 보냄
		ucl.setTotal(total);
		
		// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
		// 총페이지 개수를 계산 시키는 장면
		ucl.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = ucl.getTotalpage();
		
		// 출력페이지번호
		int pageIndex  = ucl.getPageIndex();
		
		// 출력페이지의 시작 행번호
		ucl.setPageRownum();
		int pageRownum = ucl.getPageRownum();
		
		// SQL에 적용할 시작번호
		ucl.setFirstIndex();
		int firstIndex = ucl.getFirstIndex();
		
		// SQL에 적용할 종료번호
		ucl.setLastIndex();
		int lastIndex  = ucl.getLastIndex();
		
		List<?> list1 = jonggeunService.selectCerList(ucl);
		
		model.addAttribute("list",list1); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageRownum",pageRownum);
		
		return "jonggeun/cerList";
	}
	
	// 주문/배송 조회 결제완료순 화면
	@GetMapping("ordlListPay")
	public String selectOrdlListPay(UproductDto upr,UpaymentDto upy,ModelMap model) throws Exception {
		
		// 화면에 출력되는 항목개수
		int pageUnit  = upy.getPageUnit();
		
		// 총 데이터 개수 (결제완료된 데이터개수만 출력)
		int total = jonggeunService.selectDataTotalPay(upy);
		// 연산처리를 위해 dto에 값을 보냄
		upy.setTotal(total);
		
		// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
		// 총페이지 개수를 계산 시키는 장면
		upy.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = upy.getTotalpage();
		
		// 출력페이지번호
		int pageIndex  = upy.getPageIndex();
		
		// 출력페이지의 시작 행번호
		upy.setPageRownum();
		int pageRownum = upy.getPageRownum();
		
		// SQL에 적용할 시작번호
		upy.setFirstIndex();
		int firstIndex = upy.getFirstIndex();
		
		// SQL에 적용할 종료번호
		upy.setLastIndex();
		int lastIndex  = upy.getLastIndex();
		
		List<?> list  = jonggeunService.selectOrdlListPay2(upy);
		
		model.addAttribute("list",list); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageRownum",pageRownum);
		
		return "jonggeun/ordlListPay";
	}
	
	// 주문/배송 조회 배송완료순 화면
	@GetMapping("ordlListDvr")
	public String selectOrdlListDvr(UproductDto upr,UorderDto ord,ModelMap model) throws Exception {
		
		// 화면에 출력되는 항목개수
		int pageUnit  = ord.getPageUnit();
		
		// 총 데이터 개수 (배송(주문)완료된 데이터개수만 출력)
		int total = jonggeunService.selectDataTotalDvr(ord);
		// 연산처리를 위해 dto에 값을 보냄
		ord.setTotal(total);
		
		// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
		// 총페이지 개수를 계산 시키는 장면
		ord.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = ord.getTotalpage();
		
		// 출력페이지번호
		int pageIndex  = ord.getPageIndex();
		
		// 출력페이지의 시작 행번호
		ord.setPageRownum();
		int pageRownum = ord.getPageRownum();
		
		// SQL에 적용할 시작번호
		ord.setFirstIndex();
		int firstIndex = ord.getFirstIndex();
		
		// SQL에 적용할 종료번호
		ord.setLastIndex();
		int lastIndex  = ord.getLastIndex();
		
		List<?> list  = jonggeunService.selectOrdlListDvr2(ord);
		
		model.addAttribute("list",list); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageRownum",pageRownum);
		
		return "jonggeun/ordlListDvr";
	}
	
	// 취소/교환/반품  추소 신청순 화면
	@GetMapping("cerListRequest")
	public String selectCerListRequest(UproductDto upr,UcancelDto ucl,ModelMap model) throws Exception {
		
		// 화면에 출력되는 항목개수
		int pageUnit  = ucl.getPageUnit();
		
		// 총 데이터 개수 (취소신청된 데이터개수만 출력)
		int total = jonggeunService.selectDataTotalRequest(ucl);
		// 연산처리를 위해 dto에 값을 보냄
		ucl.setTotal(total);
		
		// (double)15/10 -> Math.ceil(1.5) -> (int)2.0 -> 2 페이지 출력배열
		// 총페이지 개수를 계산 시키는 장면
		ucl.setTotalpage();
		// 계산 후 결과를 얻어옴
		int totalPage  = ucl.getTotalpage();
		
		// 출력페이지번호
		int pageIndex  = ucl.getPageIndex();
		
		// 출력페이지의 시작 행번호
		ucl.setPageRownum();
		int pageRownum = ucl.getPageRownum();
		
		// SQL에 적용할 시작번호
		ucl.setFirstIndex();
		int firstIndex = ucl.getFirstIndex();
		
		// SQL에 적용할 종료번호
		ucl.setLastIndex();
		int lastIndex  = ucl.getLastIndex();
		
		List<?> list  = jonggeunService.selectCerListRequest2(ucl);
		
		model.addAttribute("list",list); // (변수명,데이터값)
		model.addAttribute("total", total);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageRownum",pageRownum);
		
		return "jonggeun/cerListRequest";
	}
	
	// 주문/배송상품 상세정보 화면
	@GetMapping("ordlDetail/{product_no}")
	public String selectOrdlDetail(@PathVariable int product_no,ModelMap model) throws Exception {
		
		DetailDto dto = jonggeunService.selectordlDetail(product_no);
		
		model.addAttribute("dto",dto);
		
		return "jonggeun/ordlDetail";
	}
	
	// 취소상품 상세정보 화면
	@GetMapping("cerDetail/{product_no}")
	public String selectCerDetail(@PathVariable int product_no,ModelMap model) throws Exception {
		
		DetailDto dto = jonggeunService.selectcerDetail(product_no);
		
		model.addAttribute("dto",dto);
		
		return "jonggeun/cerDetail";
	}
	
	@PostMapping("cancelOrder")
	@ResponseBody 
	public String cancelOrder(UcancelDto ucl,UpaymentDto upy,UorderDto ord) throws Exception {
		
		int result1 = jonggeunService.insertCancelOrder(ucl);
		int result2 = jonggeunService.deleteUpayment(upy);
		int result3 = jonggeunService.deleteUorder(ord);

		return "jonggeun/cerList";
	}
}