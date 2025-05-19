package com.myhome.service;

import java.util.List;
import com.myhome.dto.UproductDto;

public interface JonggeunService {
	
	// 주문/배송 조회목록 출력
	List<?> selectOrdlList(UproductDto dto) throws Exception;
}
