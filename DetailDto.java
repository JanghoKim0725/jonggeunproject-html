package com.myhome.dto;

import lombok.Data;

@Data
public class DetailDto {

	int 			product_no;
	String 		   product_img;
	int               order_id;
	String 		  product_name;
	String product_description;
	int 		  product_sale;
	int 		 product_price;
	int 			 sales_cnt;
	String   	  delivery_fee;
	String 		recipient_name;
	String 	 recipient_address;
	String 	   recipient_phone;
	String 	  delivery_request;
	String 		 	pay_method;
	
	public int getProduct_no() {return product_no;}
	public void setProduct_no(int product_no) {this.product_no = product_no;}
	
	public String getProduct_img() {return product_img;}
	public void setProduct_img(String product_img) {this.product_img = product_img;}
	
	public int getOrder_id() {return order_id;}
	public void setOrder_id(int order_id) {this.order_id = order_id;}
	
	public String getProduct_name() {return product_name;}
	public void setProduct_name(String product_name) {this.product_name = product_name;}
	
	public String getProduct_description() {return product_description;}
	public void setProduct_description(String product_description) {this.product_description = product_description;}
	
	public int getProduct_sale() {return product_sale;}
	public void setProduct_sale(int product_sale) {this.product_sale = product_sale;}
	
	public int getProduct_price() {return product_price;}
	public void setProduct_price(int product_price) {this.product_price = product_price;}
	
	public int getSales_cnt() {return sales_cnt;}
	public void setSales_cnt(int sales_cnt) {this.sales_cnt = sales_cnt;}
	
	public String getDelivery_fee() {return delivery_fee;}
	public void setDelivery_fee(String delivery_fee) {this.delivery_fee = delivery_fee;}
	
	public String getRecipient_name() {return recipient_name;}
	public void setRecipient_name(String recipient_name) {this.recipient_name = recipient_name;}
	
	public String getRecipient_address() {return recipient_address;}
	public void setRecipient_address(String recipient_address) {this.recipient_address = recipient_address;}
	
	public String getRecipient_phone() {return recipient_phone;}
	public void setRecipient_phone(String recipient_phone) {this.recipient_phone = recipient_phone;}
	
	public String getDelivery_request() {return delivery_request;}
	public void setDelivery_request(String delivery_request) {this.delivery_request = delivery_request;}
	
	public String getPay_method() {return pay_method;}
	public void setPay_method(String pay_method) {this.pay_method = pay_method;}	
}
