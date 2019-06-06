package com.shop.shop;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.shop.shop.services.DiscountService;


@RunWith(SpringRunner.class)
@WebMvcTest
public class ShopApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private DiscountService discountService;

//    @MockBean
//    private StockService stockService;

    @Test
    public void findAll() throws Exception {
    

        // when + then
        this.mockMvc.perform(get("/discount/get-disount/123"))
                .andExpect(status().isOk());
               // .andExpect(content().json("{'billNo':'123','billAmount':1000.0,'discountPercentage':0.0,'discount':300.0}"));
    }

}
