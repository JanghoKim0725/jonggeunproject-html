package com.myhome.service;

import java.util.List;

import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;

public interface JonggeunService {
	
	// 주문/배송 조회목록 출력 + 검색기능 추가
	List<?>    selectOrdlList(UproductDto dto) throws Exception;
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 결제완료순 출력
	List<?> selectOrdlListPay2(UproductDto upr)throws Exception;

	// 주문/배송 조회목록 페이지 출력
	int       selectDataTotal(UproductDto dto) throws Exception;
	
	// 주문/배송 결제완료 순 페이지 확인여부
	int    selectOrdlListPay1(UpaymentDto upy) throws Exception;
}
