package com.promo.engine.service;

import java.util.Map;

public interface PromoService {

    /*
     * Provide final price based on the cart items after applying active promos
     * @param Map cartItem cart item and count
     * @return int final price calculated
     */
    int calculateFinalPrice(Map<String, Integer> cartItem);

}
