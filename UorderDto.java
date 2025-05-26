package com.myhome.dto;

import lombok.Data;

@Data
public class UorderDto {

	String 		    order_id;
	String 		  product_no;
	int 		   order_cnt;
	String 	     order_rdate;
	String   delivery_method;
	String 	    delivery_fee;
	String 	   delivery_cate;
	int 		     user_no;
	String 	    order_status;
	String 		      pay_id;
	String 	      cancel_num;
	String 		  	admin_id;
	String     recipient_name;
	String recipient_address;
	String 	 recipient_phone;
	String  delivery_request;
	
	public String getOrder_id() {return order_id;}
	public void setOrder_id(String order_id) {this.order_id = order_id;}
	
	public String getProduct_no() {return product_no;}
	public void setProduct_no(String product_no) {this.product_no = product_no;}
	
	public int getOrder_cnt() {return order_cnt;}
	public void setOrder_cnt(int order_cnt) {this.order_cnt = order_cnt;}
	
	public String getOrder_rdate() {return order_rdate;}
	public void setOrder_rdate(String order_rdate) {this.order_rdate = order_rdate;}
	
	public String getDelivery_method() {return delivery_method;}
	public void setDelivery_method(String delivery_method) {this.delivery_method = delivery_method;}
	
	public String getDelivery_fee() {return delivery_fee;}
	public void setDelivery_fee(String delivery_fee) {this.delivery_fee = delivery_fee;}
	
	public String getDelivery_cate() {return delivery_cate;}
	public void setDelivery_cate(String delivery_cate) {this.delivery_cate = delivery_cate;}
	
	public int getUser_no() {return user_no;}
	public void setUser_no(int user_no) {this.user_no = user_no;}
	
	public String getOrder_status() {return order_status;}
	public void setOrder_status(String order_status) {this.order_status = order_status;}
	
	public String getPay_id() {return pay_id;}
	public void setPay_id(String pay_id) {this.pay_id = pay_id;}
	
	public String getCancel_num() {return cancel_num;}
	public void setCancel_num(String cancel_num) {this.cancel_num = cancel_num;}
	
	public String getAdmin_id() {return admin_id;}
	public void setAdmin_id(String admin_id) {this.admin_id = admin_id;}
	
	public String getEcipient_name() {return recipient_name;}
	public void setEcipient_name(String recipient_name) {this.recipient_name = recipient_name;}
	
	public String getRecipient_address() {return recipient_address;}
	public void setRecipient_address(String recipient_address) {this.recipient_address = recipient_address;}
	
	public String getRecipient_phone() {return recipient_phone;}
	public void setRecipient_phone(String recipient_phone) {this.recipient_phone = recipient_phone;}	
	
	public String getDelivery_request() {return delivery_request;}
	public void setDelivery_request(String delivery_request) {this.delivery_request = delivery_request;}
}
