package com.myhome.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;

@Mapper
public interface JonggeunMapper {
	
	// 주문/배송 조회목록 출력 + 검색기능 추가
	List<?>  	selectOrdlList(UproductDto dto);
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 결제완료순 출력
	List<?> selectOrdlListPay2(UproductDto upr);
	
	// 주문/배송 조회목록 페이지 출력
	int        selectDatatotal(UproductDto dto);
	
	// 주문/배송 결제완료 순 페이지 확인여부
	int  	selectOrdlListPay1(UpaymentDto upy);
}
