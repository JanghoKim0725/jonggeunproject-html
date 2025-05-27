package com.myhome.dto;

public class UcancelDto {

	String    cancel_num;
	String 	    order_id;
	String        pay_id;   
	String       user_id;
	String cancel_reason;
	String   cancel_date;
	String cancel_status;
	int     refund_price;
	int          user_no; 
	String      admin_id;
	String    product_no;

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

	public String getCancel_num() {return cancel_num;}
	public void setCancel_num(String cancel_num) {this.cancel_num = cancel_num;}
	
	public String getOrder_id() {return order_id;}
	public void setOrder_id(String order_id) {this.order_id = order_id;}
	
	public String getPay_id() {return pay_id;}
	public void setPay_id(String pay_id) {this.pay_id = pay_id;}
	
	public String getUser_id() {return user_id;}
	public void setUser_id(String user_id) {this.user_id = user_id;}
	
	public String getCancel_reason() {return cancel_reason;}
	public void setCancel_reason(String cancel_reason) {this.cancel_reason = cancel_reason;}
	
	public String getCancel_date() {return cancel_date;}
	public void setCancel_date(String cancel_date) {this.cancel_date = cancel_date;}
	
	public String getCancel_status() {return cancel_status;}
	public void setCancel_status(String cancel_status) {this.cancel_status = cancel_status;}
	
	public int getRefund_price() {return refund_price;}
	public void setRefund_price(int refund_price) {this.refund_price = refund_price;}
	
	public int getUser_no() {return user_no;}
	public void setUser_no(int user_no) {this.user_no = user_no;}
	
	public String getAdmin_id() {return admin_id;}
	public void setAdmin_id(String admin_id) {this.admin_id = admin_id;}
	
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
	   
	   public String getProduct_no() {return product_no;}
	   public void setProduct_no(String product_no) {this.product_no = product_no;}
}
