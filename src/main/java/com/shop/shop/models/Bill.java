package com.shop.shop.models;

import org.springframework.stereotype.Component;

/**
 * This class will have bill information
 * @author adi
 *
 */
@Component
public class Bill {
	
	public Bill(String billNo, double billAmount, double discountPercentage, double discount) {
		super();
		this.billNo = billNo;
		this.billAmount = billAmount;
		this.discountPercentage = discountPercentage;
		this.discount = discount;
	}
	private String billNo;
	private double billAmount;
	private double discountPercentage;
	private double discount;
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	

}
