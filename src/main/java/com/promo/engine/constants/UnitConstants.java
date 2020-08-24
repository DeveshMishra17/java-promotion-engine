package com.promo.engine.constants;

import java.util.LinkedHashMap;
import java.util.Map;

import com.promo.engine.model.CombinedPromoOffer;
import com.promo.engine.model.SinglePromoOffer;

public class UnitConstants {
    
    public static String ITEM_A="A";
    
    public static String ITEM_B="B";
    
    public static String ITEM_C="C";
    
    public static String ITEM_D="D";
    
    public static String PROMO_1="Promo1";
    
    public static final Map<String, Integer> ITEM_PRICE_MAP;
    static {
        ITEM_PRICE_MAP = new LinkedHashMap<String, Integer>();
        ITEM_PRICE_MAP.put(ITEM_A, 50);
        ITEM_PRICE_MAP.put(ITEM_B, 30);
        ITEM_PRICE_MAP.put(ITEM_C, 20);
        ITEM_PRICE_MAP.put(ITEM_D, 15);

    }

    public static final Map<String, SinglePromoOffer> SINGLE_ACTIVE_OFFER;
    static {
        SINGLE_ACTIVE_OFFER = new LinkedHashMap<String, SinglePromoOffer>();
        SINGLE_ACTIVE_OFFER.put(ITEM_A, SinglePromoOffer.builder().item(ITEM_A).quantity(3).offerPrice(130).build());
        SINGLE_ACTIVE_OFFER.put(ITEM_B, SinglePromoOffer.builder().item(ITEM_B).quantity(2).offerPrice(45).build());

    }

    public static final Map<String, CombinedPromoOffer> COMBINED_PROMO_OFFER;
    static {
        COMBINED_PROMO_OFFER = new LinkedHashMap<String, CombinedPromoOffer>();
        COMBINED_PROMO_OFFER.put(PROMO_1,
                CombinedPromoOffer.builder().firstItem(ITEM_C).secondItem(ITEM_D).finalPrice(30).build());

    }

}
