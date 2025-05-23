package com.myhome.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.myhome.dto.UorderDto;
import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;
import com.myhome.dto.DetailDto;

@Mapper
public interface JonggeunMapper {
	
	// 주문/배송 조회목록 출력 + 검색기능 추가
	List<?> 	selectOrdlList(UproductDto dto);
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 결제완료순 출력
	List<?> selectOrdlListPay2(UproductDto upr);
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 배송(주문)완료순 출력
	List<?> selectOrdlListDvr2(UproductDto upr);
	
	// 주문/배송 조회목록 페이지 출력
	int 	   selectDataTotal(UproductDto dto);
	
	// 주문/배송 조회목록 (결제완료된 데이터개수만큼의) 페이지 출력
	int 	selectDataTotalPay(UproductDto upr);
	
	// 주문/배송 조회목록 (배송(주문)완료된 데이터개수만큼의) 페이지 출력
	int 	selectDataTotalDvr(UproductDto upr);
	
	// 상세정보
	DetailDto  selectOrdlDetail(int product_no);
}