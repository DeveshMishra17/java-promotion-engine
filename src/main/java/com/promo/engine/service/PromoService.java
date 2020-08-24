package com.promo.engine.service;

import java.util.Map;

public interface PromoService {
    
  int calculateFinalPrice(Map<String,Integer> cartItem);

}
