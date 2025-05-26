<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions"%>
<%  // 100000을 100,000변환 jstl %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<!DOCTYPE html>
<html lang="ko">
 <head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>결제시스템</title>
  <link rel="stylesheet" href="../css/total.css" />
  <script src="../js/jquery-3.7.1.js"></script>
 </head>
 <style>
	
	/*주문 / 배송 조회화면 css*/
	
	/*부제목(주문/배송조회)*/
	#content_wrap .cer_title {
		text-align: left;
		color: #333;
		font-weight: 500;
		margin-left: 30px;
		font-size: 25px;
	}
	
	/*검색입력란*/
	#content_wrap .cer_search {
		margin-left: 30px;
		width: 890px;
		height: 60px;
		border-radius: 7px;
		opacity: 100%;
		border: 1px solid #d1d1d1;
		font-size: 20px;
		color: #333;
		padding: 20px;
	}
	
	/*검색버튼*/
	#content_wrap .cer_search_button {
		margin-left: 20px;
		width: 190px;
		height: 60px;
		border-radius: 7px;
		opacity: 100%;
		font-size: 20px;
		background-color: #2360e6;
		color: #ffffff;
	}
	
	/*전체~배송완료 항목 감싸는 테이블*/
	#content_wrap .cer_tab {
		margin-top:39px;
		margin-left: 30px;
		width: 1100px;
		height: 38px;
		opacity: 100%;
	}
	
	/*전체~배송완료 항목 리스트*/
	#content_wrap .cer_tab_list {
		float: left;
		font-size: 18px;
		width: 120px;
		text-align: center;
		margin-right: 5px;
	}
	
	/*전체~배송완료 마우스를 갖다대면 파란색으로 변하는 효과*/
	#content_wrap .cer_tab_list:hover a {
		color: #2360e6;
	}
	
	/*상품리스트 메인*/
	#content_wrap .cer_main_list {
		float: left;
		font-size: 18px;
		width: 1100px;
		text-align: left;
		padding: 30px;
	}
	
	/*전체~배송완료 세부항목 케이스*/
	#content_wrap .cer_tab_list_sub {
		position: absolute;
		margin-top:-31px;
		width:100px;
		height:40px;
	}
	
	/*전체~배송완료 마우스를 갖다대면 밑줄이 파란색으로 변하는 효과*/
	#content_wrap .cer_tab_list_sub:hover {
		border-bottom:2px solid #2360e6;
	}
	
	/*전체~배송완료 폰트케이스*/
	#content_wrap .cer_tab_list_font {
		margin-top: -10px;
	}
	
	/*상품정보 메인 테이블*/
	#content_wrap .cer_main_table {
		margin-top:-40px;
		margin-left: 22px;
		width: 1130px;
		height: 320px;
	}
	
	/*상품정보 메인 td*/
	#content_wrap .cer_main_td {
		border: none;
		border-bottom: 2px solid #d1d1d1;
	}
	
	/*상품이미지*/
	#content_wrap .cer_main_img {
		margin-top: -30px;
		margin-left: -20px;
		width: 200px;
		height: 200px;
	}
	
	/*상품명*/
	#content_wrap .cer_main_font1 {
		margin-top: -200px;
		margin-left: 230px;
		color: #828282;
	}
	
	/*상품상세*/
	#content_wrap .cer_main_font2 {
		width: 300px;
		margin-top: 5px;
		margin-left: 230px;
		font-weight: 500;
	}
	
	/*수량*/
	#content_wrap .cer_main_font3 {
		width: 100px;
		height: 170px;
		margin-top: -42px;
		margin-left: 700px;
		font-weight: 500;
		border-left:  2px solid #d1d1d1;	
	}
	
	/*가격*/
	#content_wrap .cer_main_font4 {
		width: 170px;
		height: 170px;
		margin-top: -170px;
		margin-left: 798px;
		font-weight: 500;
		border-left:  2px solid #d1d1d1;
		border-right: 2px solid #d1d1d1;				
	}
	
	/*개수 글자케이스 세부 div*/
	#content_wrap .cer_main_sub_font1 {
		position: absolute;
		width:100px;
		height:40px;
		margin-left:-2px;
		text-align:center;
		margin-top: 70px;
	}
	
	/*가격 글자케이스 세부 div*/
	#content_wrap .cer_main_sub_font2 {
		position: absolute;
		width:100px;
		height:40px;
		margin-left:35px;
		text-align:center;
		margin-top: 70px;
	}
	
	/*주문상세버튼*/
	#content_wrap .cer_main_button1 {
		margin-top: 10px;
		margin-left: 1000px;
		width:86px;
		height: 42px;
		border: 1px solid #2360e6;
		border-radius: 7px;
		opacity: 100%;
		font-size: 15px;
		background-color: #ffffff;
	}

	/*페이지 번호*/
	#content_wrap .cer_main_page {
		margin-top: 50px;
		font-size: 50px;
		font-weight: bold;
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
				<p class="cer_title">취소/ 교환/ 반품</p><br>
				<form action="/cerList" method="get">
					<input type="text" name="keyword" class="cer_search" placeholder="상품명을 입력하세요">
					<button type="submit" class="cer_search_button">검색</button>
				</form><br>
				<div>
				<table class="cer_tab">
					<tr>
						<td>
							<ul>
								<li class="cer_tab_list">
									<a href="/cerList">
										<div class="cer_tab_list_sub">
											<div class="cer_tab_list_font">전체<div>
										</div>
									</a>
								</li>
								<li class="cer_tab_list">
									<a href="/cerListRequest">
										<div class="cer_tab_list_sub">
											<div class="cer_tab_list_font">취소신청<div>
										</div>
									</a>
								</li>
								<li class="cer_tab_list">
									<a href="/cerListDone">
										<div class="cer_tab_list_sub">
											<div class="cer_tab_list_font">취소완료<div>
										</div>
									</a>
								</li>
							</ul>
						</td>
					</tr>
					<tr><td height="1" border="2" bgcolor="#d1d1d1"></tr>
				</table>
				<div style="margin-top:65px;">
					<c:forEach var="result" items="${list}">
						<table class="cer_main_table">
							<tr><td>${result.keyword}</td></tr>
							<tr>
								<td class="cer_main_td">
									<li class="cer_main_list">
										<img src="../data/${result.PRODUCT_IMG}" class="cer_main_img">
										<div class="cer_main_font1">${result.PRODUCT_NAME}</font></div>
										<div class="cer_main_font2">${result.PRODUCT_DESCRIPTION}</font></div>
										<div class="cer_main_font3">
											<div class="cer_main_sub_font1">${result.SALES_CNT}개</div>
										</div>
										<div class="cer_main_font4">
											<div class="cer_main_sub_font2">
												<!-- 100000 -> 100,000 -->
												<fmt:formatNumber value="${(result.PRODUCT_PRICE * result.SALES_CNT)- 
													  					  ((result.PRODUCT_PRICE / 100.0 * 
													  					    result.PRODUCT_SALE) * 
													  					    result.SALES_CNT)}" type="number"/>원
											</div>
										</div>
										<div style="margin-top:-120px;">
											<button type="button" class="cer_main_button1">
												<a href="/cerDetail/${result.PRODUCT_NO}">
													<font color="#2360e6">주문상세</font>
												</a>
											</button>
										</div>
									</li>
								</td>
							</tr>
						</table>
					</c:forEach>
					<div class="cer_main_page" align="center">
						<c:forEach var="p" begin="1" end="${totalPage}">
							<a href="/cerList?pageIndex=${p}"><font color="#2360e6">${p}</font></a>
						</c:forEach>
					</div>
				<div>
            </div>
        </div>
    </section>


    








 </body>
</html>