package com.myhome.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myhome.dto.UorderDto;
import com.myhome.dto.UpaymentDto;
import com.myhome.dto.UproductDto;
import com.myhome.dto.DetailDto;
import com.myhome.mapper.JonggeunMapper;

@Service
public class JonggeunServiceImpl implements JonggeunService {

	@Autowired
	JonggeunMapper mapper;

	// 주문/배송 조회목록 출력 + 검색기능 추가 (본데이터)
	@Override
	public List<?>     selectOrdlList(UproductDto dto) throws Exception {return mapper.selectOrdlList(dto);}
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 결제완료순 출력
	@Override
	public List<?> selectOrdlListPay2(UproductDto upr) throws Exception {return mapper.selectOrdlListPay2(upr);}
	
	// 주문/배송 조회목록 출력 + 검색기능 추가 + 배송(주문)완료순 출력
	@Override
	public List<?> selectOrdlListDvr2(UproductDto upr) throws Exception {return mapper.selectOrdlListDvr2(upr);}
	
	// 주문/배송 조회목록 페이지 출력
	@Override
	public int 	      selectDataTotal(UproductDto dto) throws Exception {return mapper.selectDataTotal(dto);}
	
	// 주문/배송 조회목록 (결제완료된 데이터개수만큼의) 페이지 출력
	@Override
	public int selectDataTotalPay(UproductDto upr) throws Exception {return mapper.selectDataTotalPay(upr);}
	
	// 주문/배송 조회목록 (배송(주문)완료된 데이터개수만큼의) 페이지 출력
	@Override
	public int selectDataTotalDvr(UproductDto upr) throws Exception {return mapper.selectDataTotalDvr(upr);}

	// 상세정보
	@Override
	public DetailDto selectordlDetail(int product_no) throws Exception {return mapper.selectOrdlDetail(product_no);}
}