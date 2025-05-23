package com.myhome.dto;

import lombok.Data;

@Data
public class UproductDto {

	   String 		   product_no;
	   String 		 product_name;
	   int 			product_price;
	   String product_description;
	   int 			 product_sale;
	   String 		  product_img;
	   String 		 delivery_mth;
	   String 		 delivery_fee;
	   int 		registration_date;
	   int 				sales_cnt;
	   int 				 view_cnt;
	   String 	   product_status;
	   
	   // 검색기능 dto
	   String             keyword;
	   
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
		
	   public String getProduct_no() {return product_no;}
	   public void setProduct_no(String product_no) {this.product_no = product_no;}
	   
	   public String getProduct_name() {return product_name;}
	   public void setProduct_name(String product_name) {this.product_name = product_name;}
	   
	   public int getProduct_price() {return product_price;}
	   public void setProduct_price(int product_price) {this.product_price = product_price;}
	  
	   public String getProduct_description() {return product_description;}
	   public void setProduct_description(String product_description) {
		   this.product_description = product_description;
	   }
	   
	   public int getProduct_sale() {return product_sale;}
	   public void setProduct_sale(int product_sale) {this.product_sale = product_sale;}
	  
	   public String getProduct_img() {return product_img;}
	   public void setProduct_img(String product_img) {this.product_img = product_img;}
	  
	   public String getDelivery_mth() {return delivery_mth;}
	   public void setDelivery_mth(String delivery_mth) {this.delivery_mth = delivery_mth;}
	   
	   public String getDelivery_fee() {return delivery_fee;}
	   public void setDelivery_fee(String delivery_fee) {this.delivery_fee = delivery_fee;}
	   
	   public int getRegistration_date() {return registration_date;}
	   public void setRegistration_date(int registration_date) {this.registration_date = registration_date;}
	  
	   public int getSales_cnt() {return sales_cnt;}
	   public void setSales_cnt(int sales_cnt) {this.sales_cnt = sales_cnt;}
	  
	   public int getView_cnt() {return view_cnt;}
	   public void setView_cnt(int view_cnt) {this.view_cnt = view_cnt;}
	   
	   public String getProduct_status() {return product_status;}
	   public void setProduct_status(String product_status) {this.product_status = product_status;}
	
	   public String getKeyword() {return keyword;}
	   public void setKeyword(String keyword) {this.keyword = keyword;}
	
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
}