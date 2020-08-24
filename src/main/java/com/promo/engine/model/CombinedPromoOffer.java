package com.promo.engine.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CombinedPromoOffer {

    private String firstItem;

    private String secondItem;

    private int finalPrice;

}
