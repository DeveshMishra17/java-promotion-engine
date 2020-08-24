package com.promo.engine.service.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.promo.engine.service.PromoService;
import com.promo.engine.service.PromoServiceImpl;

public class AppTest {
    Map<String, Integer> itemCart1 = new HashMap<>();
    
    Map<String, Integer> itemCart2 = new HashMap<>();
    
    Map<String, Integer> itemCart3 = new HashMap<>();
    
    PromoService promoEngine = new PromoServiceImpl();
    

    @Before
    public void init() {
       
        itemCart1.put("A", 1);
        itemCart1.put("B", 1);
        itemCart1.put("C", 1);
        itemCart1.put("D", 0);

       
        itemCart2.put("A", 5);
        itemCart2.put("B", 5);
        itemCart2.put("C", 1);
        itemCart2.put("D", 0);
        
     
        itemCart3.put("A", 3);
        itemCart3.put("B", 5);
        itemCart3.put("C", 1);
        itemCart3.put("D", 1);
    }

    @Test
    public void testSinglePromo() {
       int finalPrice= promoEngine.calculateFinalPrice(itemCart1);
       assertEquals(100, finalPrice);
    }

    @Test
    public void testSinglePromo1() {
        int finalPrice=promoEngine.calculateFinalPrice(itemCart2);
        assertEquals(370, finalPrice);
    }
    
    @Test
    public void testSingleCombinePromo() {
        int finalPrice=promoEngine.calculateFinalPrice(itemCart3);
        assertEquals(280, finalPrice);
    }

}