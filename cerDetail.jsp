<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn"   uri="http://java.sun.com/jsp/jstl/functions"%>
<%  // 100000을 100,000변환 jstl %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ko">
 <head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>결제시스템</title>
  <link rel="stylesheet" href="../css/total.css" />
 </head>
 <style>
	
	/*주문 상품상세정보 css*/
	
	/*부제목(주문 상품 상세정보)*/
	#content_wrap .cer_title1 {
		text-align: left;
		color: #333;
		font-weight: 500;
		margin-left: 30px;
		font-size: 25px;
	}
	
	/*부제목(취소 신청,환불 정보)*/
	#content_wrap .cer_title2 {
		margin-top: 80px;
		text-align: left;
		color: #333;
		font-weight: 500;
		margin-left: 30px;
		font-size: 25px;
	}
	
	/*부제목(취소 신청 정보)*/
	#content_wrap .cer_title3 {
		margin-top: 60px;
		text-align: left;
		color: #333;
		font-weight: 500;
		margin-left: 30px;
		font-size: 25px;
	}
	
	/*부제목(환불 정보)*/
	#content_wrap .cer_title4 {
		margin-top: 60px;
		text-align: left;
		color: #333;
		font-weight: 500;
		margin-left: 30px;
		font-size: 25px;
	}
	
	/*상품이미지*/
	#content_wrap .cer_main_img {
		margin-top: 20px;
		margin-left: 30px;
		width: 300px;
		height: 300px;
	}
	
	/*주문번호 ~ 수량 정보 케이스*/
	#content_wrap .Detail_main_goodscase {
		margin-top: -300px;
		margin-left: 380px;
		width: 770px;
		height:298px;
		border-left: 3px solid #d1d1d1;
	}
	
	/*배송지정보 케이스*/
	#content_wrap .Detail_main_canclecase {
		margin-top: 25px;
		margin-left: 30px;
		width: 1100px;
		height:180px;
		border-top: 3px solid #333;
		border-bottom: 3px solid #d1d1d1; 
	}
	
	/*결제정보 케이스*/
	#content_wrap .Detail_main_refundcase {
		margin-top: 20px;
		margin-left: 30px;
		width: 1100px;
		height: 300px;
		border-top: 3px solid #333;
		border-bottom: 3px solid #d1d1d1; 
	}
	
	/*상품번호*/
	#content_wrap .cer_main_font1 {
		margin-left: 45px;
		font-size: 18px;
		font-weight: 300;
		color: #979797;
	}
	
	/*상품명*/
	#content_wrap .cer_main_font2 {
		margin-top: 30px;
		margin-left: 45px;
		font-size: 18px;
		font-weight: 300;
		color: #979797;
	}
	
	/*상품상세설명(상품정보)*/
	#content_wrap .cer_main_font3 {
		margin-top: 20px;
		margin-left: 45px;
		font-size: 30px;
		font-weight: 500;
		color: #333;
	}
	
	/*세일과 할인가격*/
	#content_wrap .cer_main_font4 {
		margin-top: 20px;
		margin-left: 45px;
		font-size: 40px;
		font-weight: bold;
		color: #333;
	}
	
	/*할인전 가격*/
	#content_wrap .cer_main_font5 {
		margin-top: 10px;
		margin-left: 45px;
		font-size: 18px;
		color: #686868;
	}
	
	/*수량과 수량에 따른 금액*/
	#content_wrap .cer_main_font6 {
		margin-top: 10px;
		margin-left: 45px;
		font-size: 20px;
		color: #666666;
		font-weight: 450;
	}
	
	/*소제목(구매자~결제수단)*/
	#content_wrap .cer_main_font7 {
		margin-top: 30px;
		margin-left: 45px;
		font-size: 20px;
		color: #333;
		font-weight: 450;
	}
	
	/*이전버튼*/
	#content_wrap .cer_main_button1 {
		margin-top: 20px;
		margin-left: 530px;
		width:86px;
		height: 42px;
		border-radius: 7px;
		opacity: 100%;
		font-size: 15px;
		background-color: #2360e6;
		color: #ffffff;
	}
		
 </style>
 <body style="overflow:auto;">

    <!-- skip 네비게이션 영역 -->
    <nav id="skipToContent">
        <ul>
            <li><a href="#container">Skip to Main Content</a></li>
            <li><a href="#gnb">Skip to Main Menu</a></li>
            <li><a href="#header">Skip to Upeer Menu</a></li>
            <li><a href="#footers">Skip to Lower Menu</a></li>
        </ul>
    </nav>
    <!-- skip 네비게이션 영역 -->




    <!----------------------------- header 헤더 ----------------------------->
    <header id="header">   

        <!-- nav 영역 -->
        <nav class="top_nav center">
            <ul>
                <li>
                    <a href="#none">회원가입</a>
                </li>
                <li>
                    <a href="#none">로그인</a>
                </li>
                <li>
                    <a href="#none">고객센터</a>
                </li>
            </ul>
        </nav>
        <!-- nav 영역 -->

        <div class="h_inner">
            <div class="menu_bar center">
                 <!-- header 로고 영역 -->
                <a href="index.html">
                    <h1 class="tit_h1">
                        <span class="blind">logo</span>
                    </h1>
                </a>
                <!-- header 로고 영역 -->
                <!-- header snb 영역 -->
                <ul class="snb">
                    <li>
                        <a href="#none">마이페이지</a>
                    </li>
                    <li>
                        <a href="#none">장바구니</a>
                    </li>
                    <li>
                        <a href="#none">주문/배송</a>
                    </li>
                </ul>
                <!-- header snb 영역 -->
            </div>
        </div>
    </header>
    <!----------------------------- header 헤더 ----------------------------->

    <section id="content_wrap">
        <div class="con_inner inner_L center">
            <div class="con_title">
                <p>마이페이지</p>
            </div>
        </div>
        <div class="con_inner inner_R center">
            <div class="aside">
                <ul>
                    <li>
                        <a href="#none">주문 / 배송 조회</a>
                    </li>
                    <li>
                        <a href="#none">취소 / 교환 / 반품</a>
                    </li>
                    <li>
                        <a href="#none">장바구니</a>
                    </li>
                    <li>
                        <a href="#none">1:1 문의</a>
                    </li>
                </ul>
            </div>
            <div class="section">
				<p class="cer_title1">주문 상품 상세 정보</p>
				<img src="../data/${dto.product_img}" class="cer_main_img">
				<div class="Detail_main_goodscase">
					<div class="cer_main_font1">주문번호 ${dto.order_id}</div>
					<div class="cer_main_font2">${dto.product_name}(상품명)</div>
					<div class="cer_main_font3">${dto.product_description}</div>
					<div class="cer_main_font4">
						<font color="#2360e6">${dto.product_sale}%</font> 
						<fmt:formatNumber value="${dto.product_price / 100 * dto.product_sale}" type="number"/>원
					</div>
					<div class="cer_main_font5">
						<s><fmt:formatNumber value="${dto.product_price}" type="number"/>원</s>
					</div>
					<div class="cer_main_font6">
						<fmt:formatNumber value="${dto.product_price * dto.sales_cnt}" type="number"/> / 
						${dto.sales_cnt}개
					</div>
				</div>
				<p class="cer_title2">취소 신청 정보</p>
				<div class="Detail_main_canclecase">
					<div class="cer_main_font7">
						신청 일시 
						<font color="#979797" style="margin-left:250px;">${dto.cancel_date}</font>
					</div>
					<div class="cer_main_font7">
						완료 일시 
						<font color="#979797" style="margin-left:250px;">2025-05-05 21:26:30</font>
					</div>
					<div class="cer_main_font7">
						취소 사유 
						<font color="#979797" style="margin-left:250px;">${dto.cancel_reason}</font>
					</div>	
				</div>
				<p class="cer_title3">환불 정보</p>
				<div class="Detail_main_refundcase">
					<div class="cer_main_font7">
						상품 금액 
						<font color="#979797" style="margin-left:250px;">
							<fmt:formatNumber value="${dto.product_price * dto.sales_cnt}" type="number"/>원
						</font>
					</div>
					<div class="cer_main_font7">
						할인 금액 
						<font color="#2360e6" style="margin-left:250px;">
							-<fmt:formatNumber value="${(dto.product_price / 100 * dto.product_sale) * dto.sales_cnt}" 
											   type="number"/>원
						</font>
					</div>
					<div class="cer_main_font7">
						배송비 
						<font color="#2360e6" style="margin-left:270px;">${dto.delivery_fee}</font>
					</div>
					<div class="cer_main_font7">
						결제 금액 
						<font style="margin-left:250px;">
							<fmt:formatNumber value="${(dto.product_price * dto.sales_cnt) - 
													  ((dto.product_price / 100.0 * dto.product_sale) 
													  * dto.sales_cnt)}" type="number" />원
						</font>
					</div>
					<div class="cer_main_font7">
						결제 수단 
						<font color="#979797" style="margin-left:250px;">${dto.pay_method}</font>
					</div>
				</div>
				<button type="button" class="cer_main_button1">이전</button>
            </div>
        </div>
        
    </section>


    








 </body>
</html>