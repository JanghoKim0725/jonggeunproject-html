package com.myhome.dto;

import lombok.Data;

@Data
public class UpaymentDto {
	
	String 	   pay_id;
	String 	 order_id;
	String product_no;
	int    	  user_no;
	String 	 pay_date;
	String pay_method;
	String pay_status;
	int   total_price;
	String cancel_num;
	
	 // 현재페이지 번호
	   int 			pageIndex = 1;
		
	   // 한 화면에서의 출력 단위
	   int 			 pageUnit = 4;
	   
	   // 1 ~ 10 [next] // 11 ~ 20
	   int 			 pageSize = 10;
		
	   // 시작 페이지 번호
	   int 			firstPage = 1;
		
	   // 종료 페이지 번호
	   int 			 lastPage = 1;
	   
	   // SQL의 시작번호
	   int firstIndex = 0;
		
	   // SQL의 종료번호
	   int lastIndex  = 0;
	   
	   // 총 데이터개수
	   int 				total = 0;
	   
	   // 총 페이지개수
	   int 			totalPage = 0;
	   
	   // 출력페이지의 시작번호
	   int 		   pageRownum = 0;
	   
	   // 검색기능 dto
	   String             keyword;
	
	public String getPay_id() {return pay_id;}
	public void setPay_id(String pay_id) {this.pay_id = pay_id;}
	
	public String getOrder_id() {return order_id;}
	public void setOrder_id(String order_id) {this.order_id = order_id;}
	
	public String getProduct_no() {return product_no;}
	public void setProduct_no(String product_no) {this.product_no = product_no;}
	
	public int getUser_no() {return user_no;}
	public void setUser_no(int user_no) {this.user_no = user_no;}
	
	public String getPay_date() {return pay_date;}
	public void setPay_date(String pay_date) {this.pay_date = pay_date;}
	
	public String getPay_method() {return pay_method;}
	public void setPay_method(String pay_method) {this.pay_method = pay_method;}
	
	public String getPay_status() {return pay_status;}
	public void setPay_status(String pay_status) {this.pay_status = pay_status;}
	
	public int getTotal_price() {return total_price;}
	public void setTotal_price(int total_price) {this.total_price = total_price;}
	
	public String getCancel_num() {return cancel_num;}
	public void setCancel_num(String cancel_num) {this.cancel_num = cancel_num;}
	
	public int getPageIndex() {return pageIndex;}
	   public void setPageIndex(int pageIndex) {this.pageIndex = pageIndex;}

	   public int getPageUnit() {return pageUnit;}
	   public void setPageUnit(int pageUnit) {this.pageUnit = pageUnit;}

	   public int getPageSize() {return pageSize;}
	   public void setPageSize(int pageSize) {this.pageSize = pageSize;}

	   public int getFirstPage() {return firstPage;}
	   public void setFirstPage(int firstPage) {this.firstPage = firstPage;}
	
	   public int getLastPage() {return lastPage;}
	   public void setLastPage(int lastPage) {this.lastPage = lastPage;}
	
	   public int getFirstIndex() {return firstIndex;}
	   public void setFirstIndex() {this.firstIndex = (pageIndex - 1) * pageUnit + 1;}
	
	   public int getLastIndex() {return lastIndex;}
	   public void setLastIndex() {this.lastIndex = firstIndex + (pageUnit - 1);}
	
	   public int getTotal() {return total;}
	   public void setTotal(int total) {this.total = total;}
	
	   public int getTotalpage() {return totalPage;}
	   public void setTotalpage() {this.totalPage = (int)Math.ceil((double)total/pageUnit);}
	   
	   public int getPageRownum() {return pageRownum;}
	   public void setPageRownum() {this.pageRownum = total - (pageIndex - 1) * pageUnit;}
	   
	   public String getKeyword() {return keyword;}
	   public void setKeyword(String keyword) {this.keyword = keyword;}
}
