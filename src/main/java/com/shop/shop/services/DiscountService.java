package com.shop.shop.services;

import org.springframework.stereotype.Service;

import com.shop.shop.models.Bill;
import com.shop.shop.models.User;

@Service
public class DiscountService {

	public Bill getDiscount(String billNumber) {
		
		//Based on bill number get user id from db
		
		User user = new User(); //based on useid get user type.
		user.setUserType("EMPLOYEE"); //assume that this will come from db
		
		//based on bill number get bill detail from db
		Bill bill = new Bill("123", 1000, 0, 0); 
		bill.setBillAmount(1000);
		
		
		//based on user tyep give discount
		if(user.getUserType().equals("EMPLOYEE")) {
			bill.setDiscount(30);
			double discount = bill.getBillAmount() * bill.getDiscount() / 100;
			
			bill.setDiscount(discount);
			
		}
		//if it is other type of employee calculate accordingly
		
		
		return bill;
	}

}
