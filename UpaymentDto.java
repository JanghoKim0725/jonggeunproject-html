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
}
