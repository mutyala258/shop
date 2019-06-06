package com.shop.shop.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shop.shop.models.Bill;
import com.shop.shop.services.DiscountService;

// http://localhost:8080/discount/get-disount/123

@RestController
@RequestMapping("/discount")
public class DiscountResource {

	@Autowired
	DiscountService discountService;

	@RequestMapping(method = RequestMethod.GET, path = "/get-disount/{billNumber}")
	public @ResponseBody Bill currenttask(@PathVariable String billNumber) {

		Bill bill = null;
		try {

			bill = discountService.getDiscount(billNumber);

			return bill;
		} catch (Exception exception) {
			return bill; //

		}
	}

}
