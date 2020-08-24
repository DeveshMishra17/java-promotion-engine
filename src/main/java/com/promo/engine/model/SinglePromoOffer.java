package com.promo.engine.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SinglePromoOffer {
    
    private String item;
    
    private int quantity;
    
    private int offerPrice;

}
