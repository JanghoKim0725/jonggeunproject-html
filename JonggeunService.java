package com.myhome.service;

import java.util.List;
import com.myhome.dto.DetailDto;
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
	
	// 주문/배송 조회목록 페이지 출력
	int         	  selectDataTotal(UproductDto dto) throws Exception;
	
	// 주문/배송 조회목록 (결제완료된 데이터개수만큼의) 페이지 출력
	int 		   selectDataTotalPay(UproductDto upr) throws Exception;
	
	// 주문/배송 조회목록 (배송(주문)완료된 데이터개수만큼의) 페이지 출력
	int 		   selectDataTotalDvr(UproductDto upr) throws Exception;
	
	// 상세정보 
	DetailDto 	  	  selectordlDetail(int product_no) throws Exception;
}