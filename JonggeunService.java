package com.myhome.service;

import java.util.List;
import com.myhome.dto.DetailDto;
import com.myhome.dto.UcancelDto;
import com.myhome.dto.UorderDto;
import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;

public interface JonggeunService {
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 (본데이터) 
	List<?>      	   selectOrdlList(UproductDto dto) throws Exception;
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 결제완료순 출력
	List<?>  	   selectOrdlListPay2(UproductDto upr) throws Exception;
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 배송(주문)완료순 출력
	List<?>  	   selectOrdlListDvr2(UproductDto upr) throws Exception;
	
	// 페이지 출력
	int         	  selectDataTotal(UproductDto dto) throws Exception;
	
	// 주문/배송 조회목록 (결제완료된 데이터개수만큼의) 페이지 출력
	int 		   selectDataTotalPay(UproductDto upr) throws Exception;
	
	// 주문/배송 조회목록 (배송(주문)완료된 데이터개수만큼의) 페이지 출력
	int 		   selectDataTotalDvr(UproductDto upr) throws Exception;
	
	// 취소/교환/반품목록 출력 + 검색기능 추가(본데이터)
	List<?> 			selectCerList(UproductDto upr) throws Exception;
	
	// 취소/교환 반품목록 + 검색기능 추가 + 취소신청날짜순 출력
	List<?> 	selectCerListRequest2(UproductDto upr) throws Exception;
	
	// 취소/교환/반품목록 (취소신청된 데이터개수만큼의) 페이지 출력
	int 	   selectDataTotalRequest(UproductDto upr) throws Exception;
	
	// 주문/배송 상품 상세정보 
	DetailDto 	  	  selectordlDetail(int product_no) throws Exception;
	
	// 취소 상품 상세정보
	DetailDto 		   selectcerDetail(int product_no) throws Exception;

	// 취소목록에 삽입
	int 			 insertCancelOrder(UcancelDto ucl) throws Exception;
	
	// 상품목록에서 삭제
	int 			   deleteUproduct(UproductDto upr) throws Exception;
	
	// 결제완료내역에서 삭제
	int 			   deleteUpayment(UpaymentDto upy) throws Exception;
	
	// 배송(주문)완료내역에서 삭제
	int 				   deleteUorder(UorderDto ord) throws Exception;
}