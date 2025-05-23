package com.myhome.dto;

import lombok.Data;

@Data
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
}
