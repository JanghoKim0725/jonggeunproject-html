package com.myhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;
import com.myhome.mapper.JonggeunMapper;

@Service
public class JonggeunServiceImpl implements JonggeunService {

	@Autowired
	JonggeunMapper mapper;

	// 주문/배송 조회목록 출력 + 검색기능 추가
	@Override
	public List<?>     selectOrdlList(UproductDto dto) throws Exception {return mapper.selectOrdlList(dto);}
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 결제완료순 출력
	@Override
	public List<?> selectOrdlListPay2(UproductDto upr) throws Exception {return mapper.selectOrdlListPay2(upr);}
	
	// 주문/배송 조회목록 페이지 출력
	@Override
	public int 	      selectDataTotal(UproductDto dto) throws Exception {return mapper.selectDatatotal(dto);}
	
	// 주문/배송 결제완료 순 페이지 확인여부
	@Override
	public int     selectOrdlListPay1(UpaymentDto upy) throws Exception {return mapper.selectOrdlListPay1(upy);}
}
