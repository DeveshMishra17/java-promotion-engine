package com.promo.engine.constants;

import java.util.LinkedHashMap;
import java.util.Map;

import com.promo.engine.model.CombinedPromoOffer;
import com.promo.engine.model.SinglePromoOffer;

public class UnitConstants {

    public static final Map<String, Integer> ITEM_PRICE_MAP;
    static {
        ITEM_PRICE_MAP = new LinkedHashMap<String, Integer>();
        ITEM_PRICE_MAP.put("A", 50);
        ITEM_PRICE_MAP.put("B", 30);
        ITEM_PRICE_MAP.put("C", 20);
        ITEM_PRICE_MAP.put("D", 15);

    }

    public static final Map<String, SinglePromoOffer> SINGLE_ACTIVE_OFFER;
    static {
        SINGLE_ACTIVE_OFFER = new LinkedHashMap<String, SinglePromoOffer>();
        SINGLE_ACTIVE_OFFER.put("A", SinglePromoOffer.builder().item("A").quantity(3).offerPrice(130).build());
        SINGLE_ACTIVE_OFFER.put("B", SinglePromoOffer.builder().item("B").quantity(2).offerPrice(45).build());

    }

    public static final Map<String, CombinedPromoOffer> COMBINED_PROMO_OFFER;
    static {
        COMBINED_PROMO_OFFER = new LinkedHashMap<String, CombinedPromoOffer>();
        COMBINED_PROMO_OFFER.put("Promo1",
                CombinedPromoOffer.builder().firstItem("C").secondItem("D").finalPrice(30).build());

    }

}
